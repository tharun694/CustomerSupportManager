package recursion.array;

public class Solution {
    public static void main(String[] args) {
        int []nums={1,2,3,1};
System.out.println(containsDuplicate(nums));
    }

   static public boolean containsDuplicate(int[] nums) {
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]==nums[i]+1){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}
