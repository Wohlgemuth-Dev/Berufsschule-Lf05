package Spielfigur;

public class Spiel {
    public static void main(String[] args) {
        Spielfigur spielfigur = new Spielfigur();
        System.out.println(spielfigur.getZustand().getClass().getSimpleName());
        spielfigur.verletzen(Trefferart.LEICHT);
        System.out.println(spielfigur.getZustand().getClass().getSimpleName());
        spielfigur.heilen();
        System.out.println(spielfigur.getZustand().getClass().getSimpleName());
        spielfigur.verletzen(Trefferart.STARK);
        System.out.println(spielfigur.getZustand().getClass().getSimpleName());
    }
}
