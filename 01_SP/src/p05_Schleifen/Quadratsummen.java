package p05_Schleifen;

import java.util.Scanner;

public class Quadratsummen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gebe eine Ganzzahl n an: ");
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans += (long) Math.pow(i, 2);
        }
        System.out.println("Ergebnis: " + ans);
    }
}
