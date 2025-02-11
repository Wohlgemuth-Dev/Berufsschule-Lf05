package p08_Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lagerbestand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Wie viele unterschiedliche Artikel haben Sie im Lager? ");
        int N = in.nextInt();
        String[] name = new String[N];
        System.out.println("Erfassen Sie die einzelnen Artikelbezeichnungen:");
        for (int i = 0; i < N; i++) {
            System.out.print("Artikel " + (i+1) + ": ");
            name[i] = in.next();
        }
        System.out.println("Erfassen Sie jetzt den Einzelpreis jedes Artikels:");
        double[] price = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Preis des Artikels '" + name[i] + "': ");
            price[i] = in.nextDouble();
        }
        System.out.println("Erfassen Sie jetzt die Anzahl der einzelnen Artikel");
        int[] amount = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Menge des Artikels '" + name[i] + "': ");
            amount[i] = in.nextInt();
        }
        double price_sum = 0;
        int amount_sum = 0;
        for (int i = 0; i < N; i++) {
            price_sum += price[i]*amount[i];
            amount_sum += amount[i];
        }
        DecimalFormat df = new DecimalFormat(",###.00");
        System.out.println("In Ihrem Lager befinden sich insgesamt " + amount_sum + " Artikel im Wert von " + df.format(price_sum) + " €");
    }
}
