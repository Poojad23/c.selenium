package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertion {
	
@Test
	public void assertest() {
		System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();          driver.manage().window().maximize();	
driver.get("https://www.google.com/");

                String currenttitle = driver.getTitle();
System.out.println(currenttitle);   //remember about doubl

              //for soft asserion u need SoftAssert class .create object first.

SoftAssert softassertion=new SoftAssert();     

softassertion.assertEquals(currenttitle,"google","verify the page title with actual vs expected");

}}
