package p08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Kino {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[][] saal = erzeugenSall();

        while (true) {
            System.out.println("Was möchten Sie machen? Reservieren (1), Stornieren (2) oder Beenden (3)?");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    reservierenPlatz(saal);
                    break;
                case 2:
                    stornierenPlatz(saal);
                    break;
                case 3:
                    return;
                default:
            }
            anzeigenSaal(saal);
        }
    }

    public static String[][] erzeugenSall(){
        System.out.print("Wie viele Reihen hat das Kino?: ");
        int reihen = sc.nextInt();
        System.out.print("Wie viele Spalten hat das Kino?: ");
        int spalten = sc.nextInt();
        String[][] saal = new String[reihen][spalten];

        // init saal
        for (String[] strings : saal) {
            Arrays.fill(strings, "O");
        }
        return saal;
    }

    public static void anzeigenSaal(String[][] saal){
        for (String[] strings : saal) {
            System.out.println(Arrays.deepToString(strings));
        }
    }

    public static void reservierenPlatz(String[][] saal){
        System.out.print("In welcher Reihe wollen sie Reservieren?: ");
        int reihen = sc.nextInt();
        System.out.print("In welcher Spalte wollen sie Reservieren?: ");
        int spalten = sc.nextInt();
        if (saal[reihen-1][spalten-1].equals("O")) {
            saal[reihen-1][spalten-1] = "X";
        } else {
            System.out.println("Dieser Platz ist bereits reserviert.");
        }
    }

    public static void stornierenPlatz(String[][] saal){
        System.out.print("In welcher Reihe wollen sie Stornieren?: ");
        int reihen = sc.nextInt();
        System.out.print("In welcher Spalte wollen sie Stornieren?: ");
        int spalten = sc.nextInt();
        if (saal[reihen-1][spalten-1].equals("X")) {
            saal[reihen-1][spalten-1] = "O";
        } else {
            System.out.println("Dieser Platz ist nicht reserviert.");
        }
    }
}
