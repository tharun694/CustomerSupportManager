package sortingsmethod;
public class father{
    void display(){
        int age=333;
        String name="hello";
        System.out.println(age);
        System.out.println(name);
    }

}
class son extends father{
    @Override
    void display() {
        int age=111;
        System.out.println(age);
        super .display();
    }
}
class son1 extends father{
    @Override
    void display() {
        String name="world";
        System.out.println(name);
        super.display();
    }

    public static void main(String[] args) {
        son obj=new son();
        obj.display();
    }
}