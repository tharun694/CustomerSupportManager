package StackandQueue;

public class DynamicStackMain {
    public static void main(String[] args) throws Exception{
        DynamicStack stack=new DynamicStack(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
