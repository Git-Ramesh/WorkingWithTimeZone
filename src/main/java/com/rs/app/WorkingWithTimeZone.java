package com.rs.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class WorkingWithTimeZone {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getDefault();
		TimeZone timeZone2 = TimeZone.getTimeZone("UTC");
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss a Z");
		dateFormat.setTimeZone(timeZone);
		System.out.println(dateFormat.format(date));
		dateFormat.setTimeZone(timeZone2);
		System.out.println(dateFormat.format(date));
	}
}
