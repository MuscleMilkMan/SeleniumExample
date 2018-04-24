package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * <h1>TestBase Class</h1>
 * 
 * Base class to implement common methods
 * amongst all test cases. 
 */
public class TestBase 
{
	public static WebDriver driver;
	public Properties properties;
	
	/**
	 * <h2>Initialize Webdriver.</h2>
	 * 
	 * Utilizes the input stream config file to change properties
	 * associated with browser implemented. 
	 * 
	 * @return driver. 
	 * @throws IOException 
	 */
	public WebDriver initializeDriver() throws IOException 
	{
		
		// Browser configuration.
		properties = new Properties();
			FileInputStream fileInputStream = new FileInputStream("src/main/java/config/BrowserConfiguration.properties");
		
		properties.load(fileInputStream);
			String browserName = properties.getProperty("browser");
		
		if(browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browserName.equals("firefox")) 
		{
			driver = new FirefoxDriver();	
		}
		
		else if (browserName.equals("IE")) 
		{
			driver = new InternetExplorerDriver();
		}
		
		// Maximize browser.
		driver.manage().window().maximize();
		
		// Implicit 'global' timer. 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}
