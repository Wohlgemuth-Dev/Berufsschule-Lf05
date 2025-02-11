package p02_Verzweigung;

import java.util.Scanner;

public class Fuehrerschein {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib dein Alter an: ");
        int alter = sc.nextInt();
        if (alter < 14) {
            System.out.println("Du darfst Bobby-Car oder Fahrrad fahren.");
        } else if (alter < 16) {
            System.out.println("Du darfst schon 50er fahren.");
        } else if (alter < 18) {
            System.out.println("Du darfst schon 125er fahren, aber noch kein Auto.");
        } else {
            System.out.println("Du darfst jetzt auch Auto fahren.");
        }
    }
}
