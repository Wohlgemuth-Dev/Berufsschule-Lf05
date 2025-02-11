package p02_Verzweigung;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bestellung {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00 €");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Wie viel Schrauben: ");
            int schrauben = sc.nextInt();
            System.out.print("Wie viel Muttern: ");
            int muttern = sc.nextInt();
            System.out.print("Wie viel Unterlegscheiben: ");
            int unterlegscheiben = sc.nextInt();
            if (schrauben != muttern) {
                System.out.print("Ist es Korrekt dass sie eine unterschiedliche Anzahl and Schrauben und Muttern bestellen? (j/n): ");
                String cond = sc.next();
                if (cond.equalsIgnoreCase("n")) {
                    continue;
                } else if (cond.equals("j")) {
                    break;
                }
            } else {
                System.out.println("Die bestellung ist ok!");
                System.out.println("Der Preis deiner Bestellung beträgt: " + df.format(schrauben * 0.05 + muttern * 0.03 + unterlegscheiben * 0.01));
                break;
            }
        }
    }
}
