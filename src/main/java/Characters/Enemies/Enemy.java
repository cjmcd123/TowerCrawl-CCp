package Characters.Enemies;

import Behaviours.IAttack;
import Characters.Sprite;
import Items.Item;

import java.util.ArrayList;

public abstract class Enemy extends Sprite implements IAttack {

    private int exp;
    private int lv;

    public Enemy(String name, int max_hp, ArrayList<Item> items, int lv) {
        super(name, max_hp, items, lv);
        this.lv = lv;
        this.exp = lv * 100;
    }

    @Override
    public int getExp() {
        return exp;
    }

    @Override
    public int getLv() {
        return lv;
    }
}
