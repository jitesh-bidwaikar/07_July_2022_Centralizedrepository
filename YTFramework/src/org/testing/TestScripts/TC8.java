package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.pages.HomePage;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testing.utilities.LogsCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC8 extends Base
{
	@Test
	public void testcase1() throws InterruptedException 
	{
		LoginPage login=new LoginPage(driver, pr);
		login.login("first.last145236@gmail.com", "Network#85");
		LogsCapture.takelogs("TC8 logon successful", "TC8");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		HomePage home=new HomePage(driver, pr);
		home.library();
		LogsCapture.takelogs("TC8 executed successfully", "TC8");
		LogoutPage signout=new LogoutPage(driver, pr);
		signout.image();
		signout.logout();
		Thread.sleep(5000);
	}
}
