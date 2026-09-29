package StackandQueue;

public class DynamicStack extends CustomStack{
    DynamicStack(){
        super();
    }
    DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {

        if(this.isFull()){
            int []temp=new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
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


