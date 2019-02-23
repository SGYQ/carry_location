package com.mk.common.util;

public class StringUtil
{
	public static boolean isEmpty(String str)
	{
		if( str==null || "".equals(str) )
			return true;
		
		return false;
	}
	
	/**
	 * 处理NUll值
	 * @param str
	 * @return
	 */
	public static String filterNull(String str)
	{
		if( str==null )
			return "";
		
		return str;
	}
	
}
