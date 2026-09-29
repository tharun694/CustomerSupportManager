package ExceptionHandling;

public class Exception {
    void message(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("below 18 is not valid");
        }
    }

}

class Main{
    public static void main(String[] args) {
        Exception e=new Exception();
        e.message(2);
    }
}
