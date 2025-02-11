package nogard;

import java.util.Scanner;

/**
 *  Dies ist die Hauptklasse der Anwendung "Die Welt von Nogard".
 *  "Die Welt von Nogard" ist ein sehr einfaches, textbasiertes Adventure-Game, in dem sich ein Spieler durch Nogard bewegen kann.
 *  Das Spiel sollte auf jeden Fall ausgebaut werden, damit es interessanter wird!
 *  Zum Spielen muss an einer Instanz dieser Klasse die Methode "spielen()" aufgerufen werden.
 *  Diese Klasse erzeugt und initialisiert alle Objekte der Anwendung: 
 *  - Sie legt alle Bereiche an. Anschlie�end startet das Spiel. 
 *  - Sie wertet die Befehle aus und sorgt f�r ihre Ausf�hrung.
 */
public class Spiel {
	private Bereich aktiverBereich;

	public Spiel(){
		erzeugeDorf();
	}

	private void erzeugeDorf() {
		// Die Bereiche erzeugen.
		Bereich friedhof = new Bereich("auf einem Friedhof, umgeben von dunklen Tannen");
		Bereich wald = new Bereich("im dunklen Stadtwald von Nogard");
		Bereich taverne = new Bereich("in der Taverne, mit zwielichtigen Gestalten an der Theke");
		Bereich hexenhaus = new Bereich("im finsteren Hexenhaus");
		Bereich rathaus = new Bereich("im Rathaus von Nogard");

		// Die Nachbarschaften festlegen.
		friedhof.setNachbarn(null, null, hexenhaus, null);
		wald.setNachbarn(hexenhaus, taverne, null, null);
		taverne.setNachbarn(rathaus, null, null, wald);
		hexenhaus.setNachbarn(friedhof, rathaus, wald, null);
		rathaus.setNachbarn(null, null, taverne, hexenhaus);

		// Das Spielt startet im Wald.
		aktiverBereich = wald;
	}

	/**
     * Die Hauptmethode zum Spielen. 
     * L�uft bis zum Ende des Spiels in einer Schleife.
     */
    public void spielen() {

		ausgebenStartText();

		// Befehle einlesen und auswerten.
        Scanner scannerZeile = new Scanner(System.in);
        boolean end = false;
        while (! end) {
            // Eingabeaufforderung anzeigen.
            System.out.print("> ");
            // Befehlszeile lesen.
            String input = scannerZeile.nextLine();
            // Befehl interpretieren.
			try {
				Befehl befehl = BefehlFactory.createBefehl(input);
				end = ausfuehrenBefehl(befehl);
			} catch (BefehlUnbekanntException e) {
				System.out.println(e.getMessage());
			}
		}

		ausgebenEndText();
	}

	private boolean ausfuehrenBefehl(Befehl befehl) {
		boolean end = false;
		// Auswerten des Befehls.
		String befehlWort = befehl.getBefehlswort();
		switch (befehlWort) {
			case "go":
				wechselBereich(befehl.getBefehlszusatz());
				break;
			case "help":
				ausgebenHilfeText();
				break;
			case "quit":
				end = true;
				break;
			default:
				ausgebenFehlerBefehl();

		}
		return end;
	}

	private void wechselBereich(String richtung) {
		Bereich neuerBereich = switch (richtung) {
            case "north" -> aktiverBereich.getNachbar(Richtungen.NORTH);
            case "east" -> aktiverBereich.getNachbar(Richtungen.EAST);
            case "south" -> aktiverBereich.getNachbar (Richtungen.SOUTH);
            case "west" -> aktiverBereich.getNachbar(Richtungen.WEST);
            default -> null;
        };
        // Auswertung der gefundenen Bereichs.
		if (neuerBereich == null) {
			System.out.println("Dort geht es nicht weiter.");
		}
		else {
			aktiverBereich = neuerBereich;
			System.out.println(aktiverBereich.getInfo());
		}

	}

	private static void ausgebenHilfeText() {
		System.out.println("Du irrst in Nogard herum.");
		System.out.println("Dir stehen folgende Befehle zur Verf�gung:");
		System.out.println("\tgo");
		System.out.println("\tquit");
		System.out.println("\thelp");
	}

	private static void ausgebenEndText() {
		// Endbildschirm ausgeben.
		System.out.println("Danke f�r dieses Spiel. Auf Wiedersehen.");
	}

	private void ausgebenStartText() {
		// Begr��ungsbildschirm ausgeben.
		System.out.println("Willkommen in Nogard!");
		System.out.println("Entdecke die Welt von Nogard. Doch Vorsicht, �berall lauern Gefahren!");
		System.out.println("Wenn du Hilfe ben�tigst, tippe 'help'.");
		System.out.println();
		System.out.println(aktiverBereich.getInfo());
	}

	private static void ausgebenFehlerBefehl() {
		System.out.println("Ich wei� nicht, was Du meinst ...");
	}
}