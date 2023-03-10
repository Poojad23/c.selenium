package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);			
	
	}
	
	
	@FindBy(xpath="//*[@name='login']")
	WebElement username;
	
	@FindBy(xpath="//*[@name='passwd']")
	WebElement passwd;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement signin;
	
	
	public WebElement login(){
		return username;
	}
	
	public WebElement passwd(){
		return passwd;
	}
	public WebElement submit(){
		return signin;
	}
	
	
	 
}
