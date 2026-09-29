package StackandQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackandQueue {
    public static void main(String []args){
        Stack<Integer> st=new Stack<>();
        Queue<Integer>queue=new LinkedList<>();

        st.push(22);
        st.push(31);
        st.push(43);
        st.push(89);
        System.out.println(st.peek());
    }
}
