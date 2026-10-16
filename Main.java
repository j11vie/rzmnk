import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число a:");
        int a = sc.nextInt();
        System.out.println("Введите число b:");
        int b = sc.nextInt();

        System.out.println(mult1(a, b));
        System.out.println(mult2(a, b));
        System.out.println(mult3(a, b));
        System.out.println(mult4(a, b));
    }

    // 1 способ - цикл
    static int mult1(int a, int b) {
        int n = Math.abs(a);
        int m = Math.abs(b);
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = res + m;
        }
        if ((a < 0) ^ (b < 0)) {
            res = -res;
        }
        return res;
    }

    // 2 способ - BigInteger
    static BigInteger mult2(int a, int b) {
        BigInteger x = new BigInteger(String.valueOf(a));
        BigInteger y = new BigInteger(String.valueOf(b));
        return x.multiply(y);
    }

    // 3 способ - рекурсия
    static int mult3(int a, int b) {
        int res = rec(Math.abs(a), Math.abs(b));
        if ((a < 0) ^ (b < 0)) {
            res = -res;
        }
        return res;
    }

    static int rec(int n, int m) {
        if (n <= 0) {
            return 0;
        }
        return m + rec(n - 1, m);
    }

    // 4 способ - массив
    static int mult4(int a, int b) {
        int n = Math.abs(a);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.abs(b);
        }
        int res = 0;
        for (int x : arr) {
            res += x;
        }
        if ((a < 0) ^ (b < 0)) {
            res = -res;
        }
        return res;
    }
}
