package p02_Verzweigung;

import java.util.Scanner;

public class Anrede {
    public static void main(String[] args) {
        System.out.print("Wie ist dein Vorname? ");
        Scanner scanner = new Scanner(System.in);
        String vorname = scanner.nextLine();
        System.out.print("Wie ist dein Nachname? ");
        String nachname = scanner.nextLine();
        System.out.print("Welches Geschlecht hast du? '1' für Mann, '2' für Frau und '3' für Divers: ");
        int geschlecht = scanner.nextInt();
        if (geschlecht == 1) {
            System.out.println("Hallo Herr " + vorname + " " + nachname + ".");
        } else if (geschlecht == 2) {
            System.out.println("Hallo Frau " + vorname + " " + nachname + ".");
        } else {
            System.out.println("Hallo " + vorname + " " + nachname + ".");
        }
    }
}
