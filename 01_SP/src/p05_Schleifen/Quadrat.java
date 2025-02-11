package p05_Schleifen;

import java.util.Scanner;

public class Quadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Wie groß soll das Quadrat sein: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        for (int i = 1; i < n-1; i++) {
            System.out.println();
            System.out.print("*");
            for (int j = 1; j < n-1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
