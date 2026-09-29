package sortingsmethod;
import java.util.Arrays;
public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {1, -9, 4, 3, 0};
        System.out.println(sortingInDesc(arr));
    }

    static int[] sortingInDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


}