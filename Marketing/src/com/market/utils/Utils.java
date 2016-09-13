package com.market.utils;

import java.util.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Utils {
	/**
	 * 把Date转换成String类
	 * @param date
	 * @return
	 */
public static String date2String(Date date){
	DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
	return format.format(date);
}
public static Date string2Date(String date) throws ParseException{
	DateFormat format=new SimpleDateFormat();
	return format.parse(date);
}
/**
 * 把Timestamp转换成String类
 * @param tamp
 * @return
 */
public static String timestamp2String(Timestamp tamp){
	DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
	return format.format(tamp);
}
}
