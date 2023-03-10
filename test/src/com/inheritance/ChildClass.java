package com.inheritance;

public class ChildClass extends ParentClass{
	
	ChildClass(){
		//super();//Parent class constructor calling
		this(10);//current class constructor calling
		System.out.println("Child class constructor");
	}
	
	ChildClass (int a){
		System.out.println(a + " child class one args constructot");
		}
	
	public static void main(String args[]) {
		ChildClass c = new ChildClass();
	}
}
