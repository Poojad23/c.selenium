package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']"));
	
		driver.switchTo().frame(iframe);
	
		WebElement source = driver.findElement(By.xpath("//*[@alt='The peaks of High Tatras']"));
	
		WebElement target = driver.findElement(By.xpath("//*[@id='trash']"));
	
		Actions act= new Actions(driver);
	
		//move image to the trash
		act.dragAndDrop(source, target).build().perform();
	}
}
