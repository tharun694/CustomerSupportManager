package recursion;

public class Fibo {
    public static void main(String [] args){
        int n=4;

        System.out.println(fib(n));
       // fibo(0,1,6);
    }
   static  public int fibDp(int n,int []dp) {
        if(n<=1){
             return n;
        }
        if(dp[n]!=0)return dp[n];
        return dp[n]= fib(n-1)+fib(n-2);
    }
    static  public int fib(int n) {
        if(n<=1){
            return n;
        }

        return  fib(n-1)+fib(n-2);
    }
    static public int  fiboIterate(int []dp,int n){
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
return dp[n];
    }
    static public int fibowithoutArrayDp(int n){
        int index=0;
        int sum=0;
        int curr=1;
        int prev=0;
        while(index<=(n-2)){
            sum=prev+curr;
            prev=curr;
            curr=sum;
            index++;
        }
        return sum;
    }
}
