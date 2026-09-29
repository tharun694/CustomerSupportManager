package practicecode;

public class Digits {
    public static void main(String[] args) {
        System.out.println(checkGoodInteger(19));
    }

   static public boolean checkGoodInteger(int n) {
        int num=n;
        int sum=0,square=0;

        while(num!=0){
            sum+=num%10;
            int c=num%10;
            square+=c*c;
            num/=10;
        }
        return square-sum>=50;
    }
}
