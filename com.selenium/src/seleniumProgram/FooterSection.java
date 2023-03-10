package seleniumProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSection {
	public static void main(String[] args) {
		//browser invoke
		System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		//url launch

		driver.get("https://www.fujitsu.com/in/");

		//count of link in the footer section

		//1. inspect the footersection and locate it .store footer section As a webelement in variable 
                    // having return type webelement

		WebElement footerdriver = driver.findElement(By.xpath("//*[@id='footer']/div[1]"));

		//2.use find elements method and tagname locator to locate all the links in footer section
                   // and use size method to get the total count of link on footer section
		
		//System.out.println(footerdriver.findElements(By.tagName("a")).size());

		//find the links in the perticular column of the footer section

		//we need to inspect perticular coloumn of footer section with help of footer driver

		WebElement coloumndriver = footerdriver.findElement(By.xpath("//*[@id='footer-nav-a']/ul/li[1]"));

		//we need to use findElements method and tagname locator to locate the total link on the coloumn and then
		//we need to use size method to get count of link present on the coloumn.

		int countofLinkinColoumn = coloumndriver.findElements(By.tagName("a")).size();
		System.out.println(countofLinkinColoumn);
		//click on each each link of the coloumn 

		//need to use for loop and iterate it up to total count of link

		//then you have to used keys .chord method to perform the keybord action .
		//in that method you have to pass keys.control,keys.enter 
		//this key bord action open each link in new tab.
		//locate the all links present on coloumn and get the each link by using get(i) method and perform keybord action
                
		for(int i=0;i<countofLinkinColoumn;i++) {

			//control+enter

			String clickonlink=Keys.chord(Keys.CONTROL,Keys.ENTER);
		
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);


		}



		//Get the titles of each child window

		Set<String> abc = driver.getWindowHandles();

		Iterator<String> it = abc.iterator();

		while(it.hasNext()){

			driver.switchTo().window(it.next());//praent window id ,child,

			System.out.println(driver.getTitle());

		}


	}
}
