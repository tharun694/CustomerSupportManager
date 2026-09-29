package sortingsmethod;

import java.util.Scanner;

class array {
    public static void main(String[] args) {


        print(3);

    }

    static void  print(int n){

        if(n==5){
            return;
        }
        System.out.println(n);
        print(n+1);
    }

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static class Main {
        public static void main(String[] args) {
            //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
            // to see how IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            for (int i = 1; i <= 5; i++) {
                //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
                // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
                System.out.println("i = " + i);
            }
        }
    }

    public static class palindrome {
        public static void main(String[] args) {
            String str= "";
            System.out.println(palindrome(str));
        }

        static boolean palindrome(String str){
          //  str.toUpperCase();
            if(str.length()==0){
                return false;
            }
            for (int i = 0; i <= str.length()/2; i++) {
                char start= str.charAt(i);
                char end =str.charAt(str.length()-1-i);
                if(start!=end){
                    return false;
                }
            }
            return true;
        }
    }

    static class solution {
        public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int ans=0;


    while(true){
        System.out.print("Enter the operator : ");
        char op=scan.next().trim().charAt(0);
        if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
            System.out.print("Enter the values : ");

            int num1=scan.nextInt();
            int num2=scan.nextInt();
            if(op=='+'){
              ans=num1+num2;
            }
            if(op== '-'){
                ans=num1-num2;
            }
            if(op== '*'){
                ans=num1*num2;
            }
            if(op== '/'){
                ans=num1/num2;
            }
            if(op== '%'){
                ans=num1%num2;
            }
        } else if (op=='X'||op=='x') {
            break;
        }else{
            System.out.println("Invalid operation");
        }
        System.out.println(ans);
    }

        }
    }
}
