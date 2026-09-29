package practicecode;
import java.util.*;
import java.util.Scanner;

public class Main {
    public void main(String[]args){
        Scanner scanner=new Scanner(System.in);
       int n= scanner.nextInt();
       scanner.nextLine();
       String []s=new String[n];
       for(int i=0;i<n;i++){
//           char ch=scanner.next().charAt(i);

s[i]=scanner.nextLine();
           System.out.print(s[i]);
       }


    }
}
