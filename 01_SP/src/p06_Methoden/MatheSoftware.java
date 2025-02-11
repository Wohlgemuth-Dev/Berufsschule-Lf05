package p06_Methoden;

import java.util.Scanner;

public class MatheSoftware {
    public static void main(String[] args) {
        while (true) {
            String option = schreibeMenue();
            double ans = calculate(option);
            System.out.println("Das ergebnis ist: " + Mathe.runden(ans, 2));
            Scanner sc = new Scanner(System.in);
            System.out.print("Wollen sie eine weitere Rechnung durchführen? [y/n]: ");
            if (sc.next().equalsIgnoreCase("n")) {
                break;
            } else {
                System.out.println("\n--------------------------");
            }
        }
    }
    public static String schreibeMenue(){
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Folgende Rechenoperationen stehen zur Auswahl:
                [+] für Addition
                [-] für Subtraktion
                [*] für Multiplikation
                [/] für Division
                [p] für Potenzieren
                [w] für Wurzelziehen""");
        System.out.print("Deine Auswahl: ");
        return sc.next();
    }
    public static double[] getTwoNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte die erste Zahl angeben: ");
        double n1 = sc.nextDouble();
        System.out.print("Bitte die zweite Zahl angeben: ");
        double n2 = sc.nextDouble();
        return new double[]{n1, n2};
    }
    public static double getOneNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte die Zahl angeben: ");
        return sc.nextDouble();
    }
    public static double calculate(String option){
        switch (option){
            case "+", "-", "*", "/", "p":
                double[] n = getTwoNumbers();
                switch (option){
                    case "+":
                        return n[0] + n[1];
                    case "-":
                        return n[0] - n[1];
                    case "*":
                        return n[0] * n[1];
                    case "/":
                        return n[0] / n[1];
                    case "p":
                        return Math.pow(n[0], n[1]);
                }
                break;
            case "w":
                double m = getOneNumber();
                return Math.sqrt(m);
            default:
                return -1;
        }
        return -1;
    }
}
