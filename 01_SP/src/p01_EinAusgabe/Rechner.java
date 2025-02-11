package p01_EinAusgabe;

import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gebe die erste Zahl an: ");
        double zahl1 = scanner.nextDouble();
        System.out.print("Gebe die zweite Zahl an: ");
        double zahl2 = scanner.nextDouble();

        System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));
        System.out.println(zahl1 + " - " + zahl2 + " = " + (zahl1 - zahl2));
        System.out.println(zahl1 + " * " + zahl2 + " = " + (zahl1 * zahl2));
        System.out.println(zahl1 + " / " + zahl2 + " = " + (zahl1 / zahl2));
        System.out.println(zahl1 + " hoch " + zahl2 + " = " + (Math.pow(zahl1, zahl2)));
    }
}
