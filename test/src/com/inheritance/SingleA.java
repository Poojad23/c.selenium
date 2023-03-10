package com.inheritance;

public class SingleA {
	int a = 5;
	int b = 10;
	int m = 90;
	int n = 80;
	
	void m1() {
		
		System.out.println("M1 method call in parent class");
	}
	
	 //Case-:4 Is it possible to Inherited Final method? -: Yes
	 final void helloWorld() {
		 System.out.println("Hello world method");
		 }
	 
}
