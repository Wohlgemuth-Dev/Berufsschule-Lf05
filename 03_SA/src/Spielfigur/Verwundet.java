package Spielfigur;

public class Verwundet implements IZustand{
    private Spielfigur spielfigur;

    public Verwundet(Spielfigur spielfigur) {
        this.spielfigur = spielfigur;
    }

    @Override
    public void heilen() {
        spielfigur.setZustand(new Gesund(spielfigur));
    }

    @Override
    public void verletzenLeicht() {
        spielfigur.setZustand(new Bewungsunfähig(spielfigur));
    }

    @Override
    public void verletzenStark() {
        spielfigur.setZustand(new Bewungsunfähig(spielfigur));
    }
}
