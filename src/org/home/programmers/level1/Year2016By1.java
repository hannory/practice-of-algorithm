package org.home.programmers.level1;

import java.util.Calendar;
import java.util.Locale;

class Year2016By1 {
	public String getDayName(int month, int day) {
		Calendar cal = new Calendar.Builder().setCalendarType("iso8601")
				.setDate(2016, month - 1, day).build();
		return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();
	}
}
