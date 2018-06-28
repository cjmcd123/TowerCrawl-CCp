package Characters.Players;

import java.util.ArrayList;

public class Cleric extends Players {

    private ArrayList<String > healItems;

    public Cleric(String name, int max_hp, ArrayList<String> items, ArrayList<String > healItems) {
        super(name, max_hp, items);
        this.healItems = healItems;
    }

    public ArrayList<String> getHealItems() {
        return healItems;
    }

    public void addHealItems(String healItem) {
        this.healItems.add(healItem);
    }
}
