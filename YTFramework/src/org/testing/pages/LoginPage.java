package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	ChromeDriver driver;
	Properties pr;
	public LoginPage(ChromeDriver driver, Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void login(String user, String password) throws InterruptedException 
	{
		WebElement signin=driver.findElementByXPath(pr.getProperty("signin"));
		signin.click();
		WebElement email=driver.findElementByXPath(pr.getProperty("email"));
		email.sendKeys(user);
		WebElement next1=driver.findElementByXPath(pr.getProperty("next1"));
		next1.click();
		Thread.sleep(2000);
		WebElement pass=driver.findElementByXPath(pr.getProperty("password"));
		pass.sendKeys(password);
		WebElement next2=driver.findElementByXPath(pr.getProperty("next2"));
		next2.click();
	}
}
