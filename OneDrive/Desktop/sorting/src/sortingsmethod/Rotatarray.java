package sortingsmethod;

import java.util.Arrays;

public class Rotatarray {
    public static void main(String[]args){
        int []arr={1,2,3,4,5,6,7};
        int k=3;
roatearray(arr,0, arr.length-1);
roatearray(arr,0,k-1);
roatearray(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void  roatearray(int []nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }


}
