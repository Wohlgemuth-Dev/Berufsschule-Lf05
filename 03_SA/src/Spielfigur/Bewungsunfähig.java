package Spielfigur;

public class Bewungsunfähig implements IZustand{
    private Spielfigur spielfigur;

    Bewungsunfähig(Spielfigur spielfigur){
        this.spielfigur = spielfigur;
    }

    @Override
    public void heilen() {
        spielfigur.setZustand(new Verwundet(spielfigur));
    }

    @Override
    public void verletzenLeicht() {
        return;
    }

    @Override
    public void verletzenStark() {
        return;
    }

}
