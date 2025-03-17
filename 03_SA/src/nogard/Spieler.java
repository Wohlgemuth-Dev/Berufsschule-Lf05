package nogard;

import java.util.LinkedList;
import java.util.List;

public class Spieler {
    private String name;
    private float maximaleTragkraft;
    private final int FITNESS_MAX = 5000;
    private final int VERBRAUCH_GEHEN = 500;
    private int fitness;
    private List<Gegenstand> inventar = new LinkedList<>();
    private Bereich bereich;

    public Spieler(String name, float maximaleTragkraft, int fitness, Bereich bereich) {
        this.name = name;
        this.maximaleTragkraft = maximaleTragkraft;
        this.fitness = fitness;
        this.bereich = bereich;
    }

    public String getName() {
        return name;
    }

    public float getMaximaleTragkraft() {
        return maximaleTragkraft;
    }

    public int getFitness() {
        return fitness;
    }

    public Bereich getBereich() {
        return bereich;
    }

    public float getTraglast(){
        float traglast = 0;
        for (Gegenstand g : inventar) {
            traglast += g.getGewicht();
        }
        return traglast;
    }

    public void aufnehmenGegenstand(String name) throws GegenstandZuSchwerException{
        Gegenstand g = bereich.suchenGegenstand(name);
        if (g.getGewicht() + getTraglast() > maximaleTragkraft) {
            throw new GegenstandZuSchwerException("Gegenstand kann dem Inventar nicht hinzugefügt werden, da es die maximale Traglast überschreitet");
        }
        inventar.add(g);
        bereich.entfernenGegenstand(g);
    }

    public void ablegenGegenstand(String name) throws GegenstandNichtVorhandenException{
        Gegenstand g = bereich.suchenGegenstand(name);
        inventar.remove(g);
        bereich.platzierenGegenstand(g);
    }

    public void essen(String name){
        Nahrung n = (Nahrung) bereich.suchenGegenstand(name);
        bereich.entfernenGegenstand(n);
        if (fitness + n.getNaerwert() > FITNESS_MAX) {
            fitness = FITNESS_MAX;
            throw new SpielerSattException("Spieler ist satt!");
        }
        fitness += n.getNaerwert();
    }

    public void geheInBereich(Bereich b) throws SpielerZuSchwachException{
        if (fitness-VERBRAUCH_GEHEN<0){
            throw new SpielerZuSchwachException("Spieler hat nicht genug energie um in den nächsten Bereich zu gehen!");
        }
        fitness -= VERBRAUCH_GEHEN;
        bereich = b;
    }

    public String getInfo() {
        return "";
    }
}
