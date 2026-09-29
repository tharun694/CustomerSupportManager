package SelectionSort;

import java.util.Arrays;



public class SelectionBack {

    public static void main(String[]args){
        int []arr={1,4,3,2,5};
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int max=maxofIndex(arr,0,last);
            swap( arr,max,last);
        }
        System.out.println(Arrays.toString(arr));
    }
static void  swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
}
    private static int maxofIndex(int [] arr ,int start,int end) {
        int max=0;
        for (int i = 1; i <=end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
