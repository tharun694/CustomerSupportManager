package BitwiseOperators;

import java.util.Arrays;

public class XorDuplicates {
    public static void main(String[] args) {
        int []arr={1};
        System.out.println(checkZeroOnes("1101"));
//        System.out.println(repeatedNTimes(arr));
//        int n=10;
//        boolean value=(n&(n-1))==1;
//        System.out.println(value);

    }
  static
  public boolean checkZeroOnes(String s) {
        int i=0;
        int j=i+1;
      int countOnes=0;
      int countZeros=0;
        while(j<s.length()){

            if(s.charAt(i)=='1'&&s.charAt(i)==s.charAt(j)){
                countOnes++;
            }
            if(s.charAt(i)=='0'&&s.charAt(i)==s.charAt(j)){
                countZeros++;
            }
            i++;
            j++;
            if(countZeros>=countOnes)return false;
        }
        return s.charAt(0)=='1';
    }    private static int ans(int []nums)
    {

        int unique=0;
        for (int n:nums){
            unique^=n;
        }

        return unique;
    }
    private static int ans1(int nums){
    int ans=0;
        int base=5;
        while(nums>0){
            int last=nums&1;
            nums=nums>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }


}
