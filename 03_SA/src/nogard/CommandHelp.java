package nogard;

public class CommandHelp implements ICommand {

    @Override
    public void execute() {
        System.out.println("Du irrst in Nogard herum.");
        System.out.println("Dir stehen folgende Befehle zur Verf�gung:");
        System.out.println("\tgo");
        System.out.println("\tquit");
        System.out.println("\thelp");
    }
}
