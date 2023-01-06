package ai.DS.apps.Utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.DS.apps.Testbase.TestBase;

public class Listnersetup extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test execution started " +result.getName());
		// getName method is used to get name of method
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		logger.info("Test execution completed " +result.getName());
	}
//getname- we get method name / System.currentTimemillis- current time for screenshot
	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test execution failed " +result.getName());
		
		try {
			Utilclass.Screenshot(result.getName()+System.currentTimeMillis());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		logger.info("Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		logger.info("Test execution skipped " +result.getName());
		
	}

	}
