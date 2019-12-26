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

