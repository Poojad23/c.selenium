package seleniumProgram;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Script {
public static void drawborder(WebElement element,WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='5px solid yellow'", element);
		
		
	}
	
	
	
public static String getTitleByJS(WebDriver driver) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString();
		
		return title;
	}




public static void clickElementByJS(WebElement element,WebDriver driver) {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", element);
	
	
	
	
}

public static void generatealert(WebDriver driver,String message) {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("alert('" + message +"')");
	
	
}


public static void scrollDown(WebDriver driver) {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	
}

public static void scrollUp(WebDriver driver) {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	
}

public static void scrolldownPage(WebDriver driver) {
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000)");
	
	
}

}
