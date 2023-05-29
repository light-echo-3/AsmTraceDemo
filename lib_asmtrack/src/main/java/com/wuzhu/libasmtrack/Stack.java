package com.wuzhu.libasmtrack;

import java.util.LinkedList;

@NotTrack
public class Stack<T> {

    private LinkedList<T> storage = new LinkedList<T>();

    /**
     * 入栈
     */
    public void push(T v) {
        storage.push(v);
    }

    /**
     * 出栈，但不删除
     */
    public T peek() {
        return storage.peek();
    }

    /**
     * 出栈
     */
    public T pop() {
        return storage.pop();
    }

    /**
     * 栈是否为空
     */
    public boolean isEmpty() {
        return storage.isEmpty();
    }

    /**
     * 打印栈元素
     */
    public String toString() {
        return storage.toString();
    }

}
