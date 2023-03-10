package testcom.java;
import com.java.Variables;

public class VariableRef {
	int c =15;
	int d =20;
	public static void main(String[] args) {
		//for access to instance variable Variable class from com.java package
		Variables v = new Variables();
		System.out.println("this is com .java package variable = "+v.a);
		System.out.println("this is com .java package variable = "+v.b);
		v.m1();
		
		//for access to instance variable current class
		VariableRef vr = new VariableRef();
		System.out.println("this is testcom .java package variable = "+vr.c);
		System.out.println("this is testcom .java package variable = "+vr.d);
		
		    
		 }
	
	
}
