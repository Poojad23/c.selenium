package seleniumProgram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DrpDown {
	public static void main(String[] args) {
		//How to handle static dropdown?

		//step 1. first invoke the browser and launch the url.


		System.setProperty("webdriver.chrome.driver", "E:\\Tools\\ChromeD\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		//step 2. locate the dropdown on webpage and store it in a variable having return type is WebElement


		WebElement drpdwnele = driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));


		//step 3. create the object of Select class and pass our webelement in the cunstructor of Select class


		//Select s= new Select(driver.findElement(By.xpath("//select[@id='Form_submitForm_Country']")));

		Select s= new Select(drpdwnele);


		//step 4  Three methods are there in select class to select the rquired option from drop down
		//selectByIndex()
		//selectByValue("India")
		//selectByVisibleText("Austrellia")

		//step 5.use any one of them
		//s.selectByValue("Australia");
		//s.selectByVisibleText("Australia");
		//s.selectByIndex(12);





		//u can also select option without using select class method

		//captur all the options and  store it in a variable having return type List<WebElement>
		//use for each loop
		//get each and every option in one temporary variable
		//inside for each loop use if condition and get the text of each option and equals it with our required option
		//if the if condition is true control will go inside and then click on that option by using click method

		List<WebElement> alloption = s.getOptions();

		for(WebElement Option :alloption) {

			if(Option.getText().equals("Australia")) {

				Option.click();
				break;


			}

		}


	}



}
