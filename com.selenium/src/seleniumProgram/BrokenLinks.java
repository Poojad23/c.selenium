package seleniumProgram;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");

		//declare the variable for taking broken link count having value 0

		int brokenlinkcount=0;

		//locate all the links which are present on web page by using findelements() and Tagname locator which returns List<WebElement>
		List<WebElement> totalLink = driver.findElements(By.tagName("a"));

		// get the count of all links and store it into one variable 
		int count = totalLink.size();

		try {

			//used for each loop to iterate total links one by one
			for(WebElement singlelink:totalLink) {

				//get value of href  attribute by using getAttribute()
				String url = singlelink.getAttribute("href");
				//System.out.println("pooja "+url);
				//check weather link is empty or not
				if(url==null || url.isEmpty()) {

					System.out.println("url is empty and no target page is there");
					continue;
				}

				//create the object of URL class
				//for converting url into URL format because url is in the string format.


				URL link = new URL(url);

				//need to establish connection with server for that we have to type cast
				//HttpURLConnection with openconnection()

                                         


				HttpURLConnection httoconn = (HttpURLConnection) link.openConnection();
				//then use connect method to connect with server
				httoconn.connect();//it will connect to server

				//we are checking if the response code is greater than or = 400 that time the url is considered as broken link and you can increase count 

				//if response code is not  greater than or = 400 that time the url is considered as valid link 
				if(httoconn.getResponseCode()>=400) {

					System.out.println(httoconn.getResponseCode() + " "+ url + " is broken link" );

					brokenlinkcount++;

				}
				else {

					System.out.println(httoconn.getResponseCode() + url+ "is valid link");
				}


			}


		}catch(Exception e) {
			System.out.println("number of broken link" + brokenlinkcount);
		}



	}




}
