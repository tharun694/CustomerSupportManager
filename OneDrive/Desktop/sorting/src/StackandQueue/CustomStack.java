package StackandQueue;

public class CustomStack {
    protected int []data;
    private static final int DEFAULT_SIZE=10;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }
    int ptr=-1;
    public boolean push(int item) {
        if(isFull()) {
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
public int  pop() throws CustomException{
        if(isEmpty()){
            throw new CustomException("stack is empty ");
        }
     return data[ptr--];
}
public int peek() throws CustomException{
        if(isEmpty()){
            throw new CustomException("stack is empty cannot peek");
        }
        return data[ptr];
}
    public boolean isFull() {
        return ptr==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
}
