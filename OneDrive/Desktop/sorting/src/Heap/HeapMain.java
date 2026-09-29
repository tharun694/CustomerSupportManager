package Heap;

public class HeapMain {
    static void main() throws Exception {
        Heap<Integer>heap=new Heap<Integer>();
        heap.insert(34);
        heap.insert(384);
        heap.insert(4);
        System.out.println(heap.remove());
    }

}
