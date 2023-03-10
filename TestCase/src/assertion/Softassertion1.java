package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion1 {
	@Test
	public void assertest() {
		System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();          driver.manage().window().maximize();	
driver.get("https://www.google.com/");

                String currenttitle = driver.getTitle();
System.out.println(currenttitle);   //remember about double quote.it has meaning.

SoftAssert softassertion=new SoftAssert();
	
	boolean flag=false;
	
		if(currenttitle.contains("google")) {
	
				flag=true;}
	
		softassertion.assertTrue(true);

	driver.navigate().refresh();

	driver.close();

	softassertion.assertAll();
	//it will print the exception in result

}



}
