package practicecode;

import java.util.HashSet;

public class DistinctsInteger {
    public static void main(String[] args) {
        int []arr={1,1,1,2,2,3};
    }
    public static int distinct(int []arr,int k){
        HashSet<Integer>set=new HashSet<>();
        set.add(arr[0]);
        int count=1;
        for(int i=1;i<arr.length;i++){

            if(!set.contains(arr[i])&&count<=k){
                count++;
            }else{
                set.add(arr[i]);
            }

        }
    }
}
