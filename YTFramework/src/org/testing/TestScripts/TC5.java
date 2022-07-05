package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testing.pages.VideoPlay;
import org.testing.utilities.LogsCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC5 extends Base
{
	@Test
	public void testcase1() throws InterruptedException 
	{
		LoginPage login=new LoginPage(driver, pr);
		login.login("first.last145236@gmail.com", "Network#85");
		LogsCapture.takelogs("TC5 logon successful", "TC5");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		VideoPlay videosub=new VideoPlay(driver, pr);
		videosub.videosubs();
		LogsCapture.takelogs("TC5 executed successfully", "TC5");
		driver.navigate().back();
		LogoutPage signout=new LogoutPage(driver, pr);
		signout.image();
		signout.logout();
		Thread.sleep(5000);
	}
}