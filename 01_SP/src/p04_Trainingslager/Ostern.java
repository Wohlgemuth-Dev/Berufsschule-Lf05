package p04_Trainingslager;

import java.util.Scanner;

public class Ostern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib das Startjahr an: ");
        int startjahr = sc.nextInt();
        System.out.print("Gib das Endjahr an: ");
        int endjahr = sc.nextInt();
        for (int i = startjahr; i <= endjahr; i++) {
            int m = getM(i);
            int n = getN(i);
            int a = i % 19;
            int b = i % 4;
            int c = i % 7;
            int d = (19 * a + m) % 30;
            int e = (2 * b + 4 * c + 6 * d + n) % 7;
            if (22 + d + e > 31){
                if (d+e-9==26){
                    System.out.println(19 + " April " + i);
                } else if (d+e-9==25) {
                    System.out.println(18 + " April " + i);
                } else {
                    System.out.println((d+e-9) + " April " + i);
                }
            } else {
                System.out.println((22+d+e) + " März " + i);
            }
        }
    }
    public static int getM(int jahr){
        if (jahr >= 1583 && jahr <= 1899) {
            return 23;
        } else if (jahr >= 1900 && jahr <= 2199) {
            return 24;
        } else if (jahr >= 2200) {
            return 25;
        }
        return 0;
    }
    public static int getN(int jahr){
        if (jahr >= 1583 && jahr <= 1699) {
            return 2;
        } else if (jahr >= 1700 && jahr <= 1799) {
            return 3;
        } else if (jahr >= 1800 && jahr <= 1899) {
            return 4;
        } else if (jahr >= 1900 && jahr <= 2099) {
            return 5;
        } else if (jahr >= 2100 && jahr <= 2199) {
            return 6;
        } else if (jahr >= 2200) {
            return 0;
        }
        return 0;
    }
}
