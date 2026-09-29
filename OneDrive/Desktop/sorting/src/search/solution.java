package search;

import java.util.Arrays;

public class solution {

    public static void main(String[] args) {
        int []nums={1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));




    }
   static  public int[] getConcatenation(int[] nums) {

        int []ans=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }

        for(int index=0;index<nums.length;index++){
index= nums.length;
            ans[index]=nums[index];
        }
        return ans;
    }
}