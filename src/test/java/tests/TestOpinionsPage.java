package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.OpinionsPage;

/**
 * <h1> Test Opinions Page </h1>
 * 
 * TestOpionsPage is a Selenium Webdriver test that
 * uses the TestNG framework to test the functionality
 * of the opinions link on the CNN HomePage and
 * navigates the user to the opinions page.
 * 
 * @author Kirt.Roby
 */
public class TestOpinionsPage extends TestBase 
{
	
	private HomePage homePage;
	private OpinionsPage opinionsPage;
	
	/**
	 * Initializes Webdriver before the test.
	 * 
	 * @throws IOException If an input or output
	 * 					   exception occurred.
	 */
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializeDriver();
	}
	
	/**
	 * Test steps that leverages objects in both the 
	 * HomePage and the OpinionsPage object repository.  
	 * 
	 * @throws IOException If an input or output
	 * 					   exception occurred.
	 */
	@Test
	public void navigateOpinionsTest() throws IOException
	{
		driver.get(properties.getProperty("baseURL"));
		
		// Create new HomePage object.
		homePage = new HomePage(driver);
		
		// Click on Opinions in the Navigation Bar. 
		homePage.getOpinionButton().click();
		
		// Create new OpinionsPage object.
		opinionsPage = new OpinionsPage(driver);
		
		// Explicit Wait for page title to load.
		WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.titleIs("Opinion, Commentary, Analysis - CNN"));
		
		// Assert that opinion header is displayed.
		// Change assertTrue to assertFalse to take a screenshot.
		WebElement opinionHeader = opinionsPage.getOpinionHeader();
		Assert.assertTrue(opinionHeader.isDisplayed());		
	}
	
	/**
	 * Tears down the current instance of Webdriver. 
	 */
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}	
}