package com.example.base.reflection;

import java.lang.reflect.Field;

/**
 * author: jalen
 * date: 2017/11/15
 * editor:
 * date:
 * describe:发射的基本使用
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> aClass = Class.forName("com.example.base.reflection.Person");
            Class<Person> personClass = Person.class;
            Person person = new Person();
            Class<? extends Person> aClass1 = person.getClass();


            Field[] declaredFields = aClass.getDeclaredFields();//获取class对象的所有属性
            Field declaredField = declaredFields[1];

          /*  String name = declaredField.getName();
            System.out.println("name = " + name);

            int value = declaredField.getInt(aClass);
            System.out.println(" value = " + value);*/

            Person o = (Person) aClass.newInstance();

            int b = o.b;
            System.out.println("b = " + b);
            Field[] fields = aClass.getFields();//获取class对象的public属性

            Field field = fields[0];
            int anInt = field.getInt(o);
            System.out.println(" value = " + anInt);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
