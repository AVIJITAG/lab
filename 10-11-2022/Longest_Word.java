// write a java program to find the longest word in a text file

package LAB_10_11_2022;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Longest_Word {                                                                    //class create
     public static void main(String [ ] args) throws FileNotFoundException {                   // main method throws 
              new Longest_Word ().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("C://Text.txt"));                                    // scanner object  \\ file location 


       while (sc.hasNext()) {
          current = sc.next();
           if (current.length() > longest_word.length()) {                                    // if statement 
             longest_word = current;
           }

       }
         System.out.println("\n"+longest_word+"\n");                                             // last print statement 
            return longest_word;
            }
}