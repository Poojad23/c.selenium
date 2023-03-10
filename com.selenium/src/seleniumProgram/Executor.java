package seleniumProgram;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://demo.nopcommerce.com/");

		//Drawing border 

				//WebElement logo = driver.findElement(By.xpath("//*[@alt='nopCommerce demo store']"));
				
				//Script.drawborder(logo, driver);


		//get title of page
			//	String title = Script.getTitleByJS(driver);
			
		//		System.out.println(title);



		//click on element

		//		WebElement login = driver.findElement(By.xpath("//*[@class='ico-login']"));
		//		
		//		Script.clickElementByJS(login, driver);



		//generate alert

	   Script.generatealert(driver, "This is my alert");


		//scrll down

		//		Thread.sleep(3000);
		//		Script.scrollDown(driver);
		//		
		//		Thread.sleep(3000);
		//		Script.scrollUp(driver);

		Thread.sleep(3000);
		Script.scrolldownPage(driver);

		Thread.sleep(3000);
	}


}
