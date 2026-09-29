package StackandQueue;

public class DynamicQueue extends CircularQueue{


    DynamicQueue(){
      super();
    }
    DynamicQueue(int size){
    this.data=new int[size];
    }
    public boolean isFull(){
        return size== data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    @Override
    public boolean insert(int item) {
        if(this.isFull()){

            int []temp=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[(front+i)% data.length];
            }
            front=0;
            end=data.length;
            data=temp;
        }
        return super.insert(item);
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed=data[front++];
        front=front% data.length;
        size--;
        return removed;
    }
    public int front() throws Exception {
        return super.front();
    }
}
