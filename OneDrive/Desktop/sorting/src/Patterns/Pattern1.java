package Patterns;

public class Pattern1 {
    public static void main(String[]args){
        pattern9(5);
    }
    static void pattern9(int n){
        for (int row = 0; row<=(n*2)+1; row++) {
            int colValue=row>n?(row-n)-1:n-row;
            int spaces=row>n?((n*2)+1)-row:n-colValue;
            for (int i = 0; i <=spaces; i++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=colValue; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
static void pattern8(int n){
    for (int row = 1; row <(n*2) ; row++) {
        int spaces=n>row?n-row:row-n;
        int colValue=n>row?row:(n*2)-row;
        for (int i = 0; i <=spaces; i++) {
            System.out.print("  ");
        }
        for (int col = colValue; col >=1; col--) {
            System.out.print(col+" ");
        }
        for (int col = 2; col <=colValue; col++) {
            System.out.print(col+ " ");
        }
        System.out.println();
    }
}
    static void pattern7(int n){
        for(int row=1;row<=n;row++){
            int spaces=n-row;
            for (int i = 0; i <=spaces; i++) {
                System.out.print( "  ");
            }
            for (int col =row; col>=1; col--) {
                System.out.print(col+" ");
            }
            for (int col =2; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 0; row <=n*2; row++) {
            int colvalue= n>row?colvalue=row:n*2-row;
            int valueOfSpaces=n-colvalue;
            for(int s=0;s<=valueOfSpaces;s++){
                System.out.print(" ");
            }
            for (int c = 0; c <=colvalue; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=(n-row)+1 ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
}
    static void pattern5(int n){
        for (int row = 0; row <=n*2; row++) {
        int colvalue= n>row?colvalue=row:n*2-row;
            for (int c = 0; c <=colvalue; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
