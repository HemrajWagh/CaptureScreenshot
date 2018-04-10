package com.qa.screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class captureScreenshot {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void createDriverInstance() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
	}
	
	@Test(priority=1)
	public void tc_1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("selenium");
		
		Thread.sleep(2000);
		Assert.assertEquals("test", "test123");
	}
	@Test(priority=2)
	public void tc_2() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("appium");
		Thread.sleep(3000);
		Assert.assertEquals("test", "test123");
	}
	
}
