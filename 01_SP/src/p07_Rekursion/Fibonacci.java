package p07_Rekursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 36;
        fibonacciRekursive(0, 1, n);
        System.out.println(fibonacciLoop(n));
    }
    public static void fibonacciRekursive(int a, int b, int i) {
        if (i == 1){
            System.out.println(b);
            return;
        }
        int res = a + b;
        a = b;
        b = res;
        fibonacciRekursive(a, b, i-1);
    }
    public static int fibonacciLoop(int n){
        int res = 0;
        int a = 0;
        int b = 1;
        for (int j = 1; j < n; j++){
            res = a + b;
            a = b;
            b = res;
        }
        return res;
    }
}
