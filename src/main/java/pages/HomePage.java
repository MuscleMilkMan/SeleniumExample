package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * <h1>HomePage</h1>
 * 
 * Object repository for CNN HomePage
 * using the Page Object Model.
 * 
 * @author Kirt.Roby
 *
 */
public class HomePage
{

public WebDriver driver;
	
	By opinionButton = By.cssSelector(".nav-menu-links__link[href='/opinions']");
	By searchGlass = By.id("search-button");
	By searchInputField = By.id("search-input-field");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getOpinionButton() 
	{
		return driver.findElement(opinionButton);
	}
	
	public WebElement getSearchGlass() 
	{
		return driver.findElement(searchGlass);
	}
	
	public WebElement getSearchInputField() 
	{
		return driver.findElement(searchInputField);
	}
}	