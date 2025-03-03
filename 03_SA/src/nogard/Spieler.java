package nogard;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

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

    public void aufnehmenGegenstand(Gegenstand g) throws GegenstandZuSchwerException{
        if (g.getGewicht() + getTraglast() > maximaleTragkraft) {
            throw new GegenstandZuSchwerException("Gegenstand kann dem Inventar nicht hinzugefügt werden, da es die maximale Traglast überschreitet");
        }
        if (g.getName().equals(bereich.suchenGegenstand(g.getName()))) {
            throw new GegenstandNichtVorhandenException("Gegenstand ist nicht in dem Bereich");
        }
        inventar.add(g);
        bereich.entfernenGegenstand(g);
    }

    public void ablegenGegenstand(Gegenstand g) throws GegenstandNichtVorhandenException{
        if (!inventar.remove(g)){
            throw new GegenstandNichtVorhandenException("Gegenstand" + g.getName() + " ist nicht im Inventar");
        }
        bereich.platzierenGegenstand(g);
    }

    public void essen(Nahrung n){
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
