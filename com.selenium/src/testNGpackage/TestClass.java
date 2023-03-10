package testNGpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	@BeforeSuite
	void m1() {System.out.println("execute bfsuit");}

	@AfterSuite
	void m2() {System.out.println("execte afsuite");}
	
	
	@BeforeTest 
	public void m3() {System.out.println("m3");}
	
	@AfterTest
    public void m4() {System.out.println("m4");}
	
     @Test(groups= {"Regression"})
	public void m5() {System.out.println("m5");}
	
	@Test
	public void m6() {System.out.println("m6");}
	
	@BeforeClass
	public void m7() {System.out.println("m7-bfcls");}
	
	@AfterClass
	public void m8() {System.out.println("m8-afcls");}
	
	@BeforeMethod
	public void m9() {System.out.println("m9-bfmthd");}
	
	@AfterMethod
	public void m10() {System.out.println("afmthd");}

	
	@BeforeGroups
	public void m11() {System.out.println("m11-bfgrp");}
}
