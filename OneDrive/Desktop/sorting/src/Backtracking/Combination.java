package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {
    public static void main(String []args){
        int []candidates={10,1,2,7,6,1,5};
        System.out.println(combinationSum2(candidates,8));
    }


        public static List<List<Integer>>result;
        public static void solve(int[] candidates,int idx,List<Integer>temp,int target){
            if(target<0)return;
            if(target==0){
                result.add(new ArrayList<>(temp));
                return;
            }

            for(int i=idx;i<candidates.length;i++){
                if(i>idx && candidates[i]==candidates[i-1])
                    continue;
                temp.add(candidates[i]);
                solve(candidates,i+1,temp,target-candidates[i]);
                temp.remove(temp.size()-1);
            }
        }
//      static  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//            Arrays.sort(candidates);
//            result=new ArrayList<>();
//            List<Integer>temp=new ArrayList<Integer>();
//            solve(candidates,0,temp,target);
//            return result;
//
//        }
static public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        combine(candidates,target,0,new ArrayList<>(),ans);
        return ans;
    }
   static void combine(int []candidates,int target,int pos,List<Integer>list, List<List<Integer>>ans){
        if(target<0) return;
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=pos;i<candidates.length;i++){
            if(i>pos&&candidates[i]==candidates[i-1])continue;
            list.add(candidates[i]);
            combine(candidates,target-candidates[i],i+1,list,ans);
            list.remove(list.size()-1);
        }
    }
    }


