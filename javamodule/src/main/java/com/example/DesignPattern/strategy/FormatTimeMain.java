package com.example.DesignPattern.strategy;

/**
 * author: jalen
 * date: 2017/10/17
 * editor:
 * date:
 * describe: 策略模式的入口
 */
public class FormatTimeMain {
    public static void main(String[] args) {
        StrategyContains strategyContains = new StrategyContains(new FormatWithChinese());
        System.out.println(strategyContains.format(155796986));

        StrategyContains strategyContains1 = new StrategyContains(new FormatWithColon());
        System.out.println(strategyContains1.format(155796986));
    }
}
