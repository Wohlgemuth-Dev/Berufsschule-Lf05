package p02_Verzweigung;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Notenberechnung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie viele Punkte können erreicht werden? ");
        int max = sc.nextInt();
        System.out.print("Wie viele Punkte hast du erreicht? ");
        int curr = sc.nextInt();
        double per = (double) curr / max * 100;
        DecimalFormat df = new DecimalFormat("#,##0.00%");
        int note = 0;
        if (per >= 92){
            note = 1;
        } else if (per >= 81){
            note = 2;
        } else if (per >= 67){
            note = 3;
        } else if (per >= 50){
            note = 4;
        } else if (per >= 30){
            note = 5;
        } else {
            note = 6;
        }

        System.out.println("Du hast " + df.format(per/100) + " und damit die Note " + note + " erreicht.");
    }
}
