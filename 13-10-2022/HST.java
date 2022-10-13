package LAB13_10_2022;
import java.util.Scanner;

class HST{
	 public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(new AGO().pattern));
	        }

	    }
	}

	//Write your code here
	class AGO {
	    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	    String pattern = num + "." +  num + "." +  num + "." + num;
	
}

   