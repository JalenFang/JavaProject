package com.example.DesignPattern.strategy;

/**
 * author: jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe: 策略模式的入口
 */
class StrategyContains {
    private FormatTime formatTime;

    StrategyContains(FormatTime formatTime) {
        this.formatTime = formatTime;
    }

    String format(long millisecond) {
        return formatTime.format(millisecond);
    }
}
