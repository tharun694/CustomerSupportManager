package KadaneAlgorithm;

public class MSS {
    static void main() {
        int []nums={-10,5,6,-1};
        System.out.println(subarrausum(nums,1));
    }

    static int subarrausum(int []arr,int k){


int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1 && k!=0;i++){

            for(int j=i+1;j<arr.length;j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                int sum = 0;
                for (int index = 0; index < arr.length; index++) {
                    sum += arr[index];
                    max = Math.max(max, sum);
                    if (sum < 0) sum = 0;
                }
               temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            k--;
        }


        return max;
    }
}
