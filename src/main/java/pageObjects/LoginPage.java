package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
public WebDriver driver;
	
	By id1= By.id("login-username");
	By id2= By.id("login-signin");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement login1()
	{
		return driver.findElement(id1);
	
	}
	
	public WebElement login2()
	{
		return driver.findElement(id2);
	
	}
	
	
}
