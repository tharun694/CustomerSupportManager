package dp;

public class CoinChange {
    static void main() {
        int []arr={1,2,5};
        System.out.println(coinChange(arr,3));
    }
 static   public int coinChange(int[] coins, int amount) {
        if(amount==0)return 0;
        int ans= helper(coins,amount,0,0,new int[coins.length]);
        return ans<=0?-1:ans;
    }
    static int helper(int []coins,int amount,int index,int sum,int []dp){
        if(index==coins.length)return Integer.MAX_VALUE;
        if(sum==amount)return 0;
        if(sum>amount)return Integer.MAX_VALUE;

        int take=helper(coins,amount,index,sum+coins[index],dp);
        if(take!=Integer.MAX_VALUE)take=take+1;

        int untake=helper(coins,amount,index+1,sum,dp) ;
        return dp[index]=Math.min(take,untake);
    }
}
