package testNGpackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	@BeforeSuite
	
	public void A3() {
		System.out.println("Day3");
	}
	
	@Test(groups={"Regression"})
	public void WebCarLoan() {
		
		System.out.println("this is webcarloan method");

	}
	
	@Test
	public void ApiCarLoan() {
		
		System.out.println("this is apicarloan method");

	}
	
	@Test
	public void MobilecarLoan() {
		
		System.out.println("this is mobilecarloan method");

	}
	
}
