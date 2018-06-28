package Characters.Players;

import Behaviours.IAttack;
import Behaviours.IModifyHP;
import Items.Item;

import java.util.ArrayList;
import java.util.Random;

public class Mage extends Players implements IAttack {

    private int max_mp;
    private int current_mp;

    public Mage(String name, int max_hp, int max_mp, ArrayList<Item> items, int lv) {
        super(name, max_hp, items, lv);
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

    public void attack(IModifyHP victim) {
        Item current = getCurrentItem();
        int value = current.getHp_modifier();
        Random roll = new Random();
        int rollValue = roll.nextInt(value) + 1;
        int damageValue = rollValue * this.getLv();
        victim.damage(damageValue);
    }

    public void damage(int damage_value) {
        int totalHealth = (getCurrent_hp() * getLv()) + (getDr() * getLv());
        int damaged = totalHealth - damage_value;
        this.setCurrent_hp(damaged);
    }
}
