package com.example.sokol.reminder;

import java.text.SimpleDateFormat;

/**
 * Created by Sokol on 26.03.2017.
 */

public class Utils {
    public static String getDate(long date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        return dateFormat.format(date);
    }

    public static String getTime(long time) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH.mm");
        return timeFormat.format(time);
    }
}
