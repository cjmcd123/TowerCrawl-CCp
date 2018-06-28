import Characters.Enemies.Enemy;
import Characters.Enemies.Orc;
import Characters.Players.Barbarian;
import Characters.Players.Cleric;
import Characters.Players.Knight;
import Characters.Players.Mage;
import Characters.Sprite;
import Items.Item;
import Items.Loot;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

public class RoomTest {
    Party party;
    Loot loot1, loot2;
    Mage mage;
    Knight knight;
    Cleric cleric;
    Barbarian barbarian;
    Orc orc;
    Item sword;
    Item fireball;
    Item potion;
    Item axe;
    Room room;
    ArrayList<Enemy> enemies;
    ArrayList<Loot> loot;


    @Before
    public void setUp() throws Exception {
        sword = new Item("Sword", 10, true);
        fireball = new Item("fireball", 20, true);
        potion = new Item("potion", 10, false);
        axe = new Item("axe", 12, true);

        ArrayList<Item> list1 = new ArrayList<Item>();
        list1.add(axe);

        ArrayList<Item> list2 = new ArrayList<Item>();
        list2.add(fireball);

        ArrayList<Item> list3 = new ArrayList<Item>();
        list3.add(sword);

        ArrayList<Item> list4 = new ArrayList<Item>();
        list4.add(potion);

        ArrayList<Item> orcList = new ArrayList<Item>();
        orcList.add(axe);

        ArrayList<Sprite> team = new ArrayList<Sprite>();
        barbarian = new Barbarian("Steve", 12, list1, 1);
        barbarian.setCurrentItem(axe);
        mage = new Mage("Jenny", 10, 20, list2, 1);
        mage.setCurrentItem(fireball);
        knight = new Knight("Jack", 15, list3, 1);
        knight.setCurrentItem(sword);
        cleric = new Cleric("Ani", 8, list4,1);
        cleric.setCurrentItem(potion);
        team.add(mage);
        team.add(knight);
        team.add(cleric);
        team.add(barbarian);
        loot1 = new Loot("coin", 1);
        loot2 = new Loot("Gold", 10);
        loot = new ArrayList<Loot>();
        loot.add(loot1);
        loot.add(loot2);
        party = new Party(team);
        orc = new Orc("Bob", 24, orcList, 10);
        orc.setCurrentItem(axe);
        enemies = new ArrayList<Enemy>();
        enemies.add(orc);
        room = new Room(enemies, loot, party);
    }

    @Test
    public void roomHasEnemies() {
        assertEquals(1, room.getEnemies().size());
    }

    @Test
    public void roomHasLoot() {
        assertEquals(2, room.getLoot().size());
    }

    @Test
    public void roomHasParty() {
        assertNotNull(room.getParty());
    }

    @Test
    public void canLootAll() {
        room.addAllLoot();
        assertEquals(0, room.getLoot().size());
        assertEquals(2, party.lootCount());
    }
}
