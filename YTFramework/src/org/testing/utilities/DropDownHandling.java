package org.testing.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling 
{
	public static void withindexnumber(int index, WebElement element) 
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public static void withvisibletext(String visibletext, WebElement element) 
	{
		Select s=new Select(element);
		s.selectByVisibleText(visibletext);
	}
	public static void withvalue(String value, WebElement element) 
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
}
