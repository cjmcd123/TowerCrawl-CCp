package Characters;

import Behaviours.IModifyHP;
import Items.Item;

import java.util.ArrayList;

public abstract class Sprite implements IModifyHP {

    private String name;
    private int base_hp;
    private int current_hp;
    private ArrayList<Item> items;
    private int lv;
    private int exp;
    private Item currentItem;
    private int dr;
    private int totalHealth;

    public Sprite(String name, int base_hp, ArrayList<Item> items, int lv) {
        this.name = name;
        this.base_hp = base_hp;
        this.lv = lv;
        this.dr = 0;
        this.totalHealth = setHealth();
        this.current_hp = this.totalHealth;
        this.items = items;
        this.exp = 0;
        this.currentItem = null;

    }

    public int setHealth(){
        return (base_hp * lv) + (dr * lv);
    }

    public String getName() {
        return name;
    }

    public int getBase_hp() {
        return base_hp;
    }

    public int getCurrent_hp() {
        return current_hp;
    }

    public void setCurrent_hp(int current_hp) {
        this.current_hp = current_hp;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItems(Item item) {
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

    public Item getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(Item currentItem) {
        this.currentItem = currentItem;
    }

    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }

    public int getTotalHealth() {
        return totalHealth;
    }
}