package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshotcapture 
{
	public static void takescreenshots(ChromeDriver driver, String FilePath) throws IOException 
	{
		File f=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(FilePath));
	}
}
