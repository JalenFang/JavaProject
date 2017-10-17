package com.example.DesignPattern.strategy;

import java.util.Locale;

/**
 * author: jalen
 * date: 2017/10/16
 * editor:
 * date:
 * describe:把时间格式化时分秒
 */
 class FormatWithChinese implements FormatTime {
    @Override
    public String format(long millisecond) {
        int second = (int) (millisecond / 1000);
        int hour = second / (60 * 60);
        int second1 = second % (60 * 60);

        int minute = second1 / 60;

        int second2 = second1 % 60;

        return String.format(Locale.CHINESE, "%d小时%d分钟%d秒", hour, minute, second2);
    }
}
