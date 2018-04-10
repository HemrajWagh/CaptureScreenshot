package com.qa.custume;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.qa.screenshot.captureScreenshot;

public class custumeListener extends TestListenerAdapter {
	
	public void onTestFailure(ITestResult tr )
	{
		TakesScreenshot ts = (TakesScreenshot)captureScreenshot.driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./Screenshot/"+tr.getName()+".png"));
		} catch (IOException e) {
		}
		
	}

}
