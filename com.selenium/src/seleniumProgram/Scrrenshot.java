package seleniumProgram;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrrenshot {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.Google.com");

	TakesScreenshot sc=(TakesScreenshot)driver;

	File source = sc.getScreenshotAs(OutputType.FILE);

	File destination= new File("E:\\pooja_2022_testing\\screenshots\\googlefullPage.png");

	FileHandler.copy(source,destination);

	
	
	//need to take screenshot of webelement/object

	WebElement element = driver.findElement(By.xpath("//*[@class='lnXdpd']"));//google logo

	File source1= element.getScreenshotAs(OutputType.FILE);

	File destination1= new File("E:\\pooja_2022_testing\\screenshots\\googleLogo.png");

	FileHandler.copy(source1,destination1);

	//assignment-->take screen shot of perticular section of webpage

	
	//*[@class='o3j99 ikrT4e om7nvf']
	WebElement element2 = driver.findElement(By.xpath("//*[@class='o3j99 ikrT4e om7nvf']"));//google search area
	
	File source2= element2.getScreenshotAs(OutputType.FILE);
	File destination2= new File("E:\\pooja_2022_testing\\screenshots\\googleSearch.png");
	FileHandler.copy(source2,destination2);
	
	//E:\pooja_2022_testing\take_screenshot
	File source3= element2.getScreenshotAs(OutputType.FILE);
	File destination3= new File("E:\\pooja_2022_testing\\take_screenshot\\googleSearch.png");
	FileHandler.copy(source3,destination3);
}
}

