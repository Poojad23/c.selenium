package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
			
		
		//browser invoking code
		
		
		public  WebDriver driver;

		public Properties prop;


		public WebDriver initializeDriver() throws IOException  {

			//code for driving value from .propertiesfile

			Properties prop= new Properties();

			FileInputStream fis= new FileInputStream("E:\\eclips_workspace\\maventest\\src\\main\\java\\resources\\data.properties");

			prop.load(fis);

			System.out.println(prop.getProperty("browser"));//chrome

			String browserName = prop.getProperty("browser");
			
			if (browserName.equals("chrome")) {


				System.setProperty("webdriver.chrome.driver", "E:\\Tools\\ChromeD\\chromedriver.exe");

				 driver = new ChromeDriver();


			}else if(browserName=="firefox") {


				//firefox code


			} else if(browserName=="IE") {

				//IE code

			}
			return driver;


	}
}

