package nogard;

public class BefehlFactory {
    private static final String[] richtungsListe = {"north", "east", "south", "west"};

    static public Befehl createBefehl(String eingabe) throws BefehlUnbekanntException{
        if (eingabe == null || eingabe.isEmpty()) {
            throw new BefehlUnbekanntException("kein Befehl angegeben");
        }

        eingabe = eingabe.toLowerCase().trim();
        String[] befehl = eingabe.split(" ");

        switch (befehl[0]){
            case "go":
                if (befehl.length != 2) {
                    throw new BefehlUnbekanntException("kein korrekten Befehlszusatz angegeben");
                }
                for (String richtung : richtungsListe) {
                    if (befehl[1].equals(richtung)) {
                        return new Befehl("go", richtung);
                    }
                }
                throw new BefehlUnbekanntException("Unbekannte Richtung: " + befehl[1]);
            case "help":
                return new Befehl("help");
            case "quit":
                return new Befehl("quit");
            default:
                throw new BefehlUnbekanntException("den Befehl gibt es nicht");
        }
    }
}
