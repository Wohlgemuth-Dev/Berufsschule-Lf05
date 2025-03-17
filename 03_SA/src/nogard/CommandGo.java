package nogard;

public class CommandGo implements ICommand {
    private Spieler spieler;
    Richtungen richtung;

    public CommandGo(Spieler spieler, Richtungen richtung) {
        this.spieler = spieler;
        this.richtung = richtung;
    }

    @Override
    public void execute() {
        Bereich neuerBereich = spieler.getBereich().getNachbar(richtung);
        // Auswertung der gefundenen Bereichs.
        if (neuerBereich == null) {
            System.out.println("Dort geht es nicht weiter.");
        }
        else {
            spieler.geheInBereich(neuerBereich);
            System.out.println(spieler.getBereich().getInfo());
        }
    }
}
