package com.FlowControlStatement;
import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//System.out.println("enter empid");			
		//int eid = s.nextInt();//to read the integer data
	
		System.out.println("Enter Student Name");		
		s.next();
		
		System.out.println("Enter Student Percentage");			
		double sper=s.nextDouble();
		
		if(sper>35 && sper<=45) {
			System.out.println("just Passed: Grade P");
		}
		else if(sper>45 && sper<=55) {
			System.out.println("Second Class");
		}
		else if(sper>55 && sper<=65) {
			System.out.println("Higher Second class");
		}
		else if(sper>65 && sper<=75) {
			System.out.println("First Class");
		}
		else if(sper>75 && sper<=85) {
			System.out.println("First class with distinction");
		}
		else if(sper>85 && sper<=95) {
			System.out.println("Excellent");
		}
		else if(sper>95 && sper<=100) {
			System.out.println("Outstanding");
		}
		else {
			System.out.println("Failed!.");
			
		}
	  
		s.close();
	}
}
