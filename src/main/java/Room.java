import Characters.Enemies.Enemy;
import Items.Loot;

import java.util.ArrayList;

public class Room {
    private ArrayList<Enemy> enemies;
    private ArrayList<Loot> loot;
    private Party party;

    public Room(ArrayList<Enemy> enemies, ArrayList<Loot> loot, Party party) {
        this.enemies = enemies;
        this.loot = loot;
        this.party = party;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public ArrayList<Loot> getLoot() {
        return loot;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public void addAllLoot(){
        this.party.addAllLoot(this.loot);
        this.loot.clear();
    }


}
