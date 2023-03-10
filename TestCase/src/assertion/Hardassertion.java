package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion {
	
	@Test
	public void assertest() {
		System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();          driver.manage().window().maximize();	
driver.get("https://www.google.com/");

String cuurenttitle = driver.getTitle();
System.out.println(cuurenttitle);      //Google
//validation point

//BY ASSERT EQUALS METHOD
//Assert.assertEquals(cuurenttitle, "google");                //hard assertion

                                //hard assertion--rule is terminating the program whenever testcase condition or assretion fails

//BY ASSERT TRUE METHOD
/*boolean flag=false;   //here we fix value of flag as true..if() 
	
	if(cuurenttitle.contains("Google")) {
			
		flag=true;
    }
		   
	Assert.assertTrue(flag);*/    

/*boolean flag=true;   //here we fix value of flag as true..if() 

if(cuurenttitle.contains("google")) {
		
	flag=false;
}
	   
Assert.assertFalse(flag);*/    




Assert.assertNotEquals(cuurenttitle, "Google", "verify the page title with actual vs expected" );

   driver.navigate().refresh();

driver.close();



		
	
	
	

	}}
