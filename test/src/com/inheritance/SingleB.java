package com.inheritance;

public class SingleB extends SingleA{
	int c = 15;
 	int d = 20;
 	int m = 200;
	int n = 100;
 	
 	//Case -: 1 Different variable name
	 void add(int i, int j) {
			System.out.println(i + j);      //20+20
			System.out.println(c + d);      //15+20
			System.out.println(a + b);      //5+10
	 }
	 
	 
	// Case-:2 To represent current class data ‘this’ keyword is used and to represent parent  class data ‘super’ keyword is used
	 void sub(int k, int l) {
		 	System.out.println(this.m+" and "+this.n);   //current class data
		 	System.out.println(super.m+" and "+super.n); //parent class data 
		  
		 	System.out.println(this.m - this.n); 
		 	System.out.println( super.m - super.n);
		 	System.out.println( k - l);
	 }
	 
	 
	 //Case-:3 print super class method and child class method
	 void m1() {
		 

			System.out.println("M1 method call in child class");
			super.m1();
	 }
	 
	
 
 	public static void main (String args[]) {
 		SingleB B = new SingleB();
 		//SingleA A = new SingleA();
 		//System.out.println(B.a);
 		//System.out.println(A.a);
 		B.m1(); // method call child method
 		//A.m1(); // method call
 		
 		B.add(20,20);
 		B.sub(1,1);
 		B.helloWorld();
 	}
 
}
