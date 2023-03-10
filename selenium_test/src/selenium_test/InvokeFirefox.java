package selenium_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {
	public static void main(String args[]) {
		
	System.setProperty("webdriver.gecko.driver","E:\\tools\\drivers\\IEDriverServer.exe")	;
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	 System.out.println(driver.getTitle());   //console output : Facebook – log in or sign up
		
	}
}
