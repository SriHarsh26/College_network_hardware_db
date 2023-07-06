import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import java.sql.*;


@SuppressWarnings("serial")
public class Network extends JFrame {
    private JPanel contentPanel,masterPanel1,masterPanel2,masterPanel3,masterPanel4,masterPanel5;
    private JPanel panel1, panel2, panel3, panel4, panel5,panelt1,panelt2,panelt3,panelt4,panelt5;
   // private JMenu arr, menu2, menu3, menu4, menu5;
       private JLabel device_ip = new JLabel("Device ip-address:");
    private JTextField device_ip_txt = new JTextField(15);
	 private JLabel user_ip = new JLabel("Device ip-address:");
    private JTextField user_ip_txt = new JTextField(15);
	private JLabel user_id = new JLabel("User id:");
    private JTextField user_id_txt = new JTextField(15);
    private JLabel device_mac = new JLabel("Device mac-address:");
    private JTextField device_mac_txt = new JTextField(17);
	    private JLabel device_macs = new JLabel("Device mac-address:");
    private JTextField device_macs_txt = new JTextField(17);
    private JLabel device_mac1 = new JLabel("Device mac-address:");
    private JTextField device_mac1_txt = new JTextField(17);	
    private JLabel device_model = new JLabel("Device model:");
    private JTextField device_model_txt = new JTextField(8);
	private JLabel device_lastby=new JLabel("Serviced by:");
	private JTextField device_lastby_txt=new JTextField(20);
	private JLabel device_lastser=new JLabel("Service done:");
	private JLabel device_last=new JLabel("Last serviced on:");
	private JTextField device_last_txt=new JTextField(10);
	private JTextField device_lastser_txt=new JTextField(20);
	private JLabel dept = new JLabel("Department:");
    private JTextField dept_txt = new JTextField(15);
    private JLabel device_manf = new JLabel("Device Manufacturer:");
    private JTextField device_manf_txt = new JTextField(10);
    private JLabel device_exp = new JLabel("Expiration date:");
    private JTextField device_exp_txt = new JTextField(10);
    private JLabel device_inst = new JLabel("Installation date:");
    private JTextField device_inst_txt = new JTextField(10);
    private JLabel device_warr = new JLabel("Warranty period:");
    private JTextField device_warr_txt = new JTextField(4);
    private JLabel device_fromip = new JLabel("Device From ip-address:");
    private JTextField device_fromip_txt = new JTextField(15);
    private JLabel device_toip = new JLabel("Device To ip-address:");
    private JTextField device_toip_txt = new JTextField(15);
	private JButton submit1=new JButton("Submit");
	private JButton modify1=new JButton("Modify");
	private JButton delete1=new JButton("Delete");
		private JButton submit2=new JButton("Submit");
	private JButton modify2=new JButton("Modify");
	private JButton delete2=new JButton("Delete");
		private JButton submit3=new JButton("Submit");
	private JButton modify3=new JButton("Modify");
	private JButton delete3=new JButton("Delete");
		private JButton submit4=new JButton("Submit");
	private JButton modify4=new JButton("Modify");
	private JButton delete4=new JButton("Delete");
		private JButton submit5=new JButton("Submit");
	private JButton modify5=new JButton("Modify");
	private JButton delete5=new JButton("Delete");
	private JTable text1,text2,text3,text4,text5;
	private JMenu menu1,menu2,menu3,menu4,menu5;
	private JButton refresh1=new JButton("Refresh");
	private JButton refresh2=new JButton("Refresh");
	private JButton refresh3=new JButton("Refresh");
	private JButton refresh4=new JButton("Refresh");
	private JButton refresh5=new JButton("Refresh");
	
	
	//private updateRecord(String s){}

    public Network() {
        // Set up the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(870, 400);
        setTitle("Network Management System");

        // Create the content panel with CardLayout
        masterPanel1=new JPanel(new GridLayout(1,2));
		masterPanel2=new JPanel(new GridLayout(1,2));
		masterPanel3=new JPanel(new GridLayout(1,2));
		masterPanel4=new JPanel(new GridLayout(1,2));
		masterPanel5=new JPanel(new GridLayout(1,2));
        contentPanel = new JPanel(new CardLayout());

        // Create the panels
        panelt1=new JPanel();
		panelt2=new JPanel();
		panelt3=new JPanel();
		panelt4=new JPanel();
		panelt5=new JPanel();
		panelt1.setLayout(new BorderLayout());
		panelt2.setLayout(new BorderLayout());
		panelt3.setLayout(new BorderLayout());
		panelt4.setLayout(new BorderLayout());
		panelt5.setLayout(new BorderLayout());

        panel1 = new JPanel();
		panel1.setLayout(new GridLayout(5,1)); 
        panel2 = new JPanel();
		panel2.setLayout(new GridLayout(5,1)); 
        panel3 = new JPanel();
		panel3.setLayout(new GridLayout(3,1));
        panel4 = new JPanel();
		panel4.setLayout(new GridLayout(4,1));
        panel5 = new JPanel();
		panel5.setLayout(new GridLayout(5,1));
       
		// Add components to the panel1
		JPanel pnl1 = new JPanel();
        JPanel pnl2 = new JPanel();
        JPanel pnl3 = new JPanel();
        JPanel pnl4 = new JPanel();
		JPanel c1 = new JPanel();
		JPanel c2 = new JPanel();
		JPanel c3 = new JPanel();
		JPanel c4 = new JPanel();
		JPanel c5 = new JPanel();
		c1.add(submit1);
		c1.add(delete1);
		c1.add(modify1);
		c2.add(submit2);
		c2.add(delete2);
		c2.add(modify2);
		c3.add(submit3);
		c3.add(delete3);
		c3.add(modify3);
		c4.add(submit4);
		c4.add(delete4);
		c4.add(modify4);
		c5.add(submit5);
		c5.add(delete5);
		c5.add(modify5);
        pnl2.add(device_mac1);
        pnl2.add(device_mac1_txt);
        pnl1.add(device_ip);
        pnl1.add(device_ip_txt);
        pnl3.add(device_model);
        pnl3.add(device_model_txt);
        pnl4.add(device_manf);
        pnl4.add(device_manf_txt);
        panel1.add(pnl1);
        panel1.add(pnl2);
        panel1.add(pnl3);
        panel1.add(pnl4);
		panel1.add(c1);
		// Add components to the panel2
		JPanel pnl5 = new JPanel();
        JPanel pnl6 = new JPanel();
        JPanel pnl7 = new JPanel();
        JPanel pnl8 = new JPanel();
        pnl5.add(device_mac);
        pnl5.add(device_mac_txt);
        pnl6.add(device_exp);
        pnl6.add(device_exp_txt);
        pnl7.add(device_inst);
        pnl7.add(device_inst_txt);
        pnl8.add(device_warr);
        pnl8.add(device_warr_txt);
        panel2.add(pnl5);
        panel2.add(pnl6);
        panel2.add(pnl7);
        panel2.add(pnl8);
		panel2.add(c2);	
		// Add components to the panel3	
		JPanel pnl9 = new JPanel();
        JPanel pnl10 = new JPanel();
        pnl9.add(device_fromip);
        pnl9.add(device_fromip_txt);
        pnl10.add(device_toip);
        pnl10.add(device_toip_txt);
        panel3.add(pnl9);
        panel3.add(pnl10);
			panel3.add(c3);
		// Add components to the panel4	
		JPanel pnl11 = new JPanel();
        JPanel pnl12 = new JPanel();
		JPanel pnl13 = new JPanel();
		pnl11.add(user_ip);
		pnl11.add(user_ip_txt);
		pnl12.add(user_id);
		pnl12.add(user_id_txt);
		pnl13.add(dept);
		pnl13.add(dept_txt);
		panel4.add(pnl11);
		panel4.add(pnl12);
		panel4.add(pnl13);
		panel4.add(c4);	
		// Add components to the panel5	
		JPanel pnl14 = new JPanel();
        JPanel pnl15 = new JPanel();
		JPanel pnl16 = new JPanel();
		JPanel pnl17 = new JPanel();
		pnl14.add(device_macs);
		pnl14.add(device_macs_txt);
		pnl15.add(device_lastby);
		pnl15.add(device_lastby_txt);
		pnl16.add(device_last);
		pnl16.add(device_last_txt);
		pnl17.add(device_lastser);
		pnl17.add(device_lastser_txt);
		panel5.add(pnl14);
		panel5.add(pnl15);
		panel5.add(pnl16);
		panel5.add(pnl17);
		panel5.add(c5);	
    //create tables and models for each database table
		DefaultTableModel model1 = displayTableContents("device");
		JTable table1 = new JTable(model1);
		DefaultTableModel model2 = displayTableContents("warranty");
		JTable table2 = new JTable(model2);
		DefaultTableModel model3 = displayTableContents("connection");
		JTable table3 = new JTable(model3);
		DefaultTableModel model4 = displayTableContents("users");
		JTable table4 = new JTable(model4);
		DefaultTableModel model5 = displayTableContents("services");
		JTable table5 = new JTable(model5);
		JScrollPane scrollPane1 = new JScrollPane(table1);
		JScrollPane scrollPane2 = new JScrollPane(table2);
		JScrollPane scrollPane3 = new JScrollPane(table3);
		JScrollPane scrollPane4 = new JScrollPane(table4);
		JScrollPane scrollPane5 = new JScrollPane(table5);
		//panelt1.add(table1);
		panelt1.add(scrollPane1,BorderLayout.CENTER);
		panelt1.add(refresh1,BorderLayout.SOUTH);
		//panelt2.add(table2);
		panelt2.add(scrollPane2,BorderLayout.CENTER);
		panelt2.add(refresh2,BorderLayout.SOUTH);
		//panelt3.add(table3);
		panelt3.add(scrollPane3,BorderLayout.CENTER);
		panelt3.add(refresh3,BorderLayout.SOUTH);
		//panelt4.add(table4);
		panelt4.add(scrollPane4,BorderLayout.CENTER);
		panelt4.add(refresh4,BorderLayout.SOUTH);
		//panelt5.add(table5);
		panelt5.add(scrollPane5,BorderLayout.CENTER);
		panelt5.add(refresh5,BorderLayout.SOUTH);
		masterPanel1.add(panel1);masterPanel1.add(panelt1);
		masterPanel2.add(panel2);masterPanel2.add(panelt2);
		masterPanel3.add(panel3);masterPanel3.add(panelt3);
		masterPanel4.add(panel4);masterPanel4.add(panelt4);
		masterPanel5.add(panel5);masterPanel5.add(panelt5);
        // Add the panels to the content panel
        contentPanel.add(masterPanel1, "Panel-d");
        contentPanel.add(masterPanel2, "Panel-w");
        contentPanel.add(masterPanel3, "Panel-c");
        contentPanel.add(masterPanel4, "Panel-u");
        contentPanel.add(masterPanel5, "Panel-s");
 

        // Create the menu items
        JMenu menu1 = new JMenu("Device");
        JMenu menu2 = new JMenu("Warranty");
        JMenu menu3 = new JMenu("Connections");
        JMenu menu4 = new JMenu("Users");
        JMenu menu5 = new JMenu("Service");
		JMenu menu6 = new JMenu("About");



        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        // Add the menus to the menu bar
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);
        menuBar.add(menu4);
        menuBar.add(menu5);
		menuBar.add(menu6);
        // Set the menu bar to the JFrame
        setJMenuBar(menuBar);

        // Add MenuListener to the menu items
        menu1.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
                CardLayout cardLayout = (CardLayout) contentPanel.getLayout();
                cardLayout.show(contentPanel, "Panel-d");
            }

            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }
        });

        menu2.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
                CardLayout cardLayout = (CardLayout) contentPanel.getLayout();
                cardLayout.show(contentPanel, "Panel-w");
            }

            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }
        });

        menu3.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
                CardLayout cardLayout = (CardLayout) contentPanel.getLayout();
                cardLayout.show(contentPanel, "Panel-c");
            }

            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }
        });

        menu4.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
                CardLayout cardLayout = (CardLayout) contentPanel.getLayout();
                cardLayout.show(contentPanel, "Panel-u");
            }

            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }
        });

        menu5.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
                CardLayout cardLayout = (CardLayout) contentPanel.getLayout();
                cardLayout.show(contentPanel, "Panel-s");
            }

            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }
        });
		menu6.addMenuListener(new MenuListener() {
            public void menuSelected(MenuEvent e) {
             JOptionPane.showMessageDialog(Network.this,"The database is designed to store information about network hardware connections.\n It maintains a comprehensive record of the various devices and their connections within the network infrastructure, including switches, routers, servers, and storage devices.\n The database also tracks configuration details, such as IP addresses, VLAN assignments, and port mappings, to ensure accurate and up-to-date documentation of the network topology.\n With this information, network administrators can quickly troubleshoot connectivity issues, plan for network expansion, and optimize performance.","Project Information",JOptionPane.INFORMATION_MESSAGE);
            }

            public void menuCanceled(MenuEvent e) {
            }

            public void menuDeselected(MenuEvent e) {
            }
        });
			try{
		Class.forName("oracle.jdbc.OracleDriver");
		}
		//catch(SQLException e){System.out.println(e);}
	catch(Exception ex){System.out.println(ex);}
		submit1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){			
			try{
				Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
				String sql = "INSERT INTO device (mac_address, ip_address, model, manufacturer) " +
             "VALUES ('" + device_mac1_txt.getText() + "', '" + device_ip_txt.getText() + "', '" + device_model_txt.getText() + "', '" + device_manf_txt.getText()+"')"; 
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(Network.this,"New record inserted into device table","Insertion status",JOptionPane.INFORMATION_MESSAGE);
				//conn.commit();
			}
			catch(SQLException sqle)
			{
				JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+sqle,"Insertion status",JOptionPane.ERROR_MESSAGE);
			}
			
	catch(Exception ex){JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+ex,"Insertion status",JOptionPane.ERROR_MESSAGE);}
			}
		});
		modify1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			try{
				if (table1.isEditing()) {
	                table1.getCellEditor().stopCellEditing(); // Stop cell editing and commit changes
	            }
				Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
			 int[] selectedRows = table1.getSelectedRows(); // Get selected rows
	            if (selectedRows.length == 0) {
	                JOptionPane.showMessageDialog(Network.this, "No rows selected", "Update Error", JOptionPane.WARNING_MESSAGE);
	                return; // Return if no rows are selected
	            }

	            for (int row : selectedRows) {
	                String mac = table1.getValueAt(row, 0).toString();
	                String IP= table1.getValueAt(row, 1).toString();
	                String model= table1.getValueAt(row, 2).toString();
	                String manf= table1.getValueAt(row, 3).toString();
	                // Debug print statements
	                System.out.println("mac: " + mac);
	                System.out.println("IP: " + IP);
	                System.out.println("model: " + model);
	                System.out.println("manf: " + manf);
	                String sql = "UPDATE device SET " +
	                        "mac_address = '" + mac + "', " +
	                        "ip_address = '" + IP + "',  "+
	                        "model = '" + model + "',  "+
	                        "manufacturer = '" + manf + "'  "+
	                        "WHERE mac_address = '" + mac + "' ";

	                int no = stmt.executeUpdate(sql);
	                //conn.commit();
			if(no>0){
			JOptionPane.showMessageDialog(Network.this,"Record Modified successfully","Updation status",JOptionPane.INFORMATION_MESSAGE);}
		else {
                JOptionPane.showMessageDialog(Network.this, "No record found matching the MAC address: " + device_mac_txt.getText(), "Updation status", JOptionPane.WARNING_MESSAGE);
            }
	            }
			conn.close();
			}
			catch(SQLException sqle)
			{
				JOptionPane.showMessageDialog(Network.this,"Could not update tuple:"+sqle,"Updation status",JOptionPane.ERROR_MESSAGE);
			}
			
	catch(Exception ex){JOptionPane.showMessageDialog(Network.this,"Could not update tuple:"+ex,"Updation status",JOptionPane.ERROR_MESSAGE);}
			}
		});
		delete1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063", "venkat", "dbmsra");
            Statement stmt = conn.createStatement();
            String macAddress = device_mac1_txt.getText();
            String sql = "DELETE FROM device WHERE mac_address='" + macAddress + "'";
            int rowsAffected = stmt.executeUpdate(sql);
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(Network.this, "Record deleted successfully", "Deletion status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(Network.this, "No record found matching the MAC address: " + macAddress, "Deletion status", JOptionPane.WARNING_MESSAGE);
            }
            
            conn.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + sqle.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + ex.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
        }
    }
});
		submit2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){			
			try{
				Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
				String sql = "INSERT INTO warranty (mac_address, expiry_date, installation_date, warranty_period) " +
             "VALUES ('" + device_mac_txt.getText() + "', '" + device_exp_txt.getText() + "', '" + device_inst_txt.getText() + "', '" + device_warr_txt.getText()+"')"; 
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(Network.this,"New record inserted into warranty table","Insertion status",JOptionPane.INFORMATION_MESSAGE);
				//conn.commit();
			}
			catch(SQLException sqle)
			{
				JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+sqle,"Insertion status",JOptionPane.ERROR_MESSAGE);
			}
			
	catch(Exception ex){JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+ex,"Insertion status",JOptionPane.ERROR_MESSAGE);}
			}
		});
		modify2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            if (table2.isEditing()) {
		                table2.getCellEditor().stopCellEditing(); // Stop cell editing and commit changes
		            }
		            
		            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063", "venkat", "dbmsra");
		            Statement stmt = conn.createStatement();
		            int[] selectedRows = table2.getSelectedRows(); // Get selected rows
		            if (selectedRows.length == 0) {
		                JOptionPane.showMessageDialog(Network.this, "No rows selected", "Update Error", JOptionPane.WARNING_MESSAGE);
		                return; // Return if no rows are selected
		            }

		            for (int row : selectedRows) {
		                String mac = table2.getValueAt(row, 0).toString();
		                String epd = table2.getValueAt(row, 1).toString();
		                String isd = table2.getValueAt(row, 2).toString();
		                int wp = Integer.parseInt(table2.getValueAt(row, 3).toString());
		                
		                // Format date values as per the expected format in the SQL statement
		                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		                String formattedEpd = dateFormat.format(dateFormat.parse(epd));
		                String formattedIsd = dateFormat.format(dateFormat.parse(isd));

		                String sql = "UPDATE warranty SET " +
		                        "EXPIRY_DATE = TO_DATE('" + formattedEpd + "', 'YYYY-MM-DD'), " +
		                        "INSTALLATION_DATE = TO_DATE('" + formattedIsd + "', 'YYYY-MM-DD'), " +
		                        "WARRANTY_PERIOD = " + wp +
		                        " WHERE MAC_ADDRESS = '" + mac + "'";

		                int no = stmt.executeUpdate(sql);
		                //conn.commit();
		                if (no > 0) {
		                    JOptionPane.showMessageDialog(Network.this, "Record Modified successfully", "Updation status", JOptionPane.INFORMATION_MESSAGE);
		                } else {
		                    JOptionPane.showMessageDialog(Network.this, "No record found matching the MAC address: " + device_mac_txt.getText(), "Updation status", JOptionPane.WARNING_MESSAGE);
		                }
		            }
		            conn.close();
		        } catch (SQLException sqle) {
		            JOptionPane.showMessageDialog(Network.this, "Could not update tuple:" + sqle, "Updation status", JOptionPane.ERROR_MESSAGE);
		        } catch (Exception ex) {
		            JOptionPane.showMessageDialog(Network.this, "Could not update tuple:" + ex, "Updation status", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});

		delete2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063", "venkat", "dbmsra");
            Statement stmt = conn.createStatement();
            String macAddress = device_mac_txt.getText();
            String sql = "DELETE FROM warranty WHERE mac_address='" + macAddress + "'";
            int rowsAffected = stmt.executeUpdate(sql);
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(Network.this, "Record deleted successfully", "Deletion status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(Network.this, "No record found matching the MAC address: " + macAddress, "Deletion status", JOptionPane.WARNING_MESSAGE);
            }
            
            conn.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + sqle.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + ex.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
        }
    }
});
		submit3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){			
			try{
				Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
				String sql = "INSERT INTO connection (from_ip_address,to_ip_address ) " +
             "VALUES ('" + device_fromip_txt.getText() + "', '" + device_toip_txt.getText() +"')"; 
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(Network.this,"New record inserted into connection table","Insertion status",JOptionPane.INFORMATION_MESSAGE);
				//conn.commit();
			}
			catch(SQLException sqle)
			{
				JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+sqle,"Insertion status",JOptionPane.ERROR_MESSAGE);
			}
			
	catch(Exception ex){JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+ex,"Insertion status",JOptionPane.ERROR_MESSAGE);}
			}
		});
		modify3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
        	if (table3.isEditing()) {
                table3.getCellEditor().stopCellEditing(); // Stop cell editing and commit changes
            }
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063", "venkat", "dbmsra");
            Statement stmt = conn.createStatement();

            int[] selectedRows = table3.getSelectedRows(); // Get selected rows
            if (selectedRows.length == 0) {
                JOptionPane.showMessageDialog(Network.this, "No rows selected", "Update Error", JOptionPane.WARNING_MESSAGE);
                return; // Return if no rows are selected
            }

            for (int row : selectedRows) {
                String fromIP = table3.getValueAt(row, 0).toString();
                String toIP = table3.getValueAt(row, 1).toString();

                String sql = "UPDATE connection SET " +
                        "from_ip_address = '" + fromIP + "', " +
                        "to_ip_address = '" + toIP + "' "+
                        "WHERE cid = '" + row + "' and from_ip_address='" + fromIP + "'";

                int no = stmt.executeUpdate(sql);
                if (no > 0) {
                    JOptionPane.showMessageDialog(Network.this, "Record modified successfully", "Updation status", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Network.this, "No record found matching the From IP address: " + fromIP, "Updation status", JOptionPane.WARNING_MESSAGE);
                }
            }
            conn.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(Network.this, "Could not update tuple: " + sqle, "Updation status", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(Network.this, "Could not update tuple: " + ex, "Updation status", JOptionPane.ERROR_MESSAGE);
        }
    }
    
});

		delete3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063", "venkat", "dbmsra");
            Statement stmt = conn.createStatement();
            String fipAddress = device_fromip_txt.getText();
            String sql = "DELETE FROM connection WHERE from_ip_address='" + fipAddress + "'";
            int rowsAffected = stmt.executeUpdate(sql);
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(Network.this, "Record deleted successfully", "Deletion status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(Network.this, "No record found matching the From ip-address: " + fipAddress, "Deletion status", JOptionPane.WARNING_MESSAGE);
            }
            
            conn.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + sqle.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + ex.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
        }
    }
});		
		submit4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){			
			try{
				Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
				String sql = "INSERT INTO users (ip_address,user_id,department) " +
             "VALUES ('" + user_ip_txt.getText() + "', '" + user_id_txt.getText()+ "', '"+dept_txt.getText() +"')"; 
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(Network.this,"New record inserted into user table","Insertion status",JOptionPane.INFORMATION_MESSAGE);
				//conn.commit();
			}
			catch(SQLException sqle)
			{
				JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+sqle,"Insertion status",JOptionPane.ERROR_MESSAGE);
			}
			
	catch(Exception ex){JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+ex,"Insertion status",JOptionPane.ERROR_MESSAGE);}
			}
		});
		modify4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			try{
				if (table4.isEditing()) {
	                table4.getCellEditor().stopCellEditing(); // Stop cell editing and commit changes
	            }
				Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
			 int[] selectedRows = table4.getSelectedRows(); // Get selected rows
	            if (selectedRows.length == 0) {
	                JOptionPane.showMessageDialog(Network.this, "No rows selected", "Update Error", JOptionPane.WARNING_MESSAGE);
	                return; // Return if no rows are selected
	            }

	            for (int row : selectedRows) {
	                String IP = table4.getValueAt(row, 0).toString();
	                String uid= table4.getValueAt(row, 1).toString();
	                String dept= table4.getValueAt(row, 2).toString();
	                //String manf= table1.getValueAt(row, 3).toString();
			String sql = "UPDATE users SET " +
             "ip_address = '" + IP + "', " +
			 "department = '" + dept + "', " +
             "user_id = '" + uid + "' "+
			 "WHERE ip_address='" + IP + "'";

			int no=stmt.executeUpdate(sql);
			if(no>0){
			JOptionPane.showMessageDialog(Network.this,"Record Modified successfully","Updation status",JOptionPane.INFORMATION_MESSAGE);}
		else {
                JOptionPane.showMessageDialog(Network.this, "No record found matching the  ip-address: " + user_ip_txt.getText(), "Updation status", JOptionPane.WARNING_MESSAGE);
            }
	            }
			conn.close();
			}
			catch(SQLException sqle)
			{
				JOptionPane.showMessageDialog(Network.this,"Could not update tuple:"+sqle,"Updation status",JOptionPane.ERROR_MESSAGE);
			}
			
	catch(Exception ex){JOptionPane.showMessageDialog(Network.this,"Could not update tuple:"+ex,"Updation status",JOptionPane.ERROR_MESSAGE);}
			}
		});
		delete4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063", "venkat", "dbmsra");
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM users WHERE ip_address='" + user_ip_txt.getText() + "'";
            int rowsAffected = stmt.executeUpdate(sql);
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(Network.this, "Record deleted successfully", "Deletion status", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(Network.this, "No record found matching the ip-address: " + user_ip_txt.getText(), "Deletion status", JOptionPane.WARNING_MESSAGE);
            }
            
            conn.close();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + sqle.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + ex.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
        }
    }
});	 
		submit5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){			
			try{
				Connection conn= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063","venkat","dbmsra");
			Statement stmt=conn.createStatement();
				String sql = "INSERT INTO service (mac_address,serviced_by,date_of_service,type_of_service) " +
             "VALUES ('" + device_macs_txt.getText() + "', '" + device_lastby_txt.getText()+ "', '"+device_last_txt.getText() +"', '"+device_lastser_txt.getText() +"')"; 
			stmt.executeUpdate(sql);
			JOptionPane.showMessageDialog(Network.this,"New record inserted into service table","Insertion status",JOptionPane.INFORMATION_MESSAGE);
				//conn.commit();
			}
			catch(SQLException sqle)
			{
				JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+sqle,"Insertion status",JOptionPane.ERROR_MESSAGE);
			}
			
	catch(Exception ex){JOptionPane.showMessageDialog(Network.this,"Could not insert tuple:"+ex,"Insertion status",JOptionPane.ERROR_MESSAGE);}
			}
		});
		modify5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            if (table5.isEditing()) {
		                table5.getCellEditor().stopCellEditing(); // Stop cell editing and commit changes
		            }
		            
		            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063", "venkat", "dbmsra");
		            Statement stmt = conn.createStatement();
		            int[] selectedRows = table5.getSelectedRows(); // Get selected rows
		            if (selectedRows.length == 0) {
		                JOptionPane.showMessageDialog(Network.this, "No rows selected", "Update Error", JOptionPane.WARNING_MESSAGE);
		                return; // Return if no rows are selected
		            }

		            for (int row : selectedRows) {
		                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		                String mac = table5.getValueAt(row, 0).toString();
		                String serby = table5.getValueAt(row, 1).toString();
		                String serd = table5.getValueAt(row, 2).toString();
		                String tpser = table5.getValueAt(row, 3).toString();
		                String formattedSerd = dateFormat.format(dateFormat.parse(serd));

		                String sql = "UPDATE service SET " +
		                        "serviced_by = '" + serby + "', " +
		                        "date_of_service = TO_DATE('" + formattedSerd + "', 'YYYY-MM-DD'), " +
		                        "type_of_service = '" + tpser + "' " +
		                        "WHERE mac_address = '" + mac + "'";

		                int no = stmt.executeUpdate(sql);
		                if (no > 0) {
		                    JOptionPane.showMessageDialog(Network.this, "Record Modified successfully", "Updation status", JOptionPane.INFORMATION_MESSAGE);
		                } else {
		                    JOptionPane.showMessageDialog(Network.this, "No record found matching the MAC address: " + device_macs_txt.getText(), "Updation status", JOptionPane.WARNING_MESSAGE);
		                }
		            }
		            conn.close();
		        } catch (SQLException sqle) {
		            JOptionPane.showMessageDialog(Network.this, "Could not update tuple:" + sqle, "Updation status", JOptionPane.ERROR_MESSAGE);
		        } catch (Exception ex) {
		            JOptionPane.showMessageDialog(Network.this, "Could not update tuple:" + ex, "Updation status", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		delete5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063", "venkat", "dbmsra");
		            Statement stmt = conn.createStatement();
		            String sql = "DELETE FROM service WHERE mac_address='" + device_macs_txt.getText() + "'";
		            int rowsAffected = stmt.executeUpdate(sql);
		            
		            if (rowsAffected > 0) {
		                JOptionPane.showMessageDialog(Network.this, "Record deleted successfully", "Deletion status", JOptionPane.INFORMATION_MESSAGE);
		            } else {
		                JOptionPane.showMessageDialog(Network.this, "No record found matching mac address: " + device_macs_txt.getText(), "Deletion status", JOptionPane.WARNING_MESSAGE);
		            }
		            
		            conn.close();
		        } catch (SQLException sqle) {
		            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + sqle.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
		        } catch (Exception ex) {
		            JOptionPane.showMessageDialog(Network.this, "Could not delete tuple: " + ex.getMessage(), "Deletion status", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		
		getContentPane().add(contentPanel);

        // Show the JFrame
        setVisible(true);
		setLocationRelativeTo(null);
    
    refresh1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        table1.setModel(displayTableContents("device"));
		//System.out.println(getSize());
    }
});

refresh2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        table2.setModel(displayTableContents("warranty"));
    }
});

refresh3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        table3.setModel(displayTableContents("connection"));
    }
});

refresh4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        table4.setModel(displayTableContents("users"));
    }
});

refresh5.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        table5.setModel(displayTableContents("service"));
    }
});
	}
private DefaultTableModel displayTableContents(String menuOption) {
    DefaultTableModel model = new DefaultTableModel();
    try {
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Ven063", "venkat", "dbmsra");
        Statement stmt = conn.createStatement();
        String query = "";

        switch (menuOption) {
            case "warranty":
                try {
                    query = "SELECT * FROM warranty";
                    ResultSet resultSet = stmt.executeQuery(query);
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    // Set column names
                    Vector<String> columnNames = new Vector<>();
                    for (int i = 1; i <= columnCount; i++) {
                        columnNames.add(metaData.getColumnName(i));
                    }
                    model.setColumnIdentifiers(columnNames);

                    // Set table data
                    while (resultSet.next()) {
                        Vector<String> rowData = new Vector<>();
                        for (int i = 1; i <= columnCount; i++) {
                            rowData.add(resultSet.getString(i));
                        }
                        model.addRow(rowData);
                    }

                    stmt.close();
                    return model;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return model;

            case "device":
                try {
                    query = "SELECT * FROM device";
                    ResultSet resultSet = stmt.executeQuery(query);
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    // Set column names
                    Vector<String> columnNames = new Vector<>();
                    for (int i = 1; i <= columnCount; i++) {
                        columnNames.add(metaData.getColumnName(i));
                    }
                    model.setColumnIdentifiers(columnNames);

                    // Set table data
                    while (resultSet.next()) {
                        Vector<String> rowData = new Vector<>();
                        for (int i = 1; i <= columnCount; i++) {
                            rowData.add(resultSet.getString(i));
                        }
                        model.addRow(rowData);
                    }

                    stmt.close();
                    return model;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return model;

            case "connection":
                try {
                    query = "SELECT * FROM connection";
                    ResultSet resultSet = stmt.executeQuery(query);
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    // Set column names
                    Vector<String> columnNames = new Vector<>();
                    for (int i = 1; i <= columnCount; i++) {
                        columnNames.add(metaData.getColumnName(i));
                    }
                    model.setColumnIdentifiers(columnNames);

                    // Set table data
                    while (resultSet.next()) {
                        Vector<String> rowData = new Vector<>();
                        for (int i = 1; i <= columnCount; i++) {
                            rowData.add(resultSet.getString(i));
                        }
                        model.addRow(rowData);
                    }

                    stmt.close();
                    return model;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return model;

            case "service":
                try {
                    query = "SELECT * FROM service";
                    ResultSet resultSet = stmt.executeQuery(query);
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    // Set column names
                    Vector<String> columnNames = new Vector<>();
                    for (int i = 1; i <= columnCount; i++) {
                        columnNames.add(metaData.getColumnName(i));
                    }
                    model.setColumnIdentifiers(columnNames);

                    // Set table data
                    while (resultSet.next()) {
                        Vector<String> rowData = new Vector<>();
                        for (int i = 1; i <= columnCount; i++) {
                            rowData.add(resultSet.getString(i));
                        }
                        model.addRow(rowData);
                    }

                    stmt.close();
                    return model;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return model;

            case "users":
                try {
                    query = "SELECT * FROM users";
                    ResultSet resultSet = stmt.executeQuery(query);
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();

                    // Set column names
                    Vector<String> columnNames = new Vector<>();
                    for (int i = 1; i <= columnCount; i++) {
                        columnNames.add(metaData.getColumnName(i));
                    }
                    model.setColumnIdentifiers(columnNames);

                    // Set table data
                    while (resultSet.next()) {
                        Vector<String> rowData = new Vector<>();
                        for (int i = 1; i <= columnCount; i++) {
                            rowData.add(resultSet.getString(i));
                        }
                        model.addRow(rowData);
                    }

                    stmt.close();
                    return model;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return model;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return model;
	}




    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Network();
            }
        });
    }
}