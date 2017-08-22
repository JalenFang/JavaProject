package com.example.days;

/**
 * @author Jalen
 * @date 2017/8/14
 * @editor
 * @date
 * @describe
 */
public class Day2 {

    public static void test() {
        //false  true    Long 包装类型常量 cache 为 -128 ～ 127 之间，所以 l1 和 l2 是两个对象，== 比较的是对象的地址，
        // 所以第一个打印为 false；接着由于包装类型在表达式中且表达式中至少有一个不是包装类型，
        // 所以 Long l1== 128L 中 l1 自动拆箱比较，所以数值比较为 true。
        Long l1 = 128L;
        Long l2 = 128L;
        System.out.print((l1 == l2) + " " + (l1 == 128L));
        System.out.print("\n");

        // Long 包装类型 -128 - 127 之间的值 Java 维护在一个常量池中，所以 l1 和 l2 引用同一个对象
        Long l3 = 127L;
        Long l4 = 127L;
        System.out.print((l3 == l4) + " " + (l4 == 127L));
    }

}
