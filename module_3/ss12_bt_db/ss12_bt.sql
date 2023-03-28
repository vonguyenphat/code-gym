create database testss1;
use testss1;
drop database  testss1;
create table Room(
idPhongTro int primary key auto_increment,
nameNguoiThue varchar(120),
std int(20),
ngayBatDau Date,
idPayMent int ,
foreign key (idPayMent) references Payment(idPayMent)
);
INSERT INTO Room(nameNguoiThue,std,ngayBatDau,idPayMent) VALUES ("Phat",0865267103,'2003-06-17',1);
INSERT INTO Room(nameNguoiThue,std,ngayBatDau,idPayMent) VALUES ("Phat",0865267103,'2003-06-17',1);
INSERT INTO Payment VALUES (1,'phong1');
INSERT INTO Payment VALUES (2,'phong2');
create table Payment(
idPayMent int primary key ,
namePayment varchar(120)
);
DELIMITER $$
CREATE PROCEDURE `search`(nameNguoiThue varchar(120))
BEGIN
  -- statements
  select * from Room where (name like concat (‘%’,nameNguoiThue,‘%’));
  END $$
DELIMITER ;
call search("Phat");
select idPhongTro,nameNguoiThue,std,ngayBatDau,namePayment from Room r 
join Payment p on r.idPayMent = p.idPayMent;