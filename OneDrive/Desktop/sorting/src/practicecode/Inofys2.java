package practicecode;

import java.util.Scanner;

public class Inofys2 {
    static long solve(int N, int B, int[] a) {

        long pos = Long.MIN_VALUE;
        long neg = Long.MIN_VALUE;

        for (int i = 0; i < N; i++) {

            long x = a[i];

            if (x > 0) {
                long takeAlone = x;
                long fromNeg = (neg == Long.MIN_VALUE) ? Long.MIN_VALUE : neg + x + B;
                pos = Math.max(pos, Math.max(takeAlone, fromNeg));
            } else {
                long takeAlone = x;
                long fromPos = (pos == Long.MIN_VALUE) ? Long.MIN_VALUE : pos + x + B;
                neg = Math.max(neg, Math.max(takeAlone, fromPos));
            }
        }

        long ans = Math.max(pos, neg);
        return Math.max(ans, 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solve(N, B, a));
    }
}
