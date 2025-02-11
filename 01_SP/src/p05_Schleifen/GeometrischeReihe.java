package p05_Schleifen;

import java.util.Scanner;

public class GeometrischeReihe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gebe eine Ganzzahl n an: ");
        int n = sc.nextInt();
        double ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans + (1/Math.pow(2, i));
        }
        System.out.println("Ergebnis: " + ans);
    }
}
