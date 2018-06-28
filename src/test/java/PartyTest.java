import Characters.Enemies.Orc;
import Characters.Sprite;
import Characters.Players.*;
import Items.Item;
import Items.Loot;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class PartyTest {
    Loot loot1, loot2;
    Party party;
    Mage mage;
    Knight knight;
    Cleric cleric;
    Barbarian barbarian;
    Orc orc;
    Item sword;
    Item fireball;
    Item potion;
    Item axe;


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
        party = new Party(team);
        orc = new Orc("Bob", 24, orcList, 10);
        orc.setCurrentItem(axe);
    }

    @Test
    public void addLootCheck() {
        party.addLoot(loot1);
        assertEquals(1, party.lootCount());

    }

    @Test
    public void getLootCheck() {
        party.addLoot(loot1);
        assertEquals("coin", party.getLoot().get(0).getName());
    }

    @Test
    public void removeLootCheck() {
        party.addLoot(loot1);
        party.removeLoot(loot1);
        assertEquals(0, party.lootCount());
    }

    @Test
    public void attack(){
        knight.attack(orc);
        assertNotEquals(orc.getTotalHealth(), orc.getCurrent_hp());
    }

    @Test
    public void rage() {
        barbarian.rage(orc);
        assertNotEquals(orc.getTotalHealth(), orc.getCurrent_hp());
    }

    @Test
    public void changeDamageMethodTest() {
        knight.changeDamageMethod(axe);
        assertSame(axe, knight.getCurrentItem());
    }

    @Test
    public void healTest() {
        orc.attack(barbarian);
        int current_barbhp = barbarian.getCurrent_hp();
        cleric.heal(barbarian);
        assertNotEquals(current_barbhp, barbarian.getCurrent_hp());
    }
}
