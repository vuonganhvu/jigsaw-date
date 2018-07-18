package com.javacodegeeks.jigsaw.date.cli;

import java.util.Date;

import com.javacodegeeks.jigsaw.date.service.DateUtil;
import com.javacodegeeks.jigsaw.date.service.DateUtilFactory;

public final class Main {

	private Main() {
		throw new IllegalStateException("Instantiation not allowed");
	}

	public static void main(final String[] args) {
		final DateUtil systemDate = DateUtilFactory.SYSTEM_DATE;

		System.out.printf("System date is : %s\n", systemDate.getSystemDate());
		System.out.printf("System date is : %s\n", systemDate.format(new Date()));
	}
}
