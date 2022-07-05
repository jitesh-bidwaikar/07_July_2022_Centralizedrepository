package org.testing.assertions;

public class Assert1 
{
	public static void assertion1(String actual, String expected, String[]msg) 
	{
		if (actual.equals(expected))
		{
			System.out.println(msg[0]);
		}
		else 
		{
			System.out.println(msg[1]);
		}
	}
}
