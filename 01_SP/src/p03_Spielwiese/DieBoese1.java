package p03_Spielwiese;

import java.util.Scanner;

public class DieBoese1 {
    static int [] gesamtpunkte;
    static int playerCount;
    static int maxPoints;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mit wie vielen Spielern möchten Sie spielen? ");
        playerCount = sc.nextInt();
        gesamtpunkte = new int[playerCount];
        initPunkte();

        System.out.print("Bis wie vielen Punkten wollen Sie spielen? ");
        maxPoints = sc.nextInt();

        run();
    }

    public static void run(){
        int currentPlayer = 0;
        while (true){
            int playerPoints = spielerRunde(currentPlayer);
            punkteAufrechnen(currentPlayer, playerPoints);
            if (checkForWinner() != -1){
                declareWinner();
                break;
            }
            currentPlayer = (currentPlayer + 1) % playerCount;  // Durch spieler Iterieren
        }
    }

    public static int spielerRunde(int currentPlayer){
        // go to 11 points
        int points = 0;
        points = bis11Punkte(points);
        if (points < 11){
            System.out.println("Spieler " + currentPlayer + " hat es nicht bis 11 geschaft!");
            return 0;
        }
        else{
            points = spielerInteraction(currentPlayer, points);
            return points;
        }
    }

    public static int spielerInteraction(int currentPlayer, int points){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Spieler " + currentPlayer + ", Punkte: " + (points + gesamtpunkte[currentPlayer]) + ",  noch ein Wurf? (y/n)");
            if (sc.next().equals("y")){
                int dice = throwDice();
                System.out.println("Spieler " + currentPlayer + " hat eine " + dice + " gewürfelt");
                if (dice != 1) {
                    points = points + dice;
                }
                else {
                    points = 0;
                    break;
                }
            }
            else{
                return points;
            }
        }
        return points;
    }

    public static int bis11Punkte(int points){
        while(points < 11){
            int dice = throwDice();
            if (dice != 1) {
                points = points + dice;
            }
            else {
                break;
            }
        }
        System.out.println("Bis 11 geschafft! du darfst spielen!");
        return points;
    }

    /**
     * Simulates the rolling of a six-sided die.
     *
     * @return a random integer between 1 and 6, inclusive.
     */
    public static int throwDice(){
        return (int) (Math.round(Math.random()*5) +1);
    }

    public static void declareWinner(){
        System.out.println("Spieler " + checkForWinner() + " hat gewonnen!");
    }

    /**
     * Updates the total points of each player by adding their round points.
     *
     * This method iterates through all players, updating their total points
     * with the points they earned in the current round. The total points are
     * stored in the 'gesamtpunkte' array, and the round points are stored in
     * the 'rundenpunkte' array.
     */
    public static void punkteAufrechnen(int spielerZahl, int punkte){
        gesamtpunkte[spielerZahl] = gesamtpunkte[spielerZahl] + punkte;
    }

    /**
     * Checks all players' total points to determine if any player has reached or exceeded the maximum points required to win.
     *
     * @return the index of the player who has won, or -1 if no player has reached the required points.
     */
    public static int checkForWinner(){

        for (int i = 0; i < playerCount; i++) {
            if (gesamtpunkte[i] >= maxPoints) {
                return i;
            }
        }
        return -1;
    }

    public static void initPunkte(){
        for (int i = 0; i < playerCount; i++) {
            gesamtpunkte[i] = 0;
        }
    }
}
