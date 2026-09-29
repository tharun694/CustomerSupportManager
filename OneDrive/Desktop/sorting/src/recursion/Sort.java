package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int [] arr={0,3,4,50,6,6,44};
//        indexlast(arr, arr.length-1, 6);
//        System.out.println(list);
ArrayList<Integer> ans=indexlast(arr, 0, 6);
        System.out.println(indexlast(arr,0,6));

   }
    static boolean indexlast1(int[] arr, int index, int target){
        if(index==arr.length-1){
            return false;
        }
        else {
            return true;
        }

    }

    static ArrayList<Integer> indexlast(int[] arr, int index, int target){
        ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer>list1=indexlast(arr,index+1,6) ;
list.addAll(list1);
return list;
    }

}
