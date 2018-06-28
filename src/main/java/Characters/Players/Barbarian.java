package Characters.Players;
import Behaviours.IAttack;
import Behaviours.IModifyHP;
import Items.Item;

import java.util.ArrayList;

public class Barbarian extends Players implements IAttack {

    public Barbarian(String name, int max_hp, ArrayList<Item> items) {
        super(name, max_hp, items);
    }

    public void attack(IModifyHP victim) {

    }
}
