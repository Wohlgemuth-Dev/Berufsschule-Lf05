package p05_Schleifen;

import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gebe eine Ganzzahl n an: ");
        int n = sc.nextInt();
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        System.out.println("Die Fakultät von " + n + " ist: " + ans);
    }
}
