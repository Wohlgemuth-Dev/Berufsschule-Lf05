package p05_Schleifen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sparvertrag {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Bitte Kapital eingeben: ");
            double kapital = sc.nextDouble();
            System.out.print("Bitte den Zinssatz eingeben: ");
            double zinssatz = sc.nextDouble();
            double zinsbetrag = kapital * (zinssatz / 100.0);
            System.out.print("Bitte die Laufzeit in Jahren eingeben: ");
            int laufzeit = sc.nextInt();
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("Jahr\tAnfangskapital\tZinsbetrag\tJahresendbetrag");
            for (int i = 1; i <= laufzeit; i++) {
                System.out.println(i + "\t\t" + df.format(kapital) + "\t\t\t" + df.format(zinsbetrag) + "\t\t" + df.format(kapital + zinsbetrag));
                kapital += zinsbetrag;
                zinsbetrag = zinsbetrag * (1 + (double) zinssatz / 100);
            }
            System.out.print("Wollen sie noch einen Sparvertrag ausrechnen? (y/n): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
