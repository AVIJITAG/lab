use class;
create table Department (Department_ID numeric primary key, Department_Name varchar (20) unique, 
Department_Head varchar (30) unique, Department_Desc varchar (100)unique);

create table Employee (Emp_ID numeric primary key, Emp_Name varchar (30), Emp_Address varchar(50),
Emp_Salary double, Emp_Number bigint(13)unique, Department_ID numeric,foreign key(Department_ID) references Department(Department_ID),
check(Emp_Salary between 1000 and 1000000));