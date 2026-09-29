package Oops;

public abstract class Abstraction {
    abstract public void  vechile();
        public void start(){
            System.out.println("starting ...");
        }

}
class Bike extends Abstraction{


    @Override
    public void vechile() {
        System.out.println("java engine");
    }
    public void start(){
        super.start();
    }
    class  Main{
        public static void main(String[] args) {
            Bike b=new Bike();
            b.start();
            b.vechile();
        }
    }
}
