package p03_Spielwiese;

import java.util.Objects;
import java.util.Scanner;

public class DreiGewinnt {
    public static String[] playerSymbols = {"⭕", "✖️"};
    public static void main(String[] args) {
        String[][] spielfeld;
        Scanner sc = new Scanner(System.in);
        System.out.print("Spielfeldgröße Zeilen: ");
        int zeilen = sc.nextInt();
        System.out.print("Spielfeldgröße Spalten: ");
        int spalten = sc.nextInt();
        spielfeld = new String[zeilen][spalten];

        int activePlayer = 0;
        for (int i = 0; i < zeilen*spalten; i++, activePlayer = (activePlayer+1)%2){
            spieldurchlauf(spielfeld, activePlayer);
            spielfeldAusgeben(spielfeld);
        }
        int[] punkte = punkteAuswerten(spielfeld);

        System.out.println("1. Spieler: " + punkte[0] + " Punkte");
        System.out.println("2. Spieler: " + punkte[1] + " Punkte");
    }

    public static int[] punkteAuswerten(String[][] spielfeld){
        int[] punkte = new int[2];
        for (int i = 1; i < spielfeld.length - 1; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                for (int k = 0; k < 2; k++){
                    if (Objects.equals(spielfeld[i][j], playerSymbols[k]) && Objects.equals(spielfeld[i - 1][j], playerSymbols[k]) && Objects.equals(spielfeld[i + 1][j], playerSymbols[k])){
                        punkte[k]++;
                    }
                }
            }
        }
        for (String[] strings : spielfeld) {
            for (int j = 1; j < strings.length - 1; j++) {
                for (int k = 0; k < 2; k++) {
                    if (Objects.equals(strings[j], playerSymbols[k]) && Objects.equals(strings[j - 1], playerSymbols[k]) && Objects.equals(strings[j + 1], playerSymbols[k])) {
                        punkte[k]++;
                    }
                }
            }
        }
        return punkte;
    }

    public static void spieldurchlauf(String[][] spielfeld, int activePlayer){
        boolean done = false;
        Scanner sc = new Scanner(System.in);
        while (!done){
            System.out.print("\n" + activePlayer+1 + ". Spieler:\nWähle Spalte: ");
            int spalte = sc.nextInt();
            for (int i = spielfeld.length-1; i >= 0; i--) {
                if (spielfeld[i][spalte-1] == null){
                    spielfeld[i][spalte-1] = playerSymbols[activePlayer];
                    done = true;
                    break;
                } else if (i == 0){
                    System.out.println("Die Spalte ist Voll! Wähle eine andere!");
                }
            }
        }
    }

    public static void spielfeldAusgeben(String[][] spielfeld){
        for (int i = 0; i < spielfeld[0].length; i++){
            System.out.print(i+1 + "\t");
        }
        System.out.println();
        for (String[] strings : spielfeld) {
            for (String string : strings) {
                System.out.print((string == null ? "⬜" : string) + "\t");
            }
            System.out.println();
        }
    }
}
