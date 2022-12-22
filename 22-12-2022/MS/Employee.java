package Entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)//allows auto generation for field value
@Column(name="emp_id")
private int id;
@Column(name="emp_firstName",length=20,nullable=false)
private String firstName;
@Column(name="emp_lastName",length=20,nullable=false)
private String lastName;
@Column(name="emp_salary")
private double salary;
@Column(name="emp_phone",length=11,unique=true)
private long phone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
}


