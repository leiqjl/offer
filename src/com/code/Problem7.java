package com.code;

import java.util.Stack;

/**
 * 用两个栈实现一个队列。
 */
public class Problem7 {

    public static void main(String[] args) {
        QueueByTwoStack<Integer> queue = new QueueByTwoStack<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
    }
}
class QueueByTwoStack<E> {
    private Stack<E> s1 = new Stack<>();
    private Stack<E> s2 = new Stack<>();

    public void enqueue(E e) {
        s1.push(e);
    }

    public E dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}
