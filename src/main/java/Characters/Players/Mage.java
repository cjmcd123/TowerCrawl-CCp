package Characters.Players;

import java.util.ArrayList;

public class Mage extends Players {

    private int max_mp;
    private int current_mp;

    public Mage(String name, int max_hp, int max_mp, ArrayList<String> items) {
        super(name, max_hp, items);
        this.max_mp = max_mp;
        this.current_mp = max_mp;
    }

    public int getMax_mp() {
        return max_mp;
    }

    public int getCurrent_mp() {
        return current_mp;
    }

    public void setCurrent_mp(int current_mp) {
        this.current_mp = current_mp;
    }
}
