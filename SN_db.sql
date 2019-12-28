create database SN_db

CREATE TABLE [Users] (
  [UserId] int IDENTITY(1,1),
  [name] varchar(20) not null,
  [password] varchar(50) not null,
  [email] varchar(50) not null,
  [gender] varchar(10) not null,
  [country] varchar(30) not null,
  [birthdate] date not null, 
  [is_Premium_Users] int not null,/*0 not a Premium_Users 1 is a  Premium_Users */
  [PayPal] varchar(20) ,
  [credit_card] varchar(20) , 
  PRIMARY KEY ([UserId])
);


CREATE TABLE [FRINDES] (
  [UserId] int REFERENCES Users(UserId),
  [friendid] int REFERENCES Users(UserId),
);

CREATE TABLE [addrequestlist] (
  [UserId] int REFERENCES Users(UserId),
  [friendrequestid] int REFERENCES Users(UserId),
);

insert into [Users](name,password,email,gender,country,birthdate,is_Premium_Users)
         values('ramy','123','mina@gmail.com','m','giza','1999-4-16' ,0);

select *from users ;
Select*from FRINDES;
select*from addrequestlist;

insert into FRINDES (UserId,friendid)values(1,3);
insert into FRINDES (UserId,friendid)values(3,1);

insert into addrequestlist(UserId,friendrequestid)values(2,1);
