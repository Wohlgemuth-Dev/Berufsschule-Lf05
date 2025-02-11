package Arbeit;

public class Spieler extends Person{
    private int staerke;
    private int torschuss;
    private int motivation;
    private int gesamtTore;
    public Spieler(String name,
                   int alter,
                   int staerke,
                   int torschuss,
                   int motivation,
                   int gesamtTore) {
        super(name, alter);
        this.staerke = staerke;
        this.torschuss = torschuss;
        this.motivation = motivation;
        this.gesamtTore = gesamtTore;
    }
    public int getStaerke(){
        return staerke;
    }
    public int getTorschuss(){
        return torschuss;
    }
    public int getMotivation(){
        return motivation;
    }
    public int getGesamtTore(){
        return gesamtTore;
    }
    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }
    public void setTorschuss(int torschuss) {
        this.torschuss = torschuss;
    }
    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }
    public void setGesamtTore(int gesamtTore) {
        this.gesamtTore = gesamtTore;
    }
    @Override
    public String toString() {
        String text = super.toString();
        text = text + "\n\t" + "  Stärke " + staerke;
        text = text + "\n\t" + "  Torschuss " + torschuss;
        text = text + "\n\t" + "  Motivation: " + motivation;
        text = text + "\n\t" + "  GesamtTore " + gesamtTore;
        return text;
    }
}
