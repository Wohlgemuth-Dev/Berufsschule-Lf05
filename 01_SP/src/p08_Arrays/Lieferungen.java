package p08_Arrays;

import java.util.Arrays;

public class Lieferungen {
    public static void main(String[] args) {
        int[][] jan = {
                {100, 50, 75},
                {20, 10, 15},
                {30, 30, 20},
                {50, 70, 20}
        };
        int[][] feb = {
                {100, 40, 70},
                {30, 5, 0},
                {40, 40, 20},
                {50, 60, 50}
        };

        int[][] summe = summe(jan, feb);

        zeilensummen(summe);
        spaltensummen(summe);
    }

    public static int[][] summe(int[][] jan, int[][] feb){
        int[][] summe = new int[jan.length][jan[0].length];
        for (int i = 0; i < jan.length; i++) {
            for (int j = 0; j < jan[0].length; j++) {
                summe[i][j] = jan[i][j] + feb[i][j];
            }
        }
        return summe;
    }

    public static void zeilensummen(int[][] summe){
        int[] zeilensummen = new int[summe.length];
        for (int i = 0; i < summe.length; i++) {
            zeilensummen[i] = 0;
            for (int j = 0; j < summe[0].length; j++) {
                zeilensummen[i] += summe[i][j];
            }
        }
        System.out.println(Arrays.toString(zeilensummen));
    }

    public static void spaltensummen(int[][] summe){
        int[] spaltensummen = new int[summe[0].length];
        for (int i = 0; i < summe[0].length; i++) {
            spaltensummen[i] = 0;
            for (int j = 0; j < summe.length; j++) {
                spaltensummen[i] += summe[j][i];
            }
        }
        System.out.println(Arrays.toString(spaltensummen));
    }
}
