package seleniumProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver {
	//move cursor from one element to another
		//right click
		//double click
		//drag and drop
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "E:\\tools\\Crome\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_myh38910a_e&adgrpid=57794344246&hvpone=&hvptwo=&hvadid=486386895969&hvpos=&hvnetw=g&hvrand=1694694353626768705&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-362216169274&hydadcr=5620_2175696&gclid=CjwKCAiA9tyQBhAIEiwA6tdCrMp_8QE8OWCWP7bEoWLoXF33CruvLqUoJ46GricDkGheoeec59dxThoCdU4QAvD_BwE");
			//Thread.sleep(5000);
			WebElement Element1 = driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));//hello signin

			WebElement Element2 = driver.findElement(By.xpath("//*[@class='nav-action-inner']"));//

			Actions a= new Actions(driver);

			a.moveToElement(Element1).moveToElement(Element2).click().build().perform();
		}
}
