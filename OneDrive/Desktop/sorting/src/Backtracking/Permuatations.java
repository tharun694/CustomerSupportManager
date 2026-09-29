package Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permuatations {
    public static void main(String[] args){
        int []nums={1,2,3};
        System.out.println(combine(2,2));
    }
   static public List<List<Integer>> permute(int[] nums) {
        return generate(new ArrayList<>(),nums);
    }

 static   List<List<Integer>>generate(List<Integer>list,int []nums){
        List<List<Integer>>ans=new ArrayList<>();
        if(list.size()==nums.length){
            ans.add(list);
            return ans;
        }
        for(int i=0;i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            else{
                list.add(nums[i]);
                ans.addAll(generate(list,nums));
                list.remove(list.size()-1);
            }
        }
        return ans;
    }
   static public List<List<Integer>> combine(int n, int k) {
        return combine(new ArrayList<>(),n,k,1);
    }
   static List<List<Integer>>combine(List<Integer>list,int n,int k,int pos){
        List<List<Integer>>ans=new ArrayList<>();
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        for(int i=pos;i<=n;i++){
            list.add(i);
            ans.addAll(new ArrayList<>(combine(list,n,k,pos=pos+1)));
            list.remove(list.size()-1);

        }
        return ans;
    }

}
