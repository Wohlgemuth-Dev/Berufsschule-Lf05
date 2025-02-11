package p08_Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Balkendiagramm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Wie viele Kandidaten sind noch im Rennen? ");
        int N = in.nextInt();
        System.out.println("Erfassen Sie jetzt die prozentuale Verteilung des Votings (int):");
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Kandidat " + (i+1) + ": ");
            n[i] = in.nextInt();
        }
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Ergebnis");
        for (int i = 0; i < N; i++) {
            System.out.print("Kandidat " + (i+1) + ":\t");
            for (int j = 0; j < n[i]; j++){
                System.out.print("■");
            }
            System.out.println(" " + df.format(n[i]) + "%");
        }
    }
}
