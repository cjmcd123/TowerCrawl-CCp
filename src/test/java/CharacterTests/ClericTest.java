package CharacterTests;

import Characters.Players.Cleric;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric;
    Item sword;
    Item shield;
    Item potion;

    @Before
    public void Setup(){
        ArrayList<Item> items = new ArrayList<Item>();
        sword = new Item("sword", 5, true);
        shield = new Item("shield", 10, false);
        items.add(sword);
        items.add(shield);
        ArrayList<Item> healItems = new ArrayList<Item>();
        potion = new Item("Small Potion of Healing", 20, false);
        healItems.add(potion);
        cleric = new Cleric("Bob", 20, items, healItems);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", cleric.getName());
    }

    @Test
    public void hasMaxHp(){
        assertEquals(20, cleric.getMax_hp());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(20, cleric.getCurrent_hp());
    }

    @Test
    public void setCurrentHp(){
        cleric.setCurrent_hp(10);
        assertEquals(10, cleric.getCurrent_hp());
    }

    @Test
    public void hasItems(){
        assertEquals(2, cleric.getItems().size());
    }

    @Test
    public void addItem(){
        Item helmet = new Item("helmet", 10, false);
        cleric.addItems(helmet);
        assertEquals(3, cleric.getItems().size());
    }

    @Test
    public void hasLevel(){
        assertEquals(1, cleric.getLv());
    }

    @Test
    public void setLevel(){
        cleric.setLv(2);
        assertEquals(2, cleric.getLv());
    }

    @Test
    public void hasExp(){
        assertEquals(0, cleric.getExp());
    }

    @Test
    public void setExp(){
        cleric.setExp(1);
        assertEquals(1, cleric.getExp());
    }

    @Test
    public void hasHealItems(){
        assertEquals(1, cleric.getHealItems().size());
    }

    @Test
    public void addHealItems(){
        Item potion = new Item("Potion of True Heal", 20, false);
        cleric.addHealItems(potion);
        assertEquals(2, cleric.getHealItems().size());
    }
}
