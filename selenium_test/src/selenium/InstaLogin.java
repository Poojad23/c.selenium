
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {

		//invoke browser

		System.setProperty("webdriver.chrome.driver", "E:\\Tools\\ChromeD\\chromedriver.exe");

		//upcasting

		WebDriver driver=new ChromeDriver();


		//maximize the browser

		driver.manage().window().maximize();

		//get the url

		driver.get("https://www.secure.instagram.com/accounts/login/?next=/pbnddj/&source=profile_posts&hl=en-gb");

		//enter userid

		//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("abc@gmail.com");


		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='-MzZI']/div/label/input")).sendKeys("abc@gmail.com");

		//enter password


		Thread.sleep(4000);

		//click on ligin button


		//click on forgotton password link

		//driver.findElement(By.xpath("//*[text()='Forgotten your password?']")).click();


		//driver.findElement(By.xpath("//*[contains(text(),'Forgotten')]")).click();


		System.out.println(driver.findElement(By.xpath("//*[@type='text']")).getText());
		Thread.sleep(4000);

		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Forgotten')]")).getText());
		String imageName = driver.findElement(By.cssSelector(".s4Iyt")).getText();


		System.out.println(imageName);


	}

}