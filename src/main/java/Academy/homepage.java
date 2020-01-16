package Academy;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class homepage extends base {

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void basepagenav() throws IOException
	{
		
		
		LandingPage l = new LandingPage(driver);
		l.signin().click();
		
		LoginPage a= new LoginPage(driver);
		a.login1().click();
		a.login1().sendKeys("abc");
		a.login2();
	}
	
}
