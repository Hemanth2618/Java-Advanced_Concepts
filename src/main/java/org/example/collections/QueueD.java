package org.example.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueD {
    public void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.offer("d");
        // peek and poll are main methods. To get the element at the front of queue (Front mean left side), peek is used
        // poll is used to remove element from front of queue
        // elements are added from back of the queue (right side)
        System.out.println(queue.peek());
        System.out.println(queue.poll());
    }

}
