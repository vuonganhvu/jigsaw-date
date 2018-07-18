package com.javacodegeeks.jigsaw.date.service;

import java.util.Date;

import org.apache.commons.lang3.time.FastDateFormat;

final class SystemDate implements DateUtil {

	private static final FastDateFormat DATE_FORMAT = FastDateFormat.getInstance("dd-MM-yyyy");

	@Override
	public String getSystemDate() {
		return DATE_FORMAT.format(System.currentTimeMillis());
	}

	@Override
	public String format(final Date date) {
		return DATE_FORMAT.format(date);
	}
}
