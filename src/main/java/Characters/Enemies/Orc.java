package Characters.Enemies;

import Behaviours.IModifyHP;
import Items.Item;

import java.util.ArrayList;
import java.util.Random;

public class Orc extends Enemy {

    public Orc(String name, int max_hp, ArrayList<Item> items, int lv) {
        super(name, max_hp, items, lv);
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
