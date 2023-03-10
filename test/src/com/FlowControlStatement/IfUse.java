package com.FlowControlStatement;
import java.util.Scanner;

public class IfUse {
		
		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in); //system.in--take input from system resources like key board
						
			System.out.println("enter empid");			
			int eid = s.nextInt();//to read the integer data
		
			System.out.println("enter employee name");		
			String ename=s.next();
			
			System.out.println("enter employee salary");			
			double esalary=s.nextDouble();
		
			if(esalary>50000 && ename.startsWith("p")) {
				System.out.println("very good employee");
				System.out.println( "E.Id =       " +eid );
				System.out.println( "Emp Name =   " +ename );
				System.out.println( "Emp Salary = "+ esalary);
			
			} else {
				System.out.println("good employee");
				System.out.println( "E.Id =       " +eid );
				System.out.println( "Emp Name =   " +ename );
				System.out.println( "Emp Salary = "+ esalary);
			}
		  
			s.close();
			
		}
		
		
	}

