create database Vs_studio;
use vs_studio;
create table Student00(sid int(10), ssubject varchar (10));
drop table Student00;
use vs_studio;
create table Department( Department_ID int (10), Department_Name varchar(20), Department_Head varchar (29), Department_Description varchar(20));
create table D_Employee( Employee_ID int (10), Employee_Name varchar(20), Employee_Address varchar (29),
Employee_Salary decimal(20), Employee_Number int (12),Department_id int (12)) ;
