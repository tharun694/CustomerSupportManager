package StackandQueue;

public class CircularMain {
    public static void main(String[] args) throws Exception {
    CircularQueue Cqueue=new CircularQueue(5);
        Cqueue.insert(33);
        Cqueue.insert(21);
        Cqueue.insert(90);
        Cqueue.insert(45);
        Cqueue.display();
        System.out.println(Cqueue.front());
        Cqueue.remove();
        Cqueue.display();
    }

}
