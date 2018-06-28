package Characters.Players;
import Characters.Character;
import Items.Item;

import java.util.ArrayList;

public abstract class Players extends Character{

    public Players(String name, int max_hp, ArrayList<Item> items) {
        super(name, max_hp, items);
    }
}
