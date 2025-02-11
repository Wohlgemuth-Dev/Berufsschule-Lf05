package p03_Spielwiese;

import java.util.Scanner;

public class SpielDesLebens {
    public static void main(String[] args) {
        int[][] spiel;
        spiel = initSpiel();

        printSpiel(spiel);

    }

    public static int[][] initSpiel() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Wie viele Reihen? ");
        int reihen = sc.nextInt();
        System.out.print("Wie viele Zeilen? ");
        int zeilen = sc.nextInt();

        int[][] spiel = new int[reihen][zeilen];

        for (int i = 0; i < spiel.length; i++) {
            for (int j = 0; j < spiel[i].length; j++) {
                spiel[i][j] = Math.random() < 0.3 ? 1 : 0;
            }
        }
        return spiel;
    }
    public static void printSpiel(int[][] spiel) {
        for (int i = 0; i < spiel.length; i++) {
            for (int j = 0; j < spiel[i].length; j++) {
                System.out.print(spiel[i][j] == 0 ? "X " : "O ");
            }
            System.out.println();
        }
    }
    public static void spieldurchlauf(int[][] spiel) {
        for (int i = 0; i < spiel.length; i++) {
            for (int j = 0; j < spiel[i].length; j++) {
                int neighbours = 0;
                if (spiel[i][j] == 0) {
                    if (i-1 < spiel.length) {}
                }
            }
        }
    }
}
