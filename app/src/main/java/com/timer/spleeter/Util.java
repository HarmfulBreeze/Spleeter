package com.timer.spleeter;

public class Util {
    public static String formatTimerString(int time){
        int t = Math.abs(time);
        int hours = t / (60 * 60 * 10);
        t %= 60 * 60 * 10;
        int minutes = t / (60 * 10);
        t %= 60 * 10;
        int seconds = t / 10;
        t %= 10;
        int hundredths = t;
        String s = String.format("%02d:%02d:%02d.%d", hours, minutes, seconds, hundredths);
        return time >= 0 ? s : "-" + s;
    }
}
