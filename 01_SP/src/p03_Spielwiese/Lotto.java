package p03_Spielwiese;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        ziehenMitZuruecklegen();
        ziehenOhneZuruecklegen();
    }

    public static void ziehenMitZuruecklegen(){
        int [] ziehungen = new int[6];
        int zusatzzahl;
        int random;
        for (int i = 0; i < 6; i++) {
            random = (int) (Math.round(Math.random() * 48) + 1);
            ziehungen[i] = random;
        }
        zusatzzahl = (int) (Math.round(Math.random() * 48) + 1);
        printZiehung(ziehungen, zusatzzahl);
    }
    public static void printZiehung(int [] ziehungen, int zusatzzahl){
        Arrays.sort(ziehungen);
        System.out.println(Arrays.toString(ziehungen) + "\n" + zusatzzahl);
    }

    public static void ziehenOhneZuruecklegen(){
        int [] pot = new int[49];
        int [] ziehungen = new int[6];
        int zusatzzahl = 0;
        int random;

        // fill pot
        for (int i = 0; i < 49; i++) {
            pot[i] = i + 1;
        }
        for (int i = 0; i < 6; i++) {
            // system um die gezogene zahl an letzte stelle des arrays packen,
            // dann die letzte stelle removen aus dem array
            // und dann weiter ziehen
            random = (int) (Math.round(Math.random() * pot.length-1) + 1);
            ziehungen[i] = pot[random];
            int temp = pot[pot.length-1];
            pot[random] = temp;
            int [] res = new int[pot.length-1];
            System.arraycopy(pot, 0, res, 0, pot.length - 1);
            pot = res;
        }
        zusatzzahl = pot[(int) (Math.round(Math.random() * pot.length-1) + 1)];
        printZiehung(ziehungen, zusatzzahl);
    }
}
