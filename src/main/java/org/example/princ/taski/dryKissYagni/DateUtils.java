package org.example.princ.taski.dryKissYagni;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
  public static String formatDateForDisplay(Date date, String format) {
    return new SimpleDateFormat(format).format(date);
  }
}