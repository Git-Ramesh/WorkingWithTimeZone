package com.rs.app;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithZoneId {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a z");
		ZoneId systemDefault = ZoneId.systemDefault();
		ZoneId utcZoneId = ZoneId.of("UTC");
		LocalDateTime localDateTime = LocalDateTime.now();

		ZonedDateTime defaultZonedDateTime = localDateTime.atZone(systemDefault);
		System.out.println(defaultZonedDateTime.format(formatter));

		ZonedDateTime utcZonedDateTime = defaultZonedDateTime.withZoneSameInstant(utcZoneId);
		System.out.println(utcZonedDateTime.format(formatter));
	}
}
