package recursion;

public class solution {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(summa(n));
    }

    static boolean summa(int n) {
        if (n < 0) {
            return false;
        }
        System.out.println(n);
        summa(n + 1);

        summa(n - 1);
        System.out.println(n);
return true;
    }
}

