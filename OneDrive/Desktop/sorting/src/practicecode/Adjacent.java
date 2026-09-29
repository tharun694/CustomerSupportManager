package practicecode;

import java.util.*;

public class Adjacent {

   public static void main(String[]args) {


       String[] n = {"1","C"};
       System.out.println(calPoints(n));
   }
    static public boolean isAdjacentDiffAtMostTwo(String s) {
for(int ind=0;ind<s.length()-1;ind++){
    int i=s.charAt(ind)-'0';
    int j= s.charAt(ind+1)-'0';
    int diff=Math.abs(i-j);
    if(diff>2)return false;
}
return true;
    }


   static public boolean isMiddleElementUnique(int[] nums) {
        int n=0;
        HashMap<Integer,Integer> set=new HashMap<>();
        if(nums.length==1)return true;
        for(int i=0;i<nums.length;i++){
            if(!set.containsKey(nums[i])){
                set.put(nums[i],1);
            }else{
               set.put(nums[i],set.getOrDefault(nums[i],0)+1);
            }

        }
        n = nums[nums.length/2];
        return  set.get(n)==1;
    }
  static  public int calPoints(String[] operations) {
       Stack<Integer>queue=new Stack<>();

        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                if(!queue.isEmpty()){
                    queue.pop();
                }
            }else if(operations[i]=="D"){
                int peek=queue.peek();

                int doub=peek*2;
                queue.add(doub);

            }else if(operations[i]=="+"){
                if(queue.size()>=2){
                    int f=queue.pop();
                    int s=queue.pop();
                    int x=f+s;
                    queue.add(s);
                    queue.add(f);
                    queue.add(x);
                }
            }
            else{
                int val=Integer.parseInt(operations[i]);
                queue.add(val);
            }
        }

        int ans=0;
        while(!queue.isEmpty()){
            ans+=queue.pop();
        }
        return ans;
    }


}
