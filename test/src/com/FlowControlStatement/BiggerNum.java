package com.FlowControlStatement;
import java.util.Scanner;

public class BiggerNum {
	
		public static void main(String args[]) {
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Two Number");	
			
			int num1=s.nextInt();
			int num2=s.nextInt();
			
			if(num1 > num2) {
				System.out.println(num1);
			}
			else if(num1<num2) {
				System.out.println(num2);
			}
			else System.out.println("Both are Equal");
			
			s.close();
		}
	
}

