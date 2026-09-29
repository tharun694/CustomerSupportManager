package OopsPractice;

import java.util.Scanner;

public class simplecalculator {
    public static void main(String []args){
int operator ,n1,n2;
        System.out.println(" 1-Add \n 2-Subtract \n 3-Multiply \n 4-Divide \n 5-double");
        System.out.print("Enter first operator  : ");
        Scanner scan=new Scanner(System.in);
        operator=scan.nextInt();
        System.out.println("Enter first number");
        n1=scan.nextInt();
        System.out.println("Enter second number");
        n2=scan.nextInt();
        int result=0;
        switch (operator){
            case 1:
               result=n1+n2;
               break;
            case 2:
                result=n1-n2;
                break;
            case 3:
                result=n1*n2;
                break;
            case 4:
                result=n1/n2;
            case 5:
                result=n1/n2;
            default:
                System.out.println("user entered value is invalid");
        }
        System.out.println( "Result is : " + result);

    }
}
