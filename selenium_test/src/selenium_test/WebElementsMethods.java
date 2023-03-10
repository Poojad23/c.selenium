package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {
	public static void main(String[] args) {		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Tools\\ChromeD\\chromedriver.exe");  // step 1. invoke browser

		WebDriver driver=new ChromeDriver();													//step 2. upcasting
		
		driver.manage().window().maximize(); 													//Step 3. maximize the browser
		
		driver.get("https://www.google.com/");												    // Step 4. Launch URL
				

		//isenabled

		boolean result = driver.findElement(By.xpath("//*[text()='Gmail']")).isEnabled();
		System.out.println(result);

		//Isdisplayed

		System.out.println(driver.findElement(By.xpath("//*[@class='lnXdpd']")).isDisplayed());
		//isSelected

		boolean result1 = driver.findElement(By.xpath("//*[@stroke='#DDDDDD']")).isSelected();
		System.out.println(result1);

	}
}
