package p05_Schleifen;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class Wurzel {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner sc = new Scanner(System.in);
        System.out.print("Gebe einen positiven ganzzahligen Anfangswert an: ");
        int start = sc.nextInt();
        System.out.print("Gebe einen positiven ganzzahligen Endwert an: ");
        int end = sc.nextInt();
        int d = (end-start)/abs(start-end);
        int a;
        int b;
        if (end <= start) {
            a = end;
            b = start;
        }else {
            a = start;
            b = end;
        }
        for (int i = a; i <= b; i++) {
            System.out.println(i + "\t" + df.format(sqrt(i)));
        }
    }
}
