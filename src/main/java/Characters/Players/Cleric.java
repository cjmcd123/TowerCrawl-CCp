package Characters.Players;

import Behaviours.IHeal;
import Behaviours.IModifyHP;
import Items.Item;

import java.util.ArrayList;
import java.util.Random;

public class Cleric extends Players implements IHeal {

    private ArrayList<Item > healItems;

    public Cleric(String name, int max_hp, ArrayList<Item> items, int lv) {
        super(name, max_hp, items, lv);
    }

    public int heal(IModifyHP victim) {
            Item current = getCurrentItem();
            int value = current.getHp_modifier();
            Random roll = new Random();
            int rollValue = roll.nextInt(value) + 1;
            int damageValue = (rollValue *-1) * this.getLv();
            int newHealth = victim.damage(damageValue);
            return newHealth;
    }

    public int attack(IModifyHP victim) {
        return 0;
    }

    public int damage(int damage_value) {
        int totalHealth = (getCurrent_hp() * getLv()) + (getDr() * getLv());
        int damaged = totalHealth - damage_value;
        this.setCurrent_hp(damaged);
        return getCurrent_hp();
    }
}
