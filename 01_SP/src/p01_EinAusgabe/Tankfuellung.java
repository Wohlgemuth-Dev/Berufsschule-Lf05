package p01_EinAusgabe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tankfuellung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Getankte Liter: ");
        double liter = sc.nextDouble();
        System.out.print("Nettopreis je Liter: ");
        double nettopreisJeLiter = sc.nextDouble();
        // Ausgabe
        DecimalFormat df = new DecimalFormat("#,##0.00 €");
        System.out.println("Nettobetrag: " + df.format(nettopreisJeLiter * liter));
        System.out.println("Mehrwertsteuer: " + df.format(nettopreisJeLiter * liter * 0.19));
        System.out.println("Bruttobetrag: " + df.format(nettopreisJeLiter * liter * 1.19));
    }
}
