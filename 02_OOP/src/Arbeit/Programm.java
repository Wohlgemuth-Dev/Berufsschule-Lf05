package Arbeit;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        /*Spieler spieler = new Spieler("Al", 20, 10, 5, 2, 23);
        Trainer trainer = new Trainer("Mika", 19, 69);
        Torwart torwart = new Torwart("Lasse", 25, 1,7,5);
        System.out.println(spieler);
        System.out.println(trainer);
        System.out.println(torwart);*/
        Spieler spieler1 = new Spieler("Al", 20, 10, 5, 2, 23);
        Spieler spieler2 = new Spieler("Hans", 20, 1, 5, 2, 23);
        Spieler spieler3 = new Spieler("Elias", 20, 3, 5, 6, 23);
        Spieler spieler4 = new Spieler("Med", 20, 5, 5, 8, 23);
        Trainer trainer1 = new Trainer("Mika", 19, 6);
        Torwart torwart1 = new Torwart("Lasse", 25, 1,2,5);
        Manschaft manschaft1 = new Manschaft("Die Halunken", trainer1, torwart1);
        manschaft1.addSpieler(spieler1);
        manschaft1.addSpieler(spieler2);
        manschaft1.addSpieler(spieler3);
        manschaft1.addSpieler(spieler4);

        Spieler spieler5 = new Spieler("Bron", 20, 10, 5, 2, 23);
        Spieler spieler6 = new Spieler("Aron", 20, 9, 5, 2, 23);
        Spieler spieler7 = new Spieler("Aaron", 20, 3, 5, 6, 23);
        Spieler spieler8 = new Spieler("Aaaron", 20, 5, 5, 8, 23);
        Trainer trainer2 = new Trainer("Julian", 19, 69);
        Torwart torwart2 = new Torwart("Lukas", 21, 10,7,5);
        Manschaft manschaft2 = new Manschaft("Die Banditen", trainer2, torwart2);
        manschaft2.addSpieler(spieler5);
        manschaft2.addSpieler(spieler6);
        manschaft2.addSpieler(spieler7);
        manschaft2.addSpieler(spieler8);

        Spiel spiel = new Spiel(manschaft1, manschaft2);


        System.out.println(manschaft1.getMotivation());

        System.out.println(manschaft1.getStaerke());

        System.out.println(manschaft2.getMotivation());

        System.out.println(manschaft2.getStaerke());

        spiel.getErgebnis().addTrefferTeam1();
        spiel.getErgebnis().addTrefferTeam2();
        spiel.getErgebnis().addTrefferTeam1();
        spiel.getErgebnis().addTrefferTeam1();
        spiel.getErgebnis().addTrefferTeam2();

        System.out.println(spiel.getErgebnis());

    }
}
