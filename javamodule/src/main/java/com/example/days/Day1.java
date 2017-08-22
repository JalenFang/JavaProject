package com.example.days;

/**
 * @author Jalen
 * @date 2017/8/14
 * @editor
 * @date
 * @describe
 */
public class Day1 {


    public static void test() {

        //编译出错   List<Object>和ArrayList<Long>没有继承关系。
       /* List<Object> obj = new ArrayList<Long>();
        obj.add("I love Android!");*/

        //编译可以，运行出错。   数组是在运行时类型检查
        Object[] objArray = new Long[1];
        objArray[0] = "I love Android!";


    }
}
