package BMS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuDriven_BMS {

	public static void main(String[] args) {
		LoaderFile bms=new LoaderFile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome $ MYBank");
		while(true) {
			System.out.println("[1.Create Account],"
					+ "[2.Display Details],"
					+ "[3.Deposit],"
					+ "[4.Withdraw],"
					+"[5.Change Pin],"
					+ "[0.Exit]");
			int choice=sc.nextInt();
			while(!(choice>=0 && choice<6)) {
				System.out.println("!!Invalid choice!!\nTry Again : ");
				choice=sc.nextInt();
			}
			if(choice==0) {
				System.out.println("!!Thank you for choosing  MYBank!!");
				break;
			}else {
				try {
					if(choice==1) {
						bms.storeData();
					}else if(choice==2) {
						bms.displayData();
					}else if(choice==3 || choice==4 || choice==5) {
						bms.updateData(choice);
					}
				}catch(InputMismatchException e) {
					System.out.println("!!Invalid entry!!");
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}finally {
					System.out.println("[1-->Main Menu],[0-->Exit]");
					int choice1=sc.nextInt();
					while(!(choice1==0||choice1==1)) {
						System.out.println("!!Invalid choice!!\nTry Again : ");
						choice1=sc.nextInt();
					}
					if(choice1==1) {
						continue;
					}else if(choice1==0) {
						System.out.println("Thank you for choosing our bank!!");
						break;
					}
				}
			}
		}
	}

}
