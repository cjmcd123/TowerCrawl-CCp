package Characters.Players;
import Behaviours.IAttack;
import Behaviours.IModifyHP;
import Items.Item;

import java.util.ArrayList;
import java.util.Random;

public class Barbarian extends Players implements IAttack {

    public Barbarian(String name, int max_hp, ArrayList<Item> items, int lv) {
        super(name, max_hp, items, lv);
    }

    public int attack(IModifyHP victim) {
        Item current = getCurrentItem();
        int value = current.getHp_modifier();
        Random roll = new Random();
        int rollValue = roll.nextInt(value) + 1;
        int damageValue = rollValue * this.getLv();
        int newHealth = victim.damage(damageValue);
        return newHealth;
    }

    public int rage(IModifyHP victim){
        this.attack(victim);
        this.attack(victim);
        return this.getCurrent_hp();
    }

    public int damage(int damage_value) {
        int totalHealth = (getCurrent_hp() * getLv()) + (getDr() * getLv());
        int damaged = totalHealth - damage_value;
        this.setCurrent_hp(damaged);
        return getCurrent_hp();
    }
}
