package com.example.base.generics;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/**
 * author: jalen
 * date: 2017/11/15
 * editor:
 * date:
 * describe: 泛型的使用
 */
public class GenericsDemo {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>("name", "dragon");
        System.out.println(container1.getKey() + " : " + container1.getValue());

        Container<String, Integer> container2 = new Container<>("stature", 175);
        System.out.println(container2.getKey() + " : " + container2.getValue());

        out("哈哈");

        System.out.println(fun("做梦吧!"));

        List<Integer> testList1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            testList1.add(i);
        }
        out(testList1);

        List<String> testList2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            testList2.add(i + "好的");
        }
        out(testList2);

    }

    //泛型类
    public static class Container<K, V> {
        private K key;
        private V value;

        //泛型构造方法
        public Container(K k, V v) {
            key = k;
            value = v;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    //泛型方法
    public static <T> void out(T t) {
        System.out.println("输出: " + t);
    }

    //泛型方法
    public static <T> T fun(T t) {   // 可以接收任意类型的数据
        return t;
    }

    //类型通配符 ? 它可以匹配任何类型
    public static void out(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // 上限通配符  使用extends关键字指定这个类型必须是继承某个类，或者实现某个接口，也可以是这个类或接口本身。
    public static void add() {
        List<? extends Shape> list = new ArrayList<Circle>();
    }

    //下限通配符 ，使用super关键字指定这个类型必须是是某个类的父类，或者是某个接口的父接口，也可以是这个类或接口本身。
    public static void test() {
        List<? super Circle> list = new ArrayList<Shape>();

    }
}
