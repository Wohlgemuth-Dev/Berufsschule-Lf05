package nogard;

public class Nahrung extends Gegenstand{
    private int naerwert;
    public Nahrung(String name, String beschreibung, int naerwert){
        super(name, beschreibung, 0);
        this.naerwert = naerwert;
    }
    public int getNaerwert(){
        return naerwert;
    }

    @Override
    public String getInfo() {
        return "";
    }
}
