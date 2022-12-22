package com.EMS;


import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import Entity.Employee;


public class EmployeeManage {
static SessionFactory s;
public static void main( String[] args ) {
try {
s = new Configuration().configure().buildSessionFactory();
} catch (Exception e) {
System.out.println(e);
}
EmployeeManage m = new EmployeeManage();
m.addEmployee("Priya","Kumari",12345.34,876543219);
m.addEmployee("Ram","Das",22345.34,845543209);
m.readEmployee();
m.updateEmployee(2,50000.23);
m.deleteEmployee(2);
}
//method to create an employee in db table
public void addEmployee(String firstName,String lastName,double salary,long phone) {
try {
Session	ses = s.openSession();
Transaction t = ses.beginTransaction();
Employee e = new Employee();
e.setFirstName(firstName);
e.setLastName(lastName);
e.setPhone(phone);
e.setSalary(salary);
ses.save(e);
t.commit();
System.out.println("Inserted Successfully");
} catch (Exception e) {
System.out.println(e);
}
}
//method to read all employees from db table
public void readEmployee() {
try {
Session ses = s.openSession();
List employees = ses.createQuery("from Employee").list();
for(Iterator itr = employees.iterator();itr.hasNext();) {
Employee e = (Employee) itr.next();	
System.out.println(e.getId()+" "+e.getFirstName()+" "+e.getLastName()+" "+e.getSalary()+" "+e.getPhone());
}
} catch (Exception e) {
System.out.println(e);
}
}
//method to update salary according to id in db table
public void updateEmployee(int id,double salary) {
try {
Session	ses = s.openSession();
Transaction t = ses.beginTransaction();
Employee e = ses.get(Employee.class,id);
e.setSalary(salary);
ses.update(e);
t.commit();
System.out.println("Updated Successfully");
} catch (Exception e) {
System.out.println(e);
}
}
//method to delete a record in db table
public void deleteEmployee(int id) {
try {
Session	ses = s.openSession();
Transaction t = ses.beginTransaction();
Employee e = ses.get(Employee.class,id);
ses.delete(e);
t.commit();
System.out.println("Deleted Succesfully");
} catch (Exception e) {
System.out.println(e);
}
}
}


