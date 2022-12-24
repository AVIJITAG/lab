package com.Book;

import javax.swing.JOptionPane;

import Service.ServiceLayer;

public class UserBook {
	public static void main(String[] args) {
		
		
		do {
			
			ServiceLayer s = new ServiceLayer();  // calling dao function Dto Layer
			int a = Integer.parseInt(JOptionPane.showInputDialog("Press 1: for adding book \n Press 2: for Displaying book \n"
					+ "Press 3: Exit"));
			
			switch(a) {
			case 1:
				  s.addBook();
				  break;
				  
			case 2:
				s.fetchBook();
				break;
				
			case 3:
				System.exit(0);
				
				
			default: System.out.println("INVALID*CHOICE");	
			} 
			
		}while(true);
		
		
	}}