package Characters.Players;
import Characters.Character;

import java.util.ArrayList;

public abstract class Players extends Character{

    public Players(String name, int max_hp, ArrayList<String> items) {
        super(name, max_hp, items);
    }
}
