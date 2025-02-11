package p02_Verzweigung;

import java.util.Scanner;

public class Wiederstand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie Groß ist R1: ");
        double r1 = sc.nextDouble();
        System.out.print("Wie Groß ist R2: ");
        double r2 = sc.nextDouble();
        System.out.print("Sind sie in einer Parallelschlatung 'P' oder in einer Reihenschaltung 'R'?: ");
        String cond = sc.next();
        double rg = 0;
        if (cond.equalsIgnoreCase("R")) {
            rg = r1+r2;
        } else if (cond.equalsIgnoreCase("P")) {
            rg = (r1*r2)/(r1+r2);
        }
        System.out.println("Der Gesamtwiederstand beträgt " +  rg + " Ohm");
    }
}
