CREATE TABLE DEVICE( mac_address CHAR(14),
                         ip_address CHAR(15),
                         model VARCHAR2(8),
                         manufacturer VARCHAR2(10) NOT NULL,
                         PRIMARY KEY(mac_address,ip_address));

CREATE TABLE CONNECTION( from_ip_address CHAR(15),
                               to_ip_address CHAR(15));

CREATE TABLE WARRANTY( mac_address CHAR(14),
                               expiry_date DATE,
                               installation_date DATE,
                               warranty_period int);

alter table device drop primary key;
alter table device add primary key(mac_address);
alter table warranty ADD CONSTRAINT mac_for FOREIGN KEY(mac_address) REFERENCES DEVICE(mac_address);
alter table warranty ADD CONSTRAINT warr_check CHECK(warranty_period<=80 AND expiry_date>installation_date);
alter table device add unique(ip_address);
CREATE TABLE USERS( ip_address CHAR(15),
                       user_id VARCHAR(10) PRIMARY KEY,
                      department VARCHAR2(10),
                        FOREIGN KEY(ip_address) REFERENCES DEVICE(ip_address));
 CREATE TABLE SERVICE(
    mac_address char(14),
    serviced_by VARCHAR2(20),
    date_of_service DATE,
    type_of_service VARCHAR(20),
    FOREIGN KEY(mac_address) REFERENCES DEVICE(mac_address));                        
 alter table service modify date_of_service date NOT NULL;    
 alter table service modify serviced_by varchar2(20) NOT NULL;
 