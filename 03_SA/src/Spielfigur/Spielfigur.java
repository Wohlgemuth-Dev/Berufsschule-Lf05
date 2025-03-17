package Spielfigur;

import java.util.Map;

public class Spielfigur {
    private IZustand zustand;
    private final Map<Trefferart, Runnable> verletzenFuncMap = Map.of(
            Trefferart.LEICHT, () -> zustand.verletzenLeicht(),
            Trefferart.STARK, () -> zustand.verletzenStark()
    );

    public Spielfigur(){
        zustand = new Gesund(this);
    }

    public IZustand getZustand(){
        return zustand;
    }

    public void setZustand(IZustand zustand){
        this.zustand = zustand;
    }

    public void heilen(){
        zustand.heilen();
    }

    public void verletzen(Trefferart trefferart){
        verletzenFuncMap.get(trefferart).run();
    }
}
