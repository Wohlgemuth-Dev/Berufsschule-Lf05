package Spielfigur;

public class Gesund implements IZustand{
    private Spielfigur spielfigur;

    public Gesund(Spielfigur spielfigur) {
        this.spielfigur = spielfigur;
    }

    @Override
    public void heilen() {
        return;
    }

    @Override
    public void verletzenLeicht() {
        spielfigur.setZustand(new Verwundet(spielfigur));
    }

    @Override
    public void verletzenStark() {
        spielfigur.setZustand(new Bewungsunfähig(spielfigur));
    }

}
