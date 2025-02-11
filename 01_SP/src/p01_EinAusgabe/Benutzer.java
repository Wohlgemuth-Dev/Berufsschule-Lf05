package p01_EinAusgabe;

import java.util.Scanner;

public class Benutzer {
    public static void main(String[] args) {
        System.out.print("Wie ist dein Vorname? ");
        Scanner scanner = new Scanner(System.in);
        String vorname = scanner.nextLine();
        System.out.print("Wie ist dein Nachname? ");
        String nachname = scanner.nextLine();
        System.out.println("Hallo " + vorname + " " + nachname + ".");
    }
}
