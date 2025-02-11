package nogard;

import java.util.HashMap;
import java.util.Map;

/**
 * Diese Klasse modelliert Bereiche.Ein Bereich kann ein Gebiet, ein Haus, ein Raum etc. sein.
 * 
 * Jeder Bereich ist mit anderen Bereichen �ber Ausg�nge verbunden. M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * 
 * F�r jeden Ausgang h�lt ein Bereich eine Referenz auf den benachbarten Bereich parat.
 */
public class Bereich {

	private String beschreibung;
	private Map<Richtungen, Bereich> nachbarn = new HashMap<>();

    /**
     * Konstruktor.
     * @param beschreibung	Die Beschreibung des Areals.
     */
    public Bereich(String beschreibung) {
        this.beschreibung = beschreibung;
        nachbarn.put(Richtungen.NORTH, null);
		nachbarn.put(Richtungen.EAST, null);
		nachbarn.put(Richtungen.SOUTH, null);
		nachbarn.put(Richtungen.WEST, null);
    }

    /**
     * Liefert die Beschreibung des Bereichs.
     * @return	Die Beschreibung des Bereichs.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Definiert die benachbarten Bereiche des Bereichs. 
     * Jede Richtung f�hrt entweder in einen anderen Bereich oder ist 'null' (kein Ausgang).
     * @param nord	Der im Norden benachbarte Bereich.
     * @param ost	Der im Osten benachbarte Bereich.
     * @param sued	Der im S�den benachbarte Bereich.
     * @param west	Der im Westen benachbarte Bereich.
     */
    public void setNachbarn(Bereich nord, Bereich ost, Bereich sued, Bereich west) {
        nachbarn.put(Richtungen.NORTH, nord);
		nachbarn.put(Richtungen.EAST, ost);
		nachbarn.put(Richtungen.SOUTH, sued);
		nachbarn.put(Richtungen.WEST, west);
    }

	/**
	 * Liefert den im Norden benachbarten Bereich.
	 * @return Den im Norden benachbarten Bereich.
	 */
	public Bereich getNachbar(Richtungen richtung){
		return nachbarn.get(richtung);
	}

	public String getInfo(){
		StringBuilder sb = new StringBuilder();
		sb.append("Du befindest dich ").append(this.getBeschreibung()).append(".");
		sb.append("\nDu kannst gehen nach:");
		for (Map.Entry<Richtungen, Bereich> paar : nachbarn.entrySet()) {
			if(paar.getValue() != null) {
				sb.append("\n\t").append(paar.getKey().name().toLowerCase());
			}
		}
		// Der fertige String
		String result = sb.toString();
		return result;
	}


}
