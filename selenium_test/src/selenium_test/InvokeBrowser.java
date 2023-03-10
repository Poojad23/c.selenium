package selenium_test;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvokeBrowser {
	 public static void main(String args[]) throws InterruptedException{
		
		 System.setProperty("webdriver.chrome.driver", "E:\\tools\\ChromeD\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();

		 driver.get("https://www.facebook.com/");//url

		 System.out.println(driver.getTitle());   //console output : Facebook – log in or sign up
		
		 Dimension  d = new Dimension(200,300);
		 driver.manage().window().setSize(d);
		
		 Thread.sleep(4000);
		
		 driver.manage().window().maximize();
		 Point  p = new Point(600,700);
		
		 driver.manage().window().setPosition(p);
		 driver.close();
		 String actual = driver.getTitle();
			
			String expected="Facebook – log in or sign up";
			
			boolean result = actual.equalsIgnoreCase(expected);
			
			if(result==true) {
				
				System.out.println("pass");
			}else {
				
				System.out.println("fail");
			}
	 }
}
