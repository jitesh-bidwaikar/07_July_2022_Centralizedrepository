package org.testing.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.pages.LoginPage;
import org.testing.pages.LogoutPage;
import org.testing.utilities.LogsCapture;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC6 extends Base
{
	@Test
	public void testcase1() throws InterruptedException 
	{
		LoginPage login=new LoginPage(driver, pr);
		login.login("first.last145236@gmail.com", "Network#85");
		LogsCapture.takelogs("TC6 logon successful", "TC6");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement video=driver.findElementByXPath(pr.getProperty("video"));
		video.click();
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		/*WebElement commentclick=driver.findElementByXPath(pr.getProperty("commentclick"));
		commentclick.click();*/
		WebElement comment=driver.findElementByXPath(pr.getProperty("comment"));
		comment.sendKeys("Nice video");
		LogsCapture.takelogs("TC6 executed successfully", "TC6");
		driver.navigate().back();
		LogoutPage signout=new LogoutPage(driver, pr);
		signout.image();
		signout.logout();
		Thread.sleep(5000);
	}
}
