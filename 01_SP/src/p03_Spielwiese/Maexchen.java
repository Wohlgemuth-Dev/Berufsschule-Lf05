package p03_Spielwiese;

import java.util.Scanner;

public class Maexchen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gib die erste Augenzahl an: ");
        int number2 = sc.nextInt();
        System.out.print("Gib die zweite Augenzahl an: ");
        int number1 = sc.nextInt();
        int points;
        if ((number1 == 1 && number2 == 2) || (number1 == 2 && number2 == 1)) {
            points = 1000;
        } else if (number1 == number2){
            points = number1 * 100;
        } else {
            if (number1 > number2) {
                points = number1 * 10 + number2;
            } else {
                points = number2 * 10 + number1;
            }
        }
        System.out.println("Die Augenzahlen haben: " + points + " Punkte!");
    }
}
