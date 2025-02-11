package p01_EinAusgabe;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Silvesterrakete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie viel Zeit benötigt der Raketenkörper? ");
        double t = sc.nextDouble();
        double vms = 9.81 * t;
        double vkmh = vms * 3.6;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(vms) + " m/s");
        System.out.println(df.format(vkmh) + " km/h");
    }
}
