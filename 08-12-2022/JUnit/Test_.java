
//In Eclipse, run MyEvenOddTest class as JUnit Test.

package LAB______08_12_2022;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_ {
	
	static Even_Odd Z;
	
	@Test

	public void Test1() {         // this one for + test case
		Z = new Even_Odd();
		int U = 24;
		
		assertEquals("even", Z.even(U));
	}
	
	@Test
	  
	public void Test2() { // - ve test case
		Z = new Even_Odd();
		
		int U = 4;
		
		assertEquals("even", Z.even(U));
	}

}
