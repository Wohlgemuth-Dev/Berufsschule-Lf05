package p01_EinAusgabe;

import java.util.Scanner;

public class Zeugnis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Welche Note hast du in LF0" + (i + 1) + ": ");
            sum += sc.nextInt();

        }
        double avg = (double) sum / 5;
        System.out.println("Durchschnittsnote = " + avg);
    }
}
