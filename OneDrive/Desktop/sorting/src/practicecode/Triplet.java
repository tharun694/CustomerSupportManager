package practicecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Triplet {
    public static void main(String[] args) {
int []nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            int left=0;
            int right=nums.length-1;
            while(left<right){
                if(left==i)left++;
                if(right==i)right--;
                List<Integer> list=new ArrayList<>();

                sum=nums[left]+nums[right];
                if(nums[i]+sum==0){
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[i]);
                    left++;
                    right--;
                    Collections .sort(list);
                if(!result.contains(list))result.add(list);
                }else if(nums[i]<sum){
                    right--;
                }else{
                    left++;
                }
            }

        }
        return result;
    }
}
