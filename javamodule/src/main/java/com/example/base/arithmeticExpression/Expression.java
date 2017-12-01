package com.example.base.arithmeticExpression;

/**
 * author: jalen
 * date: 2017/11/30
 * editor:
 * date:
 * describe:算术表达式
 */
public class Expression {

    public static void main(String[] args) {
        int a = 10, b = 30, c;

        a += b;//40
        System.out.println("a  = " + a);

        a -= b;//10
        System.out.println("a = " + a);

        a *= b;//300
        System.out.println("a = " + a);

        a /= b;//10
        System.out.println("a = " + a);

        a %= b;//10
        System.out.println("a = " + a);

        b %= a;//0
        System.out.println("b = " + b);

        /**
         * 运算过程
         *a的值为10 10 % 5 = 0
         * 然后a的值减一 a = 9
         */
        System.out.println(a-- % 5 > 0 ? "true" : "false");//false
        System.out.println("a = " + a);//9

        /**
         * a的初始值9
         * a的值减一为8
         * 8%5 = 3
         */
        System.out.println(--a % 5 > 0 ? "true" : "false");//true

        c = -7 / 5;
        /**
         * 7/5 = 1.4
         * 然后添加一个符号 -1.4
         * 取整为-1
         */
        System.out.println("c = " + c);//-1

        c = -7 % 5;
        System.out.println("c = " + c);//-2

        c = 7 % -5;
        System.out.println("c = " + c);//2

    }
}
