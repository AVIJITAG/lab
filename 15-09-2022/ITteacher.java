package MyPackage;
 class Teacher{
	 String designation = "Teacher";
	 String collegename = "MIT";
	 void work() {
	 System.out.println("Teaching");
	 }
 }
    class ITteacher extends Teacher {
          String mainSubject = "Mechanical Related Topic";
          
         public static void main(String args []) {
        	 ITteacher obj = new ITteacher();
        	 System.out.println(obj.collegename);
        	 System.out.println(obj.designation);
        	 System.out.println(obj.mainSubject);
        	 obj.work();
         }
}
