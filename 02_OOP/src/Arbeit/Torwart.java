package Arbeit;

public class Torwart extends Spieler{
    private int reaktion;
    public Torwart(String name, int alter, int staerke, int motivation, int reaktion) {
        super(name, alter, staerke, 0, motivation, 0);
        this.reaktion = reaktion;
    }
    public int getReaktion() {
        return reaktion;
    }
    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }
    @Override
    public String toString() {
        String text = getPersonToString();
        text = text + "\n\t" + "  Stärke " + getStaerke();
        text = text + "\n\t" + "  Motivation: " + getMotivation();
        text = text + "\n\t" + "  Reaktion: " + reaktion;
        return text;    }
}
