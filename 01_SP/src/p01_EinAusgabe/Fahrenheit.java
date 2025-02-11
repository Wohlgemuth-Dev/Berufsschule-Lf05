package p01_EinAusgabe;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Temperatur in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf(celsius + " Grad Celsius sind " + fahrenheit + " Grad Fahrenheit");
    }
}
