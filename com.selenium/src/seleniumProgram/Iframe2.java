package seleniumProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("http://demo.automationtesting.in/Frames.html");

		//locate Iframe with in an Iframe Tab and click on it

		driver.findElement(By.xpath("//*[text()='Iframe with in an Iframe']")).click();


		//Locate outer frame as webelement and shift selenium focouse from main page to outer frame

		WebElement outerframe = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));// //*[@id="Multiple"]/iframe

		driver.switchTo().frame(outerframe);//pass iframe as weblement



		//Locate innerframe as webelement and shift selenium focouse from ouetrframe to inner frame

		WebElement innerframe =driver.findElement(By.xpath("//*[@style='float: left;height: 250px;width: 400px']"));
		driver.switchTo().frame(innerframe);

		//perform the action on inner frame
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Hi");


	}
}
