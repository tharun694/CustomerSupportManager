package StackandQueue;

public class CustomMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack=new CustomStack(2);
        stack.push(33);
        stack.push(13);
        stack.push(34);
        stack.push(30);
        stack.push(99);
        stack.push(33);
        stack.push(13);
        stack.push(34);
        stack.push(30);
        stack.push(99);
        System.out.println(stack.peek());

//stack.pop();
//stack.pop();
//stack.pop();

//        System.out.println(stack.peek());
    }

}
