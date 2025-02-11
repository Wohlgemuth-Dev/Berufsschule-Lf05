package p03_Spielwiese;

import java.util.Scanner;

public class Mastermind {
    public static void main(String[] args) {
        while (true){
            System.out.println("/* Mastermind */");

            run();

            Scanner scanner = new Scanner(System.in);
            System.out.print("Wanna play again? (y/n): ");
            String answer = scanner.nextLine();
            if (answer.equals("n")){
                break;
            }
        }
    }
    public static void run(){
        String gesuchteZahl = "0237";
        int durchgaenge = 0;
        int maxDurchgaenge = 10;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < maxDurchgaenge; i++) {
            int treffer = 0;
            int volltreffer = 0;
            System.out.print((durchgaenge + 1) + ". Versuch: ");
            String eingabe = scanner.nextLine();
            for (int j = 0; j < gesuchteZahl.length(); j++) {
                if (gesuchteZahl.charAt(j) == eingabe.charAt(j)){
                    volltreffer = volltreffer + 1;
                }
                else {
                    for (int k = 0; k < gesuchteZahl.length(); k++) {
                        if (gesuchteZahl.charAt(k) == eingabe.charAt(j)){
                            treffer = treffer + 1;
                        }
                    }

                }

            }
            durchgaenge = durchgaenge + 1;
            System.out.println("Volltreffer: " + volltreffer + " ,Treffer: " + treffer);
            if (volltreffer == gesuchteZahl.length()){
                System.out.println("Gewonnen!");
                System.out.println("Du hast "+ durchgaenge + " Versuche gebraucht!");
                break;
            }
        }
    }
}
