package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.Utilities;


/**
 * <h1>Auto-generated Listener class.</h1>
 * Implemented to listen on test.
 *  
 * @author Kirt.Roby
 *
 */
public class Listeners implements ITestListener 
{
	public void onFinish(ITestContext arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		
	}
	/**
	 * Grabs a screenshot by test name on failure. 
	 */
	public void onTestFailure(ITestResult result) 
	{
		Utilities myUtilities = new Utilities();
		
		try {
			myUtilities.getScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) 
	{
		// TODO Auto-generated method stub
		
	}
}