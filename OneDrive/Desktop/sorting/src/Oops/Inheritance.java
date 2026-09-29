package Oops;

import org.w3c.dom.ls.LSOutput;
import sortingsmethod.father;

public class Inheritance {


    public void father (){

        System.out.println("300");
    }



}
class son extends Inheritance {
    public void income(){
        System.out.println("nothing");
    }

    @Override
    public void father() {
        System.out.println("250");
    }

    public static void main(String[] args) {
        Inheritance f=new Inheritance();
        Inheritance f1=new son();
        son s= new son();
//        f.father();
        f1.father();



    }
}
