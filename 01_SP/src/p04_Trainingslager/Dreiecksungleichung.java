package p04_Trainingslager;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Dreiecksungleichung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] n = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Gebe sie Zahl Nummer " + (i + 1) + " an: ");
            n[i] = sc.nextDouble();
        }
        int control = 0;
        for (int j = 0; j < 3; j++) {
            if (!isShorter(n[j], n[(j + 1) % 3], n[(j + 2) % 3])){
                break;
            }
            control += 1;
        }
        if (control == 3){
            System.out.println("Das Dreieck ist gültig!");
        } else {
            System.out.println("Das Dreieck ist ungültig!");
            return;
        }
        // herons formula for Area
        double s = (n[0] + n[1] + n[2])/2;
        double A = sqrt(s*(s-n[0])*(s-n[1])*(s-n[2]));

        DecimalFormat df = new DecimalFormat("#,##0.00");

        // output
        System.out.println("Umfang beträgt " + df.format(n[0] + n[1] + n[2])
                + " und der Flächeninhalt beträgt " + df.format(A));
    }

    public static boolean isShorter(double a, double b, double c) {
        return a < (b + c);
    }
}
