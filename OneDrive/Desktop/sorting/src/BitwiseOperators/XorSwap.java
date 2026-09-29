package BitwiseOperators;

public class XorSwap {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(xor(n));
    }
    static boolean xor(int n) {
        while (n > 0) {
            if ((n & 1) == 0) {
                return true;
            }
            n >>= 1;
        }
        return false;
    }
}
