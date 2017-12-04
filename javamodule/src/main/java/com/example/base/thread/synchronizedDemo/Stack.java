package com.example.base.thread.synchronizedDemo;

/**
 * author: jalen
 * date: 2017/12/4
 * editor:
 * date:
 * describe: 同步方法
 */
public class Stack {
 /*   synchronized 除了上面讲的放在对象前面限制一段代码的执行外，还可以放在方法声明中，表示整个方法为同步方法。
    如果synchronized用在类声明中，则表明该类中的所有方法都是synchronized的。*/


    int idx = 0;
    char data[] = new char[6];

    public void push(char c) {
        synchronized (this) {
            data[idx] = c;
            idx++;
        }
    }

    public char pop() {
        synchronized (this) {
            idx--;
            return data[idx];
        }
    }
}
