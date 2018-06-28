package Characters.Players;

import Behaviours.IAttack;
import Behaviours.IModifyHP;
import Items.Item;

import java.util.ArrayList;

public class Knight extends Players implements IAttack {

    public Knight(String name, int max_hp, ArrayList<Item> items) {
        super(name, max_hp, items);
    }

    public void attack(IModifyHP victim) {

    }
}
