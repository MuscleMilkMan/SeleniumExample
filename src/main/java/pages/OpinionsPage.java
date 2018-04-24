package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpinionsPage {
	
public WebDriver driver;
	
	By opinionHeader = By.cssSelector(".zn-header__text-page_header");
	
	public OpinionsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getOpinionHeader() 
	{
		return driver.findElement(opinionHeader);
	}
}	