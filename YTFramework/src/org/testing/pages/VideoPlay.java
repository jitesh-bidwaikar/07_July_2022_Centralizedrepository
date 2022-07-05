package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlay 
{
	ChromeDriver driver;
	Properties pr;
	public VideoPlay(ChromeDriver driver, Properties pr) 
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void videolike() throws InterruptedException 
	{
		WebElement video=driver.findElementByXPath(pr.getProperty("video"));
		video.click();
		Thread.sleep(1000);
		WebElement like=driver.findElementByXPath(pr.getProperty("like"));
		like.click();
	}
	public void videosubs() 
	{
		WebElement video=driver.findElementByXPath(pr.getProperty("video"));
		video.click();
		WebElement subs=driver.findElementByXPath(pr.getProperty("videosubs"));
		subs.click();
	}
}
