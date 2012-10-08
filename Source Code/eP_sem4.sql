create database eProject_sem4

go
use eProject_sem4

go
create table Permissions
(
	pID			int primary key,
	pName		nvarchar(30),
	pStatus		bit default 1
)

go
create table Accounts
(
	aEmail		nvarchar(30) primary key,
	aPass		nvarchar(30),
	aName		nvarchar(30),
	aBirthday	datetime,
	aTel		nvarchar(20),
	aAdd		nvarchar(300),
	aJob		nvarchar(100),
	aDegree		nvarchar(100),
	aJobAdd		nvarchar(300),
	aStatus		nvarchar(20) default 'active', --active/block
	pID		int,
	foreign key (pID) references Permissions(pID)	
)
 
go
create table Presentations
(
	prID		int primary key,
	prTitle		nvarchar(100),
	prSummary	nvarchar(300), 
	prContent	nvarchar(300),
	prDate		datetime,
	prAdd		nvarchar(300),
	prStatus	nvarchar(20) default 'request', --request/accepted/denied/expired
	prCost    	float,
	aEmail		nvarchar(30),	--author	
	foreign key (aEmail) references Accounts(aEmail)
)

go
--when user create or register to join a presentation
--info of user and presentation when store here,when presentation's status is denied/expried
--record will be remove of table (change status or delete)
create table Requests  
(
	rID			int primary key,
	rType		nvarchar(30), 	--register/create
	rStatus		nvarchar(20),  --not confirm/confirmed/denied
	aEmail		nvarchar(30),
	prID		int,
	foreign key (aEmail) references Accounts(aEmail),
	foreign key (prID) references Presentations(prID)
)

go
create table TypeCost
(
	tcID		int primary key,
	tcName		nvarchar(100),
	tcStatus    bit default 1,       		
)

go
create table Histories
(
	hID			int primary key,
	hDate		datetime,
	hType		nvarchar(20), --owner/joined
	hStatus		bit default 1,
	aEmail		nvarchar(30),
	prID		int,
	hCost		float,
	tcID		int,
	foreign key(tcID) references TypeCost(tcID),
	foreign key (aEmail) references Accounts(aEmail),
	foreign key (prID) references Presentations(prID)
)

go


