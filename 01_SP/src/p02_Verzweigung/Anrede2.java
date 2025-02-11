package p02_Verzweigung;

import java.util.Objects;
import java.util.Scanner;

public class Anrede2 {
    public static void main(String[] args) {
        System.out.print("Wie ist dein Vorname? ");
        Scanner scanner = new Scanner(System.in);
        String vorname = scanner.nextLine();
        System.out.print("Wie ist dein Nachname? ");
        String nachname = scanner.nextLine();
        System.out.print("Welches Geschlecht hast du? 'm' für Mann, 'w' für Frau und 'd' für Divers: ");
        String geschlecht = scanner.nextLine();
        if (Objects.equals(geschlecht, "m")) {
            System.out.println("Hallo Herr " + vorname + " " + nachname + ".");
        } else if (Objects.equals(geschlecht, "w")) {
            System.out.println("Hallo Frau " + vorname + " " + nachname + ".");
        } else {
            System.out.println("Hallo " + vorname + " " + nachname + ".");
        }
    }
}
