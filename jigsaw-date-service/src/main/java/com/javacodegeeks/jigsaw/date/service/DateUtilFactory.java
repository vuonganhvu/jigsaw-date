package com.javacodegeeks.jigsaw.date.service;

public final class DateUtilFactory {

	private DateUtilFactory() {
		throw new IllegalStateException("Instantiation not allowed");
	}
	
	public static final DateUtil SYSTEM_DATE = new SystemDate();
}
