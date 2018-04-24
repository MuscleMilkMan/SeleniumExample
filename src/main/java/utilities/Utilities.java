package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import tests.TestBase;

/**
 * <h1>Utilities Class</h1>
 * 
 * Class that holds utility functions
 * 
 * @author Kirt.Roby
 */
public class Utilities extends TestBase 
{
	/**
	 * Grabs a screenshot with test result name on
	 * test failure. 
	 * 
	 * @param result from failure
	 * @throws IOException
	 */
	public void getScreenshot(String result) throws IOException 
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("FailedTestScreenshots/"+result+"screenshot.png"));			
	}

}
