package p02_Verzweigung;

import static java.lang.Math.abs;

public class SBahn {
    public static void main(String[] args) {
        System.out.println(berechnePreis(0,0));
    }
    public static double berechnePreis(int start, int end){
        int fertigeHauptlinien = 5;
        int linienLaenge = 6;
        int startFirstNumber = (start - start % 10) / 10;
        int startSecondNumber = start % 10;
        int endFirstNumber = (end - end % 10) / 10;
        int endSecondNumber = end % 10;

        int baseValue = 2;
        int bonusValue = 0;

        // check for neighbour
        if (checkForNeighbour(startFirstNumber, endFirstNumber, startSecondNumber, endSecondNumber, fertigeHauptlinien)) {
            return 1.0;
        }

        // Endstation
        if (startSecondNumber == 0 || startSecondNumber == linienLaenge){
            bonusValue += 1;
        }
        if (endSecondNumber == 0 || endSecondNumber == linienLaenge){
            bonusValue += 1;
        }

        // Zonenüberquerung
        if ((startSecondNumber <= 3 && endSecondNumber <= 3) || ((startSecondNumber > 3 && endSecondNumber > 3) && (startFirstNumber == endFirstNumber))){
            ;
        } else {
            bonusValue += 1;
        }
        return baseValue + bonusValue;
    }
    public static boolean checkForNeighbour (int startFirstNumber, int endFirstNumber, int startSecondNumber, int endSecondNumber, int fertigeHauptlinien){
        // check for edge case "Ringebene"
        if (startSecondNumber == 3){
            if ((abs(startSecondNumber - endSecondNumber)  == 1 && (startFirstNumber - endFirstNumber == 0
                    || (startFirstNumber == 0 || endFirstNumber == 0)))
                    || (startSecondNumber - endSecondNumber == 0 && (abs(startFirstNumber - endFirstNumber) == 1
                    || (startFirstNumber == 1 && endFirstNumber == fertigeHauptlinien)
                    || (startFirstNumber == fertigeHauptlinien && endFirstNumber == 1)))) {
                return true;
            }
        } else {
            if (abs(startSecondNumber - endSecondNumber)  == 1 && (startFirstNumber - endFirstNumber == 0 || (startFirstNumber == 0 || endFirstNumber == 0))) {
                return true;
            }
        }
        return false;
    }
}
