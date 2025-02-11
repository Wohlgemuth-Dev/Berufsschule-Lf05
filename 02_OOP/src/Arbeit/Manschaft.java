package Arbeit;

import java.util.ArrayList;

public class Manschaft {
    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerListe = new ArrayList<>();

    public Manschaft(String name, Trainer trainer, Torwart torwart) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
    }

    public void addSpieler(Spieler spieler){
        spielerListe.add(spieler);
    }

    public String getName() {
        return name;
    }
    public Trainer getTrainer() {
        return trainer;
    }
    public Torwart getTorwart() {
        return torwart;
    }
    public ArrayList<Spieler> getSpielerListe() {
        return spielerListe;
    }
    public void setSpielerListe(ArrayList<Spieler> spielerListe) {
        this.spielerListe = spielerListe;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMotivation(){
        int sum=0;
        for (Spieler spieler : spielerListe) {
            sum += spieler.getMotivation();
        }
        sum+=torwart.getMotivation();
        return sum/(spielerListe.size()+1);
    }

    public int getStaerke(){
        int sum=0;
        for (Spieler spieler : spielerListe) {
            sum += spieler.getStaerke();
        }
        sum+=torwart.getStaerke();
        return sum/(spielerListe.size()+1);
    }
}
