package p08_Arrays;

import java.util.Scanner;

public class Verdoppeln {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein:");
        System.out.print("Wie viele Werte? ");
        int N = in.nextInt();
        double[] n = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Wert " + (i+1) + " eingeben: ");
            n[i] = in.nextDouble();
        }
        System.out.println("Ursprüngliches Array");
        for (int i = 0; i < N; i++) {
            System.out.print(n[i] + "\t\t");
        }
        System.out.println("\nVerdoppeltes Array");
        for (int i = 0; i < N; i++) {
            System.out.print(n[i]*2 + "\t\t");
        }
    }
}
