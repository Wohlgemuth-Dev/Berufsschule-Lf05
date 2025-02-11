package p08_Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Temperaturauswertung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Erfassen Sie jetzt die prozentuale Verteilung des Votings (int):");
        double[] n = new double[7];
        for (int i = 0; i < n.length; i++) {
            System.out.print("Bitte geben Sie die Temperatur am Tag " + (i+1) + " ein: ");
            n[i] = in.nextDouble();
        }
        double sum = 0;
        double max = n[0];
        double min = n[0];
        double max_diff = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
            if (i < n.length - 1) {
                if (abs(n[i] - n[i+1]) > max_diff) {
                    max_diff = abs(n[i] - n[i+1]);
                }
            }
            if (n[i] > max) {
                max = n[i];
            }
            if (n[i] < min) {
                min = n[i];
            }

        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Mittelwert: " + df.format(sum/n.length));
        System.out.println("Maximale Temperatur: " + df.format(max));
        System.out.println("Minimale Temperatur: " + df.format(min));
        System.out.println("Spannweite: " + df.format(max-min));
        System.out.println("Maximale Differenz: " + df.format(max_diff));
    }
}
