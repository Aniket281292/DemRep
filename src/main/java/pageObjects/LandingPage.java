package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By id= By.cssSelector("a[href*='login']");
	
	public LandingPage(WebDriver driver2)
	{
		driver=driver2;
	}
	
	public WebElement signin()
	{
		return driver.findElement(id);
	}
	
}
