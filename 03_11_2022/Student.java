// Problem 1
package Lab_13_11_2022;

public class Student {
java.lang.Long studentid;
java.lang.Character studentGrade;
java.lang.Double MonthlyFees;
java.lang.Boolean isScholarshipEligible;
java.lang.Double fees;
void calculateFeeStruture(java.lang.Character studentGrade, 
java.lang.Double MonthlyFees, long studentid) {
// creatingn method as asked in Question
if (studentGrade == 'A') {// cheking c
isScholarshipEligible = true;
fees = MonthlyFees - MonthlyFees * 10 / 100;
System.out.println("Scholarship status " + 
isScholarshipEligible);
System.out.println(
"Student id is " + studentid + " is " + 
"10% fees is exempted,the calculated fees is " + fees);
} else if (studentGrade == 'B') {
isScholarshipEligible = true;
fees = MonthlyFees - MonthlyFees * 8 / 100;
System.out.println("Student id is " + studentid + " is " + "Scholarship status " + isScholarshipEligible);
System.out.println("8% fees is exempted,the calculated fees is " + fees);
} else if (studentGrade == 'C') {
isScholarshipEligible = true;
fees = MonthlyFees - MonthlyFees * 6 / 100;
System.out.println("Student id is " + studentid + " is " + "Scholarship status " + isScholarshipEligible);
System.out.println("6% fees is exempted,the calculated fees is " + fees);
} else if (studentGrade == 'D') {
isScholarshipEligible = true;
fees = MonthlyFees - MonthlyFees * 4 / 100;
System.out.println("Student id is " + studentid + " is " + "Scholarship status " + isScholarshipEligible);
System.out.println("4% fees is exempted,the calculated fees is " + fees);
} else {
isScholarshipEligible = false;
fees = MonthlyFees;
System.out.println("Student id is " + studentid + " is " + "Not Eligible for Exempotion");
}
}
//problem 2
void comparemarks(long Maths, double english) {
Integer M = new Integer((int) Maths);// converting long to Integer
Integer E = new Integer((int) english);// converting Double to Integer
if (M < E) {
System.out.println("English is higher than math");
} else if (M > E) {
System.out.println("Math is higher than english");
} else {
System.out.println("both are Equals");
}
}
//problem 3
void validateFees(double fees) {
if (fees > 10000000) {
System.out.println("Fees is Infinite");
} else {
System.out.println("the byte value of fee is " + 
(byte) fees);
}
}
public static void main(String[] args) {// main mthod
Student s1 = new Student();// creating oject of student class
Student s2 = new Student();// creating oject of student class
Student s3 = new Student();// creating oject of student class
s1.calculateFeeStruture('C', 600.0, 234);// passing test case throught calculateFeeStruture method
s2.calculateFeeStruture('B', 905.5, 115);// passing test case throught calculateFeeStruture method
s3.calculateFeeStruture('G', 1810.0, 980);// passing test case throught calculateFeeStruture method
s1.comparemarks(85, 65);// passing test case through comparemarks method
s2.comparemarks(56, 98);// passing test case through comparemarks method
s3.comparemarks(84, 84);// passing test case through comparemarks method
s1.validateFees(5555);
s2.validateFees(100000000);
}
}