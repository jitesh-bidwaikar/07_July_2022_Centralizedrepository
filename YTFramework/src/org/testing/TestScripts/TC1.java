package org.testing.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.assertions.Assert1;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.Screenshotcapture;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC1 extends Base
{
	@Test
	public void testcase1() throws InterruptedException, IOException 
	{
		String expectedurl="https://www.youtube.com/";
		LoginPage login=new LoginPage(driver, pr);
		login.login("first.last145236@gmail.com", "Network#85");
		Screenshotcapture.takescreenshots(driver, "D:\\Java Selenium\\Screenshots\\TC1\\first_1.jpg");
		LogsCapture.takelogs("Login is successful", "TC1");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LogoutPage signout=new LogoutPage(driver, pr);
		signout.image();
		WebElement emailid= driver.findElementByXPath("//yt-formatted-string[@title='first.last145236@gmail.com']");
		String expectedresult =emailid.getText();
		System.out.println(expectedresult);
		Assert.assertEquals("first.last145236@gmail.com", expectedresult);
		String[]msg=new String[2];
		msg[0]="Assertions is passed";
		msg[1]="Assertions failed";
		Assert1.assertion1(driver.getCurrentUrl(), expectedurl, msg);
		System.out.println(driver.getCurrentUrl());
		HomePage home=new HomePage(driver, pr);
		home.Explorer();
		Screenshotcapture.takescreenshots(driver, "D:\\Java Selenium\\Screenshots\\TC1\\first_2.jpg");
		home.trending();
		Screenshotcapture.takescreenshots(driver, "D:\\Java Selenium\\Screenshots\\TC1\\first_3.jpg");
		LogsCapture.takelogs("TC1 executed successfully", "TC1");
		signout.image();
		signout.logout();
	}
	
}
