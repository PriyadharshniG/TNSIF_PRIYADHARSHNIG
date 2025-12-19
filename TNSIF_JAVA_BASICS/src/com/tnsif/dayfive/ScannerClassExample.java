package com.tnsif.dayfive;
import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter College Name: ");
			String cname = sc.next();
			
			
			System.out.println("Enter Couselling Code: ");
			int code = sc.nextInt();
			
			System.out.println("The College name is: " + cname +", The College code is: "+code);


	}

}
