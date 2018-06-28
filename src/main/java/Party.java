import Behaviours.IModifyHP;
import Characters.Sprite;
import Items.Loot;

import java.util.ArrayList;

public class Party {
    private ArrayList<Loot> loot;
    private ArrayList<Sprite> adventurers;

    public Party(ArrayList<Sprite> adventurers) {
        this.adventurers = adventurers;
        this.loot = new ArrayList<Loot>();
    }

    public ArrayList<Loot> getLoot() {
        return loot;
    }

    public ArrayList<Sprite> getAdventurers() {
        return adventurers;
    }

    public void addLoot(Loot loot) {
        this.loot.add(loot);
    }

    public void addAllLoot(ArrayList<Loot> loot){
        this.loot.addAll(loot);
    }

    public void removeLoot(Loot loot) {
        this.loot.remove(loot);
    }

    public int lootCount() {
      return  this.loot.size();
    }

    public void death(Sprite victim){
        adventurers.remove(victim);
    }


}
