package Lab_1_12_2022;



	   public class ID_Not_Found_Exception extends Exception {
		   ID_Not_Found_Exception(String str){
			   super(str);
		   }
	   }
	 
	   class InvalidSalaryException extends Exception{
		   InvalidSalaryException(String str){
			   super(str);
		   }
	   }