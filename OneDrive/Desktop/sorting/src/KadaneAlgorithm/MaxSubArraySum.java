package KadaneAlgorithm;

public class MaxSubArraySum {
    static void main() {
        int []arr={-2,-3,0,-1};
        System.out.println(maxSum(arr));
    }
    public static  int maxSum(int []arr){
        int subarraycount=0;
        int sum=0,max=Integer.MIN_VALUE,b=0,s=0,e=0;
        for(int i=0;i<arr.length;i++){
            if(sum==0){
             b=i;
            }
            sum+=arr[i];

            if(sum>max){
                max=sum;
                s=b;
                e=i;
            }
            if(sum<0)sum=0;

        }
        return s;
    }
}
