package StackandQueue;

public class DynamicQueueMain {
    public static void main(String[] args) throws Exception {
        DynamicQueue queue=new DynamicQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(8);
        queue.display();
        queue.remove();
        queue.display();
    }
}
