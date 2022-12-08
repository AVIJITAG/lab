/*  Problem Statement 2:
  
1.	Develop a java class with a instance variable Country  HashSet (H1)  add a method 
    storeCountryNames(String CountryName),the method should add the passed country to a 
    HashSet (H1) and return the added HashSet(H1).
    
   
2.	Develop a method retrieveCountry(String CountryName) which iterates through the HashSet 
    and returns the country if exist else return null.

    ***NOTE: You can test the methods using a main method.*/


package LAB_____08_12_2022;

import java.util.HashSet;
import java.util.Iterator;

public class Our_Country {   // create main class
	
	HashSet<String>H1 = new HashSet<>(); // creating HashSet H1 object
	
	public HashSet<String> storeCountryName(String CountryName){  // cretaing method to store countryName
		
		H1.add(CountryName);
		return H1;
	}
	
	public String retrieveCountry(String CountryName) {
		
		Iterator<String> itr= H1.iterator();
		
		while (itr.hasNext()) {
			if(itr.next().equals(CountryName))
				return CountryName;
				
			}
		       return null;
		}
	
	     public static void main(String ...arg) { // main method
	    	 Our_Country cty = new Our_Country(); // Our_Country object create
	    	 
	    	 cty.storeCountryName("India");
	    	 cty.storeCountryName("Nepal");        // adding values using with method
	    	 cty.storeCountryName("US");
	    	 cty.storeCountryName("Bangladesh");
	    	 
	    	 
	    	 System.out.println("US : " + cty.retrieveCountry("US"));  // retrieving country
	    	 System.out.println("London : "+ cty.retrieveCountry("London") );
	     }
	
}
