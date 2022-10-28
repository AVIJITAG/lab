/*Create two threads to print even numbers and odd numbers from 1 to 100?
note: after printing of all even numbers only odd numbers should print*/
package Hack;

public class PrintEvenOddTester {                                              // create class
	  public static void main(String... args) {                                // main method 
	        Printer print = new Printer();                                    // object create 
	        Thread t1 = new Thread(new TaskEvenOdd(print, 100, false));
	        Thread t2 = new Thread(new TaskEvenOdd(print, 100, true));
	        t1.start();
	        t2.start();
	    }

	}

	class TaskEvenOdd implements Runnable {                              // implements

	    private int max;
	    private Printer print;
	    private boolean isEvenNumber;

	    TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
	        this.print = print;
	        this.max = max;
	        this.isEvenNumber = isEvenNumber;
	    }

	    @Override                                                       // override 
	    public void run() {

	        //System.out.println("Run method");
	        int number = isEvenNumber == true ? 2 : 1;
	        while (number <= max) {

	            if (isEvenNumber) {
	                //System.out.println("Even :"+ Thread.currentThread().getName());
	                print.printEven(number);
	                //number+=2;
	            } else {
	                //System.out.println("Odd :"+ Thread.currentThread().getName());
	                print.printOdd(number);
	                // number+=2;
	            }
	            number += 2;
	        }

	    }

	}

	class Printer {

	    boolean isOdd = false;

	    synchronized void printEven(int number) {

	        while (isOdd == false) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	      //  System.out.println("Even:" + number);
	        isOdd = false;
	        notifyAll();
	    }

	    synchronized void printOdd(int number) {
	        while (isOdd == true) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("Odd:" + number);                                   // print statements 
	        isOdd = true;
	        notifyAll();
	    }
}