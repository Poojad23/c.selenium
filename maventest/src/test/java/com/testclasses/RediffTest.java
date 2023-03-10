package com.testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class RediffTest extends Base {
	
	public WebDriver driver;


	//private static Logger log=LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void invokbrowser() throws IOException {

		driver=initializeDriver();
		//log.info("driver is initialized");

		driver.manage().window().maximize();

		//log.info("window is maximized");


	}


	// inheritance
	//by creating object

	@Test(dataProvider="getData")

	public void logIn(String username,String password,String text) throws IOException, InterruptedException {


		driver.get(prop.getProperty("url"));

		//log.info("navigated to Landing page/Home page or Url is launched");
		LandingPage l =new LandingPage(driver);

		//click on sign in on home page 
		l.signin().click();

		//log.info("click on sign in tab");


		LoginPage l1=new LoginPage(driver);

		l1.login().sendKeys(username);


		l1.passwd().sendKeys(password);

		//log.info(text);

		l1.submit().click();

		//log.info("click on login button");

	}

	@AfterTest
	void tearDown() {

		driver.close();
	}

	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data types test should run
		//coloumn stands for how many values per each test

		// Array size is 2
		// 0,1
		Object[][] data=new Object[2][3]; // set 1 = username,pass,textarea
									
		//0th row
		data[0][0]="nonrestricteduser@gmail.com";
		data[0][1]="123456";
		data[0][2]="nonRestrcited User";
		
		
		//1st row
		//	 data[1][0]="restricteduser@qw.com";
		//     data[1][1]="456788";
		//	 data[1][2]= "restricted user";

		return data;




	}





}

