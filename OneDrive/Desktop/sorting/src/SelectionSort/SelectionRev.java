package SelectionSort;

import java.util.Arrays;

import static SelectionSort.SelectionBack.swap;

public class SelectionRev {
    public static void main(String[] args) {
        int []arr={1,4,3,2,5,99,0,-8,-876,77,99,-9869};
        for (int i = 0; i < arr.length; i++) {
            int min=MinValues(arr,i,arr.length-1);
            swap(arr,i,min);
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int MinValues(int[] arr, int start, int end) {
        int min=start;
        for (int i =start; i <=end ; i++) {
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
    static void swap(int []arr,int first,int  second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
