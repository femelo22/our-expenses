package com.lfmelo.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateX {
	
	
	public static LocalDateTime convertDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime dateTime = LocalDateTime.parse(date, formatter);
		return dateTime;
	}

	
}
