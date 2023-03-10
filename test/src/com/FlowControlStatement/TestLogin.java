package com.FlowControlStatement;
import java.util.Scanner;

public class TestLogin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	
		System.out.println("Enter User Name");		
		String sname=s.next();
		System.out.println("Enter Password");		
		String spass=s.next();
		//int spass=s.nextInt();
		
		//String sname ="pooja" ;
		//String  spass ="p12345";
		
		if(sname =="pooja" && spass =="p12345") {
			System.out.println("Login Successfully");
		}
		else{
			System.out.println("Enter correct user name and password");
		}
		
		s.close();
		}
}
