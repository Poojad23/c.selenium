package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionHS {
	@Test
	public void assertest() {
	System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();          
    driver.manage().window().maximize();	
    driver.get("https://www.google.com/");

     String cuurenttitle = driver.getTitle();
     System.out.println(cuurenttitle);      //Google
     //validation point

     // BY ASSERT EQUALS METHOD
      Assert.assertEquals(cuurenttitle, "Google");                //hard assertion

                                //hard assertion--rule is terminating the program whenever testcase condition or assretion fails

//BY ASSERT TRUE METHOD
/*boolean flag=false;   //here we fix value of flag as true..if() 
	
	if(cuurenttitle.contains("Google")) {
			
		flag=true;
    }
		   
	Assert.assertTrue(flag);*/
}
}
