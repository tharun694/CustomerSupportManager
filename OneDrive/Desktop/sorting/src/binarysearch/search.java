package binarysearch;

public class search {
    public static void main(String[] args) {

        int[] arr = {33, 44, 555, -1, 3, -44, 90, -344};
        int target = 100;
        boolean ans = linearsearch(arr, 100);
        System.out.println(ans);
    }

    static boolean linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return true;
            }


        }
        return false;
    }
}



