package dp;

public class NonPairAdjacent {

    static void main() {
        int []arr={2,1,4,9};
        System.out.println(nonAdjacent(arr));
    }

    static public int nonAdjacent(int[] nums) {
        int prev=nums[0], prev2=0;

        for(int i=1;i<nums.length;i++){
            int l=nums[i];
            if(i>1) l+=prev2;
            int r=0+prev;
            int curr=Math.max(l,r);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
 static   public int nonAdjacentDP(int[] nums) {
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int pick=nums[i];
            if(i>1)pick+=dp[i-2];
            int unpick=0+dp[i-1];
            dp[i]=Math.max(pick,unpick);
        }
        return dp[nums.length-1];
    }
}
