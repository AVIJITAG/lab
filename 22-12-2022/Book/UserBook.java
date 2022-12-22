package com.Book;

import java.util.Scanner;

import com.Book.Dao_Implement.Userimplement;
import com.Book.Entity.BookClass;

public class UserBook {
	public static void main(String[] args) {
		Userimplement um = new Userimplement();
		char ans;
			
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome Book World");
		System.out.println("Enter Choice : ");
		System.out.println("1.Add Book\n   2. Read\n 3.Exit\n");
		
		int ch = s.nextInt();
		
		do {
			switch(ch) {
			case 1:
			 um.add();;
			break;
			case 2:
			 um.fetch();
			 break;
			case 3:
				System.exit(3);
			break;
			default :
				System.out.println("Invalid");
				break;
			}
			
		System.out.println("Do you try ? y/n");
		ans= s.next().charAt(3);
		}
		
		while(ans == 'y'||ans =='n');
		
		
		}

}
