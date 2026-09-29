package practicecode;

public class Sums {

    public static void main(String[]args){
        int []arr={10,10,3,7,6};
        System.out.println( Difference(arr));
    }
    static int Difference(int []nums){
int n=nums.length;
int totalSum=0;
for (int num:nums){
    totalSum+=num;
}
int count=0;
int leftSum=0;
        for (int i = 0; i < n-1; i++) {
            leftSum+=nums[i];
            int rightSum=totalSum-leftSum;
            if((leftSum-rightSum)%2==0){
                count++;
            }
        }

        return count;
    }

}
