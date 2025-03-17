package nogard;

public class CommandEat implements ICommand {
    private Spieler spieler;
    private String nahrungName;
    public CommandEat(Spieler spieler, String nahrungName) {
        this.spieler = spieler;
        this.nahrungName = nahrungName;
    }

    @Override
    public void execute() {
        spieler.essen(nahrungName);
    }
}
