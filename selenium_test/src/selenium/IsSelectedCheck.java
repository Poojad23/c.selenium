package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class IsSelectedCheck {
	


		public static void main(String[] args) throws InterruptedException  {

			//invoke browser

			System.setProperty("webdriver.chrome.driver", "E:\\Tools\\ChromeD\\chromedriver.exe");

			//upcasting

			WebDriver driver=new ChromeDriver();


			//maximize the browser

			driver.manage().window().maximize();

			//get the url

			driver.get("https://www.spicejet.com/");

			//isSelected

			boolean result1 = driver.findElement(By.xpath("//*[@stroke='#DDDDDD']")).isSelected();

			System.out.println(result1);
			
			
			driver.findElement(By.xpath("//*[@stroke='#DDDDDD']")).click();
			
			
			Thread.sleep(5000);
			
			boolean result2 = driver.findElement(By.xpath("//*[@stroke='#F7941D']")).isSelected();
			
			System.out.println(result2);
			
			Thread.sleep(4000);
			
			driver.close();

		}










	
}
