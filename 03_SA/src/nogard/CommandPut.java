package nogard;

public class CommandPut implements ICommand {
    private Spieler spieler;
    private String gegenstandName;
    public CommandPut(Spieler spieler, String gegenstandName) {
        this.spieler = spieler;
        this.gegenstandName = gegenstandName;
    }

    @Override
    public void execute() {
        spieler.ablegenGegenstand(gegenstandName);
    }
}
