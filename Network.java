import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class Network extends JFrame{
	private JLabel device_ip=new JLabel("Device ip-address:");
	private JTextField device_ip_txt=new JTextField(15);
	private JLabel device_mac=new JLabel("Device mac-address:");
	private JTextField device_mac_txt=new JTextField(17);
	private JLabel device_model=new JLabel("Device model:");
	private JTextField device_model_txt=new JTextField(8);
	private JLabel device_manf=new JLabel("Device Manufacturer:");
	private JTextField device_manf_txt=new JTextField(10);
	private JLabel device_inst=new JLabel("Installation date:");
	private JTextField device_inst_txt=new JTextField(10);
	private JLabel device_warr=new JLabel("Warranty period:");
	private JTextField device_warr_txt=new JTextField(4);
	private JLabel device_last=new JLabel("Last serviced on:");
	private JTextField device_last_txt=new JTextField(10);
	private JLabel device_lastby=new JLabel("Serviced by:");
	private JTextField device_lastby_txt=new JTextField(20);
	private JLabel device_lastser=new JLabel("Service done:");
	private JTextField device_lastser_txt=new JTextField(20);
	private JButton submit=new JButton("Submit");
	private JButton modify=new JButton("Modify");
	private JButton delete=new JButton("Delete");
	private JMenuBar menubar=new JMenuBar();
	/*private JMenu ipm=new JMenu("Ip-Links");*/
	private JButton close=new JButton("close");
	private JButton about=new JButton("About");
	private Panel p1,p2,p3,c1,c2,c3,c4,c5,c6,c7;
	
	public Network()
	{
		c1=new Panel();
		c2=new Panel();
		c3=new Panel();
		c4=new Panel();
		c5=new Panel();
		c6=new Panel();
		c7=new Panel();
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		setTitle("College network hardware");
		setSize(700,600);
		setVisible(true);
		setLayout(new GridLayout(10,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	/*	menubar.add(ipm);
	*/	menubar.add(about);
		menubar.add(close);
		setJMenuBar(menubar);
		p1.add(device_ip);
		p1.add(device_ip_txt);
		p2.add(device_mac);
		p2.add(device_mac_txt);
		p3.add(device_model);
		p3.add(device_model_txt);
		
		c1.add(device_manf);
		c1.add(device_manf_txt);
		c2.add(device_inst);
		c2.add(device_inst_txt);
		c3.add(device_warr);
		c3.add(device_warr_txt);
		c4.add(device_last);
		c4.add(device_last_txt);
		c5.add(device_lastby);
		c5.add(device_lastby_txt);
		c6.add(device_lastser);
		c6.add(device_lastser_txt);
		c7.add(submit);
		c7.add(modify);
		c7.add(delete);
		add(p1);add(p2);add(p3);add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);
		try{
		Class.forName("oracle.jdbc.OracleDriver");
			Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
		}
		catch(SQLException e){System.out.println(e);}
	catch(Exception ex){System.out.println(ex);}
			
		/*am.addMenuListener(new MenuListener(){
			public void menuSelected(MenuEvent e){
				JOptionPane.showMessageDialog(Network.this,"The database is designed to store information about network hardware connections.\n It maintains a comprehensive record of the various devices and their connections within the network infrastructure, including switches, routers, servers, and storage devices.\n The database also tracks configuration details, such as IP addresses, VLAN assignments, and port mappings, to ensure accurate and up-to-date documentation of the network topology.\n With this information, network administrators can quickly troubleshoot connectivity issues, plan for network expansion, and optimize performance.","Project Information",JOptionPane.INFORMATION_MESSAGE);
			}
			public void menuCanceled(MenuEvent e){}
			public void menuDeselected(MenuEvent e){}
		});*/
		submit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){			
			try{
				Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
				String sql = "INSERT INTO all_table (mac_address, ip_address, model, manufacturer, installation_date, warranty_period, serviced_by, date_of_service, type_of_service) " +
             "VALUES ('" + device_mac_txt.getText() + "', '" + device_ip_txt.getText() + "', '" + device_model_txt.getText() + "', '" + device_manf_txt.getText() + "', '" + device_inst_txt.getText() + "', '" + device_warr_txt.getText() + "', '" + device_lastby_txt.getText() + "', '" + device_last_txt.getText() + "', '" + device_lastser_txt.getText() + "')";

			stmt.executeUpdate(sql);

				//conn.commit();
			}
			catch(SQLException sqle)
			{
				System.out.println("Could not insert tuple"+sqle);
			}
			
	catch(Exception ex){System.out.println(ex);}
			}
		});
		modify.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			try{
				Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
			String sql = "UPDATE all_table SET " +
             "ip_address = '" + device_ip_txt.getText() + "', " +
             "model = '" + device_model_txt.getText() + "', " +
             "manufacturer = '" + device_manf_txt.getText() + "', " +
             "installation_date = '" + device_inst_txt.getText() + "', " +
             "warranty_period = '" + device_warr_txt.getText() + "', " +
             "serviced_by = '" + device_lastby_txt.getText() + "', " +
             "date_of_service = '" + device_last_txt.getText() + "', " +
             "type_of_service = '" + device_lastser_txt.getText() + "' " +
             "WHERE mac_address = '" + device_mac_txt.getText() + "'";

stmt.executeUpdate(sql);

				//conn.commit();
			}
			catch(SQLException sqle)
			{
				System.out.println("Could not update tuple"+sqle);
			}
			
	catch(Exception ex){System.out.println(ex);}
			}
		});
		delete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			try{
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:Ven063", "venkat", "dbmsra");
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM all_table WHERE mac_address='" + device_mac_txt.getText() + "'";
            stmt.executeUpdate(sql);
            conn.close();
			}
			catch(SQLException sqle)
			{
				System.out.println("Could not delete tuple"+sqle);
			}
	catch(Exception ex){System.out.println(ex);}
			}
		});
		try{Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
			conn.close();
	}catch(SQLException e){System.out.println(e);}
	catch(Exception ex){System.out.println(ex);}
	close.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				try{Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
			conn.commit();
			conn.close();
	}catch(SQLException ep){System.out.println(ep);}
	catch(Exception ex){System.out.println(ex);}
			System.exit(0);
			}
		});
	about.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(Network.this,"The database is designed to store information about network hardware connections.\n It maintains a comprehensive record of the various devices and their connections within the network infrastructure, including switches, routers, servers, and storage devices.\n The database also tracks configuration details, such as IP addresses, VLAN assignments, and port mappings, to ensure accurate and up-to-date documentation of the network topology.\n With this information, network administrators can quickly troubleshoot connectivity issues, plan for network expansion, and optimize performance.","Project Information",JOptionPane.INFORMATION_MESSAGE);}
			
		});
	
}
public static void main(String args[]){
	SwingUtilities.invokeLater(new Runnable(){// Run the GUI  in the Event-Dispatching thread for thread-safety
		public void run(){new Network();}
		});
}
} 
