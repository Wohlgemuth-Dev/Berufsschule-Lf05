package p08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Maxima {
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
        double biggest = 0;
        double second_biggest = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] > second_biggest) {
                if (n[i] > biggest) {
                    second_biggest = biggest;
                    biggest = n[i];
                }
                else {
                    second_biggest = n[i];
                }
            }
        }
        System.out.println("Größte Zahl: " + biggest);
        System.out.println("Zweitgrößte Zahl: " + second_biggest);
    }
}
