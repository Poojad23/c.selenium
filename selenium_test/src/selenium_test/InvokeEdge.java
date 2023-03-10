package selenium_test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class InvokeEdge {
	 public static void main(String args[]) throws InterruptedException {
		
		 System.setProperty("webdriver.edge.driver", "E:\\tools\\drivers\\msedgedriver.exe");
		 
		 WebDriver driver = new EdgeDriver();
		 
		 //driver.get("https://www.facebook.com/");
		 driver.navigate().to("https://www.google.com/");
		 driver.manage().window().maximize();
		 Dimension d = new Dimension(200,300);
		 driver.manage().window().setSize(d);
		Thread.sleep(4000);
		 Point p =new Point(250,350);
		 driver.manage().window().setPosition(p);
		 driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
		 //driver.close();
	 }
}
