package recursion;

import java.util.Arrays;

public class Zeros {

    public static void main(String[] args) {
        int[] nums = {10,2,5,3};

        System.out.println(checkIfExist(nums));
    }

    static public boolean checkIfExist(int[] arr) {
        int end = arr.length-1;
        for(int i = 0; i<=end ; i++){
            for(int j = 0; j<=end ; j++){
                if(arr[i]==2*arr[j] && arr[i]!=arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}


