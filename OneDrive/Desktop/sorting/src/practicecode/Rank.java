package practicecode;

import java.util.*;

public class Rank {
    public static void main(String[] args) {
int [] arr={1, 2, 1, 0, 1, 1, 0};
System.out.println(maxlength(arr,0));
    }

  static  public int[] arrayRankTransform(int[] arr) {
      int[] copy = arr.clone();
      Arrays.sort(copy);
      int sum = 0;
      int []ans=new int[arr.length];
      HashMap<Integer, Integer> map=new HashMap<>();
      for(int i=0;i<copy.length;i++){
          if(!map.containsKey(copy[i])){
              sum++;
              map.put(copy[i],sum);
          }
      }
      for(int i=0;i<arr.length;i++){
          ans[i]=map.get(arr[i]);
      }
     return ans;
  }
  static  public int minEatingSpeed(int[] piles, int h) {
    StringBuilder str=new StringBuilder();
    String s=str.toString();
        int end=0;
        int mid=0;
        for(int i:piles){
            end=Math.max(end,i);
        }
        int start=1;
        while(start<end){
            mid=start+(end-start)/2;
            // if(start==end)break;
            if(helper(piles,h,mid)){
                end=mid;

            }else{
                start=mid+1;
            }
        }
        return end;
    }
   static boolean helper(int []arr,int h,int mid){
        int speed=0;
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
           speed+=(int) Math.ceil((double) val/mid);
        }
        return speed<=h;
    }
  static  public int countGoodRotations(int[] nums) {
        long first=0;
        long total=0;
        long cyclic=0;
        long s=0,e=nums.length-1;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(i<nums.length/2){
                first+=nums[i];
            }
        }
        long index=0,rotate=0;
        long mod=0;
        while(mod!=nums.length){
            long n=nums.length;
            long second=total-first;
            if(first>second){
                cyclic++;
            }
 rotate=(rotate+1)%n;
//            long front=nums[index];
            index = (index + 1) % n;
            
            long m=s+(e-s)/2;
m=(m+rotate)%n;
//            first=(first-front)+nums[m];
          
           mod++;
        }

        return  (int)cyclic;
    }

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        int i=0;
        int j=0;
        int total=0,ans=0,count=0;
       
        while(i<a.size()||j<b.size()){
             int x=0;
             int y=0;
           if(i<a.size()){
             x= a.get(i);
           }
           if(j<b.size()){
            y=b.get(j);
           }
           
                int val=Math.min(x,y);
                if(total+val<=maxSum){
                    total+=val;
                    count++;
                }else{
                    break;
                }
                if(val==x){
                     i++;
                }else{
                     j++;
                }
               
               
            
        }
    // Write your code here
return count;
    }
    public static int maxSubarray(int []arr,int k){


        int left=0;
        int length=0;
        int max=0;
        int min=0;
        TreeMap<Integer,Integer>map=new TreeMap<>();
        for(int right=0;right<arr.length;right++ ){

            if(!map.containsKey(arr[right])){
                map.put(arr[right],1 );
            }else{
                int val=map.get(arr[right]);
                val=val+1;
                map.put(arr[right],val);
            }
            max=map.lastKey();

            min=map.firstKey();



                while(max-min>k){
//                    int val=map.get(arr[left]);
//                    val=val-1;
//                    map.put(arr[left],val);
//                    left++;
                    map.remove(left);
                    left++;
                    min=map.firstKey();
                }


                length=Math.max(length, (right-left)+1);
            }

        return length;
    }
   static public int maxlength(int []arr,int k){
    int left=0;
    int sum=0;
    int maxlength=0;
    for(int right=0;right<arr.length;right++){

   sum+=arr[right];
        while(sum>k){

            sum-=arr[left];
            left++;
        }
maxlength=Math.max(maxlength,(right-left)+1);

      
    }
    return maxlength;
   } 


}
