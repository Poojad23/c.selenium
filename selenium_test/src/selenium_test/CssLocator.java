package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\tools\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//for email field	By.xpath 
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pooja@gmail.com");
		
		//for pass field	By.xpath 
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("pooja23");
		
		//click on log in button
		//driver.findElement(By.xpath("//button[@name='login']")).click();
				
		//driver.findElement(By.cssSelector())
		//Thread.sleep(4000);
		//driver.close();
	}

}
