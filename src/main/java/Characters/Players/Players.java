package Characters.Players;
import Characters.Sprite;
import Items.Item;

import java.util.ArrayList;

public abstract class Players extends Sprite {

    public Players(String name, int max_hp, ArrayList<Item> items) {
        super(name, max_hp, items);
    }
}
