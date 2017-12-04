package com.example.base.stringSample;

/**
 * author: jalen
 * date: 2017/12/1
 * editor:
 * date:
 * describe: String类的常用方法
 */
public class StringDemo {
    public static void main(String[] args) {
        String desc = "我是好人";

        //一个汉字占几个字节 根据不同的编码会有不同 utf-8编码 一个汉字占三个字节
        byte[] bytes = desc.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
                    /*-26
                    -120
                    -111
                    -26
                    -104
                    -81
                    -27
                    -91
                    -67
                    -28
                    -70
                    -70*/
        }

        char[] chars = desc.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
           /* 我
              是
              好
              人*/
        }

        String a = "哈哈";
        String b = "哈哈";
        //equals方法比较的原理是检查组成字符串内容的字符是否完全一致
        //equalsIgnoreCase 比较的时候忽略大小写
        //toUpperCase toLowerCase 转换大小写
        // ==和equals的区别 ==比较的两个对象的引用是否指向同一个对象

        System.out.println(a.equals(b));
        System.out.println(a == b);

        //
    }
}
