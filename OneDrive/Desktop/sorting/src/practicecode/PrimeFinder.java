package practicecode;

public class PrimeFinder {
    static void main() {
        System.out.println(sumOfPrimesInRange(51));
    }

  static  public int sumOfPrimesInRange(int n) {
        boolean isPrime=true;
        int sum=n,value=n;
        int ans=0;
        int reverse=0;
        while(sum!=0){
            reverse=reverse*10+sum%10;
            sum/=10;
        }

      int left=Math.min(reverse,n);
        int right=Math.max(reverse,n);

        while(left<=right){
            if(left>1) {
                for (int i = 2; i <= Math.sqrt(left); i++) {
                    if (left % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    ans = ans + left;
                }
                isPrime = true;
            }
            left++;
        }
        return ans;
    }
}
