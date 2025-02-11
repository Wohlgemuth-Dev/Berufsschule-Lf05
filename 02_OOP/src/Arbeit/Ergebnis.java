package Arbeit;

public class Ergebnis {
    private int trefferTeam1;
    private int trefferTeam2;
    public Ergebnis() {
        trefferTeam1 = 0;
        trefferTeam2 = 0;
    }

    public int getTrefferTeam1() {
        return trefferTeam1;
    }
    public int getTrefferTeam2() {
        return trefferTeam2;
    }
    public void addTrefferTeam1(){
        trefferTeam1++;
    }
    public void addTrefferTeam2(){
        trefferTeam2++;
    }
    @Override
    public String toString() {
        return "Ergebnis {" + "Team1: " +
                trefferTeam1 + ", Team2: " +
                trefferTeam2 + "}";
    }
}
