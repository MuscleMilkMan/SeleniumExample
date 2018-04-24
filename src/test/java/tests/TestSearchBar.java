package tests;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

/**
 * <h1> Test Search bar </h1>
 * 
 * TestSearchBar is a Selenium Webdriver test that
 * uses the TestNG framework to test the functionality
 * of the searchbar on the CNN HomePage.
 * 
 * @author Kirt.Roby
 *
 */
public class TestSearchBar extends TestBase
{
	private HomePage homePage;
	
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
	 * Test steps that leverages objects 
	 * in the HomePage object repository.
	 * 
	 * @throws IOException If an input or output
	 * 					   exception occurred.
	 */
	@Test
	public void testSearchBar() throws IOException
	{
		driver.get(properties.getProperty("baseURL"));
				
		// Create new HomePage object.
		homePage = new HomePage(driver);

		// Click on search magnifying glass in the Navigation Bar. 
		homePage.getSearchGlass().click();
		
		// TODO: Finish test.
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