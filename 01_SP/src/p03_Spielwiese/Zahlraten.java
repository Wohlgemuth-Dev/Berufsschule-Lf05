package p03_Spielwiese;

import java.util.Scanner;

public class Zahlraten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1;
        int d = 50;
        int max = 100;
        System.out.print("Gib eine Nummer von 1 bis 100 ein: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (min == max){
                break;
            }
            if (max - min == 1){
                System.out.print("Lautet Ihre Zahl: " + min + "? (y/n) ");
                String ans = sc.next();
                if (ans.equals("y")){
                    max = min;
                } else {
                    min = max;
                }
                continue;
            }
            System.out.print("Zwischen " + min + " und "+ d + "? (y/n)");
            String ans = sc.next();
            if (ans.equals("y")) {
                max = d;
            } else {
                min = d;
            }
            d = min + (max - min) / 2;
        }
        System.out.println("Ihre Nummer ist: " + min);
    }
}
