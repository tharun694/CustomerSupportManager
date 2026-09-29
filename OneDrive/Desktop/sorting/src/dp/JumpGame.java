package dp;



public class JumpGame {
    static void main() {
        int []arr={2,1,3,5,4};
        System.out.println(optimized(arr));

    }

    static int jump(int []nums){

        return helperTopDown(nums, nums.length-1,new int [nums.length+1]);
    }
   static int helperTopDown(int []nums, int index, int[]dp){
       if(index==0)return 0;
       if(dp[index]!=0){
           return dp[index];
       }
       int left= helperTopDown(nums,index-1,dp)+Math.abs(nums[index-1]-nums[index]);
       int right=Integer.MAX_VALUE;
       if(index>1){
            right= helperTopDown(nums,index-2,dp)+Math.abs(nums[index-2]-nums[index]);
       }
        return dp[index]=Math.min(left,right);
   }
   static int helperBottomTop(int []nums){
        int []dp=new int[nums.length];
        dp[0]=0;
        int left=0;
        int right=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            left=dp[i-1]+Math.abs(nums[i-1]-nums[i]);
            if(i>1){
                right=dp[i-2]+Math.abs(nums[i-2]-nums[i]);
            }
           dp[i]= Math.min(left,right);
        }
        return dp[nums.length-1];
   }

   static int optimized(int []nums){
        int prev=0;
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            int l=prev+(Math.abs(nums[i]-nums[i-1]));
            int r=Integer.MAX_VALUE;
            if(i>1){
                r=prev2+(Math.abs(nums[i]-nums[i-2]));
            }
            int curr=Math.min(l,r);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
