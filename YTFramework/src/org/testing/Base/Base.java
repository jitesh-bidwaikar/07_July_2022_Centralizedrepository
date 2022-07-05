package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Base 
{
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void browseropen() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.get("https://www.youtube.com/");
		Options op= driver.manage();
		Window w= op.window();
		w.maximize();
		File f=new File("../YTFramework/ObjectRepository.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
	}
	@AfterMethod
	public void browserclose() 
	{
		driver.close();
	}
}
