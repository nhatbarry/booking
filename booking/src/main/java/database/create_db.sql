drop database booking
go

create database booking
go

use booking

create table homestay
(
	homestay_id int identity(1, 1) primary key
	, name nvarchar(40)
	, location nvarchar(120) not null
	, is_booked bit not null
	, price int not null
)
go

create table people
(
	user_id int identity(1, 1) primary key
	, user_name varchar(40) not null
	, passwd varchar(40) not null
	, name nvarchar(40)
	, phone char(10)
	, mail char(40)
	, user_role varchar(10) check (user_role = 'manager' or user_role = 'customer')
	, homestay_booked int foreign key references homestay(homestay_id)
)
go

create view login
as
select user_name, passwd from people

create procedure register @username varchar(40), @password varchar(40)
as
insert into people (user_name, passwd)
values
(@username, @password)
go

exec register @username = 'testkhachhang1', @password = '123456'