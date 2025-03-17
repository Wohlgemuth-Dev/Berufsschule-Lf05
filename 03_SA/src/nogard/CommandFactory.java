package nogard;

public class CommandFactory {
    public static ICommand createCommand(String wort, Spieler spieler) throws BefehlUnbekanntException {
        return switch (wort) {
            /*case "eat" -> createCommandEat();
            case "go" -> createCommandGo();
            case "help" -> createCommandHelp();
            case "info" -> createCommandInfo(spieler);
            case "put" -> createCommandPut();
            case "quit" -> createCommandQuit();
            case "take" -> createCommandTake();*/
            case "help" -> new CommandHelp();
            default -> throw new BefehlUnbekanntException("Der Command: " + wort + " existiert nicht.");
        };
    }
    /*private static ICommand createCommandEat(){
        return new CommandEat();
    }
    private static ICommand createCommandGo(){
        return new CommandGo();
    }
    private static ICommand createCommandHelp(){
        return new CommandHelp();
    }
    private static ICommand createCommandInfo(Spieler spieler){
        return new CommandInfo(spieler);
    }
    private static ICommand createCommandPut(){
        return new CommandPut();
    }
    private static ICommand createCommandQuit(){
        return new CommandQuit();
    }
    private static ICommand createCommandTake(){
        return new CommandTake();
    }*/
}
