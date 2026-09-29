package practicecode;

public class SumDecodedNumber {
    public static void main(String[] args) {
        long []arr={59412};
        System.out.println(sumDecoded(arr));
    }
    static public int sumDecoded(long[] nums) {
        int ans=0;
        long result = 1;
        for(int i=0;i<nums.length;i++){
            //step 1
            long w=nums[i]%10;
            long d=(long)Math.floor(nums[i]/10);
            //step 2
            int x;
            int y;
            String str=String.valueOf(d);

            x= Integer.parseInt(str.substring( 0,(int)w));
            y=Integer.parseInt(str.substring((int)w,str.length()));
            //step 3

            long base = x;
long MOD =1000000007L;
            while (y > 0) {
                if ((y & 1) == 1)
                    result = (result * base) % MOD;

                base = (base * base) % MOD;
                y /= 2;
            }

        }
        return (int) result;
    }



}
