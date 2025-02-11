package p05_Schleifen;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bevoelkerungswachstum {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Bitte die aktuelle Populationsgröße in Milliarden eingeben: ");
            double startpopulation = sc.nextDouble();
            double population = startpopulation;
            System.out.print("Bitte den jährlichen Zuwachs in Prozent eingeben: ");
            double zuwachsprozent = sc.nextDouble();
            System.out.print("Bitte die Laufzeit der Prognose in Jahren eingeben: ");
            double laufzeit = sc.nextDouble();
            System.out.print("Bitte die Anzahl der anzuzeigenden Nachkommastellen eingeben: ");
            int nachkommastellen = sc.nextInt();
            DecimalFormat df = new DecimalFormat("#.##");
            df.setMinimumFractionDigits(nachkommastellen);
            System.out.println("Jahr\tAnfangspopulation\t\tZuwachs\t\tEndpopulation");
            double zuwachs = population * (zuwachsprozent / 100.0);
            for (int i = 1; i <= laufzeit; i++) {
                String bigger = "";
                if (population + zuwachs >= startpopulation*1.2)
                    bigger = "*";
                System.out.println(i + "\t\t" + df.format(population) + "\t\t\t\t\t" + df.format(zuwachs) + "\t\t" + df.format(zuwachs+population) + " " + bigger);
                population += zuwachs;
                zuwachs = population * (zuwachsprozent / 100.0);
            }
            System.out.print("Wollen sie noch eine Prognose ausrechnen? (y/n): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
