package com.example.days;

/**
 * @author Jalen
 * @date 2017/8/14
 * @editor
 * @date
 * @describe
 */
public class Day4 {
    //数值 NaN 代表 not a number，无法用于比较
    public static void test() {
        double i = Double.NaN;
        double j = Double.NaN;
        System.out.print(i > j || i <= j);
    }
}

