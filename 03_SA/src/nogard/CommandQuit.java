package nogard;

public class CommandQuit implements ICommand {
    @Override
    public void execute() {
        // Endbildschirm ausgeben.
        System.out.println("Danke f�r dieses Spiel. Auf Wiedersehen.");
    }
}
