package com.robert.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringUtil {
	
	public static String getRewardSendInfoId(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		return sdf.format(Calendar.getInstance().getTime());
	}
	
}
