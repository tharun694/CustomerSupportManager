package StackandQueue;

import java.util.*;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue=new CustomQueue(5);
        queue.insert(33);
        queue.insert(21);
        queue.insert(90);
        queue.insert(45);
        queue.display();
        System.out.println(queue.front());
        queue.remove();
        queue.display();
        Queue<Integer>queue1=new LinkedList<>();
        ArrayList<Integer>list=new ArrayList<>();
        Deque<Integer>deque=new ArrayDeque<>();

    }
}
