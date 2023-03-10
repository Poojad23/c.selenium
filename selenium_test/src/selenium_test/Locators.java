package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main (String args[]) throws InterruptedException {
	
		//1. Invoke Browser
		System .setProperty("webdriver.chrome.driver", "E:\\\\tools\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2.maximize browser
		driver.manage().window().maximize();
		
		//3.Launch URL
		driver.get("https://www.facebook.com/");
		
		//find the required element and send the email to that field.
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		//find the required element and send the password to that field.
		driver.findElement(By.name("pass")).sendKeys("pooja@123");

		//click on login button
		driver.findElement(By.name("login")).click();

		//Apply wait or time 
		//Thread.sleep(4000);
		
		//Close tab or window
		//driver.quit();
	}
}
