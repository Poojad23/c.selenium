package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion1 {
	@Test
	public void assertest() {
		System.setProperty("webdriver.chrome.driver", "D:\\tools\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();          driver.manage().window().maximize();	
driver.get("https://www.google.com/");

String cuurenttitle = driver.getTitle();
System.out.println(cuurenttitle);      //Google

Assert.assertTrue(true);
}}
