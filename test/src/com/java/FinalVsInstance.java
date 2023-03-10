package com.java;

public class FinalVsInstance {
	 final int a;
	FinalVsInstance(){
	
		a=10;
	}
	
	public static void main(String args[]) {
		FinalVsInstance FI =new FinalVsInstance();
		System.out.println(FI.a);
	}
}
