package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
	
		//switch selenium focus from main page to outer frame	
		driver.switchTo().frame("iframeResult");
	
		WebElement innerframe = driver.findElement(By.xpath("//*[@title='Iframe Example']"));	
	
		driver.switchTo().frame(innerframe);//using webelement 
	
		//Get text on Inner frame
		System.out.println(driver.findElement(By.xpath("//*[text()='This page is displayed in an iframe']")).getText());
	
		driver.switchTo().parentFrame();//go to parent frame or outer frame
	
		//Get text on outer frame
		String text = driver.findElement(By.xpath("//*[@contenteditable='false']/p")).getText();
	
		System.out.println(text);
	
	}
}
