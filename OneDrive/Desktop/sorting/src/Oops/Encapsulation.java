package Oops;

public class Encapsulation {
    String name;
   private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>0){
            this.salary = salary;
        }
    }

    Encapsulation(){

    }

    public Encapsulation(String name, int i) {
    }

    public static void main(String[] args) {
       // Encapsulation e=new Encapsulation("name",3000);
        Encapsulation e=new Encapsulation();
        e.salary=-76;
        e.name="tharun";
        System.out.println(e.salary);
    }
}
