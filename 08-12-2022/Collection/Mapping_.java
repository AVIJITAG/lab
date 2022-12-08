/*Problem Statement 3:
 
1. Develop a java class with a instance variable CountryMap  HashMap (M1)  add 
   a method storeCountryCapital(String CountryName, String capital),the method 
   should add the passed country and capital as key/value in the map M1 and return the Map (M1).
   
2.	Develop a method retrieveCapital(String CountryName) which returns the capital for the country passed from the Map M1 created in step 1.
3.	Develop a method retrieveCountry(String capitalName) which returns the country for the capital name passed from the Map M1 created in step 1.
4.	Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.

	*Develop a method which iterates through the map M1 and creates a ArrayList with all the Country names stored as keys. 
	*This method should return the ArrayList.

     NOTE: You can test the methods using a main method.*/



package LAB_____08_12_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapping_ {             // creating class
	 
	HashMap<String, String> M1=new HashMap<String, String>(); // create M1 HashMap object
    public HashMap<String, String> storeCountryCapital(String CountryName ,  String capital) {
    	M1.put(CountryName, capital);   // creating method storeCountryCapital 
    	return M1;
    }
    
    
    public String retrieveCapital(String CountryName) {
    	return M1.get(CountryName);      // creating method retrieveCapital to retrieve capital
    	}
    public String retrieveCountry(String capitalName) {
    	Set<Entry<String, String>> set = M1.entrySet();    // Entering hashmap
    	Iterator<Entry<String, String>> it = set.iterator();
    	
    	while (it.hasNext()) {
    		Map.Entry<String, String> me = it.next();  // traversing
    		if (me.getValue().equals(capitalName))
    			return me.getKey();
    	}   return null;
    }
     public HashMap<String, String> KyeValueswaping(){ // A method Which iterates through the map M1 and creates
    	 HashMap<String, String> M2 = new HashMap<String, String> ();
    	 Set<Entry<String,String>> set = M1.entrySet();
    	 Iterator<Entry<String, String>> it = set.iterator();
    	 
    	 while(it.hasNext()) {
    		 Map.Entry<String, String> me = it.next();
    		 M2.put(me.getValue(),me.getKey());
    	 }  return M2;
     } 
     
     public ArrayList<String> toArrayList() {    // method which iterates through the map M1
    	 ArrayList<String> list = new ArrayList<>();
    	 
    	 Set<Entry<String, String>> set = M1.entrySet();
    	 Iterator<Entry<String, String>> it = set.iterator();
    	 
    	 while(it.hasNext()) {
    		 Map.Entry<String, String> me = it.next();
    		 list.add(me.getKey()); // Storing key values of map in ArrayList
    	 }
		return list;
     }
    public static void main (String ...ard) {  //main method
    	
    	Mapping_ countryMap = new Mapping_();   // main class object create
    	
    	countryMap.storeCountryCapital("India","Delhi"); // storing country and capitals in map
    	countryMap.storeCountryCapital("NAPAL","kathmandu");
    	countryMap.storeCountryCapital("USA","Washington..DC");
    	
    	
    	System.out.println(countryMap.retrieveCapital("India")); // retrieving capital of countries
    	System.out.println(countryMap.retrieveCountry("kathmandu"));
    	System.out.println(countryMap.toArrayList());   // Converting Map to ArrayList
    	
    	HashMap<String, String> M2 = countryMap.KyeValueswaping();
    	System.out.println(M2);
    }
}
