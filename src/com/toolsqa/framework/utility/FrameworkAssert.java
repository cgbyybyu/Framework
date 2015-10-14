package com.toolsqa.framework.utility;


public class FrameworkAssert {

	public static void assertEquals(boolean expected, boolean actual)
	{
		if(expected!=actual)
			throw new RuntimeException("actual doesn't match expected");
	}
}
