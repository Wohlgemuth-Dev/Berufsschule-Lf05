package p02_Verzweigung;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gebe dein Gewicht an (in kg): ");
        double gewicht = sc.nextDouble();
        System.out.print("Bitte gebe deine Körpergröße an (in cm): ");
        double groeße = sc.nextDouble()/100;
        System.out.print("Bitte gebe dein Geschlecht an (m/w): ");
        String geschlecht = sc.next();
        double bmi = gewicht/(groeße*groeße);
        if (geschlecht.equalsIgnoreCase("m")) {
           if (bmi < 20){
               System.out.println("Untergewicht.");
           } else if (bmi < 25){
               System.out.println("Normalgewicht.");
           } else if (bmi < 30){
               System.out.println("Übergewicht.");
           } else if (bmi < 40){
               System.out.println("Adipositas");
           } else {
               System.out.println("Starke Adipositas");
           }
        } else if (geschlecht.equalsIgnoreCase("w")) {
            if (bmi < 19){
                System.out.println("Untergewicht.");
            } else if (bmi < 24){
                System.out.println("Normalgewicht.");
            } else if (bmi < 30){
                System.out.println("Übergewicht.");
            } else if (bmi < 40){
                System.out.println("Adipositas");
            } else {
                System.out.println("Starke Adipositas");
            }
        }
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("BMI beträgt " + df.format(bmi));
    }
}
