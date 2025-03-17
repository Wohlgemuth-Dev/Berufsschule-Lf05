package nogard;

public class CommandTake implements ICommand {
    private Spieler spieler;
    private String gegenstandName;

    public CommandTake(Spieler spieler, String gegenstandName) {
        this.spieler = spieler;
        this.gegenstandName = gegenstandName;
    }

    @Override
    public void execute() {
        spieler.aufnehmenGegenstand(gegenstandName);
    }
}
