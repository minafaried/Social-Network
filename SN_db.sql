create database SN_db
CREATE TABLE [Users] (
  [UserId] int IDENTITY(1,1),
  [name] varchar not null,
  [password] varchar not null,
  [email] varchar not null,
  [gender] varchar not null,
  [country] varchar not null,
  [birthdate] date not null, 
  [is_Premium_Users] int not null,/*0 not a Premium_Users 1 is a  Premium_Users */
  [PayPal] varchar ,
  [credit_card] varchar , 
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


select *from users;