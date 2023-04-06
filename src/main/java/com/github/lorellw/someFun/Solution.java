package com.github.lorellw.someFun;

public class Solution {

    /*
    The function must accept a non-negative integer.
    If it is zero, it just returns "now".
    Otherwise, the duration is expressed as a combination of years, days, hours, minutes and seconds.
     */

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        StringBuilder result = new StringBuilder("");
        String[] durations = new String[]{"year", "day", "hour", "minute", "second"};
        int[] temp = new int[]{31536000, 86400, 3600, 60, 1};
        int quantity;
        for (int i = 0; i < 5; i++) {
            if (seconds >= temp[i]) {
                quantity = seconds / temp[i];
                seconds %= temp[i];
                result.append(result.toString().equals("") ? "" : (seconds == 0 ? " and " : ", "))
                        .append(quantity)
                        .append(" ")
                        .append(durations[i])
                        .append(quantity > 1 ? "s" : "");
            }
        }

        return result.toString();
    }
}
