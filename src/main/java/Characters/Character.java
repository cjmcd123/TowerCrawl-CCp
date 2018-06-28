package Characters;

import java.util.ArrayList;

public abstract class Character {

    private String name;
    private int max_hp;
    private int current_hp;
    private ArrayList<String> items;
    private int lv;
    private int exp;

    public Character(String name, int max_hp, ArrayList<String> items) {
        this.name = name;
        this.max_hp = max_hp;
        this.current_hp = max_hp;
        this.items = items;
        this.lv = 1;
        this.exp = 0;
    }

    public String getName() {
        return name;
    }

    public int getMax_hp() {
        return max_hp;
    }

    public int getCurrent_hp() {
        return current_hp;
    }

    public void setCurrent_hp(int current_hp) {
        this.current_hp = current_hp;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void adItems(String item) {
        this.items.add(item);
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}