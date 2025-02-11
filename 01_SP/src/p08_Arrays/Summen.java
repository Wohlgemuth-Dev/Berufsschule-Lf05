package p08_Arrays;

import java.util.Scanner;

public class Summen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Array aus ganzen Zahlen ein:");
        System.out.print("Wie viele Werte? ");
        int N = in.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Wert " + (i+1) + " eingeben: ");
            n[i] = in.nextInt();
        }
        int N_even = 0;
        int n_even_sum = 0;
        int N_odd = 0;
        int n_odd_sum = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] % 2 == 0) {
                N_even += 1;
                n_even_sum += n[i];
            }
            else {
                N_odd += 1;
                n_odd_sum += n[i];
            }
        }
        System.out.println("Gerade Zahlen:");
        System.out.println("Anzahl = " + N_even);
        System.out.println("Summe = " + n_even_sum);
        System.out.println("Anzahl = " + N_odd);
        System.out.println("Summe = " + n_odd_sum);
    }
}
