package com.java;

public class ReturnType {
	int  m1() {
		System.out.println("m1 method");
		return 10;
	}
	
	float m2() {
		System.out.println("m2 Python");
		return 10.5f;
	}
	
	char m3() {
		System.out.println("m3 Python");
		return 'a';
	}
	
	String m4() {
		System.out.println("m4 Python");
		return "java";
	}
	
	public static void main(String[] args) {
		
		ReturnType r = new ReturnType();
		
		int a=r.m1();
		System.out.println(a);//10
		
		float b=r.m2();
		System.out.println(b);//10.5
		
		char c=r.m3();
		System.out.println(c);//a
		
		String d=r.m4();
		System.out.println(d);//java
	}
}
