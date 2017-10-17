package com.example.DesignPattern.strategy;

import java.util.Locale;

/**
 * author: jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe: 使用冒号格式化时间
 */
class FormatWithColon implements FormatTime {

    @Override
    public String format(long millisecond) {
        int second = (int) (millisecond / 1000);
        int hour = second / (60 * 60);
        int second1 = second % (60 * 60);

        int minute = second1 / 60;

        int second2 = second1 % 60;

        return String.format(Locale.CHINESE, "%d:%d:%d", hour, minute, second2);
    }
}
