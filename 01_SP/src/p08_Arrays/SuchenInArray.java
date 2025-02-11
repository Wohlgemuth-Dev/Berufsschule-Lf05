package p08_Arrays;

import java.util.Scanner;

public class SuchenInArray {
    public static void main(String[] args) {
        double[] n = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Array bestehend aus 5 Kommazahlen ein.");
        for (int i = 0; i < n.length; i++) {
            System.out.print("Wert " + (i+1) + " eingeben: ");
            n[i] = sc.nextDouble();
        }
        System.out.print("Nach welcher Zahl wollen Sie suchen? ");
        double n_search = sc.nextDouble();
        for (int i = 0; i < n.length; i++) {
            if (n_search == n[i]) {
                System.out.println("Treffer");
            }
            else {
                System.out.println("Niete");
            }
        }
    }
}
