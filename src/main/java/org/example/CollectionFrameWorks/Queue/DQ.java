package org.example.CollectionFrameWorks.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQ {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        dq.addFirst(5);
        System.out.println(dq);
        dq.remove(2);
        System.out.println(dq);
        dq.pollFirst();
    }
}
