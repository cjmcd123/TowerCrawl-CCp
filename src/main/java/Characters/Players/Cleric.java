package Characters.Players;

import Items.Item;

import java.util.ArrayList;

public class Cleric extends Players {

    private ArrayList<Item > healItems;

    public Cleric(String name, int max_hp, ArrayList<Item> items, ArrayList<Item > healItems) {
        super(name, max_hp, items);
        this.healItems = healItems;
    }

    public ArrayList<Item> getHealItems() {
        return healItems;
    }

    public void addHealItems(Item healItem) {
        this.healItems.add(healItem);
    }
}
