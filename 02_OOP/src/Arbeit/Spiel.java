package Arbeit;

public class Spiel {
    private Manschaft manschaft1;
    private Manschaft manschaft2;
    private Ergebnis ergebnis;
    private StringBuilder spielverlauf;

    public Spiel(Manschaft manschaft1, Manschaft manschaft2) {
        this.manschaft1 = manschaft1;
        this.manschaft2 = manschaft2;
        this.ergebnis = new Ergebnis();
    }


    public Manschaft getManschaft1() {
        return manschaft1;
    }
    public Manschaft getManschaft2() {
        return manschaft2;
    }
    public Ergebnis getErgebnis() {
        return ergebnis;
    }
}
