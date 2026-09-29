package recursion.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[]args) {
//        List<String> ans = permutationsPrintList("", "abc");
//         System.out.println(ans);
//        permutationsPrint("","abc");
        // permutations("","abc")
        int []nums={1,2,3};
        System.out.println(permute(nums));
    }
    static int  permutations(String p, String up, int count){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String s=p.substring(i,p.length());
         count+=permutations(f+ch+s,up.substring(1),count);
        }
return count;
    }
    static void permutationsPrint(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutationsPrint(f + ch + s, up.substring(1));
        }
    }
    static ArrayList<String> permutationsPrintList(String p, String up){
        if(up.isEmpty()){
           ArrayList<String>list=new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String>ans=new ArrayList<>();
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsPrintList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
static public List<List<Integer>> permute(int[] nums) {
return permutation(new ArrayList<>(),nums,0);
}

    private static List<List<Integer>> permutation(List<Integer>list,int []nums,int index) {
        if(index>=nums.length){
            List<List<Integer>>part=new ArrayList<>();
            part.add(list);
            return part;
        }
        List<List<Integer>>ans=new ArrayList<>();
   int digit=nums[index];
        for(int i=0;i<=list.size();i++){
            List<Integer>first=list.subList(0,i);
            List<Integer>second=list.subList(i,list.size());
            list.add(digit);
            first.addAll(list);
            first.addAll(second);
           ans.addAll(permutation(first,nums,index=index+1));
        }
        return ans;
    }
}
