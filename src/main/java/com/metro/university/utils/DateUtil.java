/**
 * 
 */
package com.metro.university.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Date Util.
 * 
 * @author Hasan Yosin
 *
 */
public final class DateUtil {
	/**
	 * Logger.
	 */
	private static final Logger LOG = Logger.getLogger(DateUtil.class);

	/**
	 * Get date.
	 * 
	 * @return String date
	 */
	public static String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd_hh:mm:ss");
		return dt.format(date).toString();
	}
}
