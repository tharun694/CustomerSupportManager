package practicecode;

import java.util.Scanner;


//infoys 1 question
public class Infoys1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();

        long xor = 1;   // a[0] = 1
        long prev = 1;

        for (int i = 2; i <= n; i++) {
            long curr=0;

            if (prev % x != 0) {
                // force next multiple of x
                curr = ((prev / 3) + 1) * x;
            } else {
                // just next smallest number
                curr = prev + 1;
            }

            xor ^= curr;
            prev = curr;
        }

        System.out.println(xor);
    }
}