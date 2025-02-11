package p05_Schleifen;

import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Bei welchem Jahr soll Ihre Berechnung starten? ");
            int start = sc.nextInt();
            System.out.print("Bis zu welchem Jahr soll Ihre Berechnung gehen? ");
            int end = sc.nextInt();
            for (int i = start; i <= end; i++) {
                if (checkForSchaltjahr(i)) {
                    System.out.println(i);
                }
            }
            System.out.print("Wollen sie noch eine weiter berechnung durchführen? (y/n): ");
            String ans = sc.next();
            if (ans.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    public static boolean checkForSchaltjahr(int jahr) {
        if (jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0) {
            return true;
        }
        return false;
    }
}
