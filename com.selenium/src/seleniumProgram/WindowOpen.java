package seleniumProgram;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowOpen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.findElement(By.xpath("//a[text()='Terms']")).click();		

		//Get window handle method give only single browser window id
		String id=driver.getWindowHandle();
		System.out.println(id);

		//getWindowHandles() method give id of all window which are open
		//it returns Set<String>
		Set<String> ids = driver.getWindowHandles();

		System.out.println(ids.size());//2
		System.out.println(ids);//


		Iterator<String> it = ids.iterator();

		String parentwindowid = it.next();//parent 
		String childwindowid = it.next();

/*------xyz(iterator)
      1 parent id
       2 child id*/

		driver.switchTo().window(childwindowid);

		driver.findElement(By.xpath("//a[text()='About these terms'][1]")).click();

		driver.switchTo().window(parentwindowid);

	}
}
