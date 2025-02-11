package p01_EinAusgabe;

import java.util.Scanner;

public class Zaehlmass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie die Zahl ein: ");
        int zahl = sc.nextInt();
        int gros = zahl / 144;
        zahl = zahl % 144;
        System.out.println(gros + " Gros");
        int schock = zahl / 60;
        zahl = zahl % 60;
        System.out.println(schock + " Schock");
        int dutzend = zahl / 12;
        zahl = zahl % 12;
        System.out.println(dutzend + " Dutzend");
        System.out.println(zahl + " Stück");
    }
}
