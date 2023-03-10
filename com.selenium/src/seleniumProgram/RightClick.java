package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
		
    	System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickelement = driver.findElement(By.xpath("//*[text()='right click me']"));
		
		Actions a= new Actions(driver);
		
		a.contextClick(rightClickelement).build().perform();
		
	}
}
