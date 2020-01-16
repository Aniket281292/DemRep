package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		
		 prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\anike\\E2EProject\\src\\main\\java\\resources\\abc.properties");
	prop.load(fis);
	
	String browsername=prop.getProperty("browser");
	
	if (browsername.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\workSel\\chromedriver.exe");
		 driver= new ChromeDriver();
		
	}
	else if (browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\workSel\\geckodriver.exe") ;
		 driver=new FirefoxDriver() ;
	}
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	}

}
