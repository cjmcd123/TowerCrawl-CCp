package Characters.Players;
import Behaviours.IModifyHP;
import Characters.Sprite;
import Items.Item;

import java.util.ArrayList;

public abstract class Players extends Sprite {

    public Players(String name, int max_hp, ArrayList<Item> items, int lv) {
        super(name, max_hp, items, lv);
    }

    public abstract int attack(IModifyHP victim);
}
