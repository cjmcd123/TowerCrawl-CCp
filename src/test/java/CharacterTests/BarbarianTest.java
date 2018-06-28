package CharacterTests;

import Characters.Players.Barbarian;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Item axe;
    Item shield;

    @Before
    public void Setup(){
        ArrayList<Item> items = new ArrayList<Item>();
        axe = new Item("axe", 5, true);
        shield = new Item("shield", 10, false);
        items.add(axe);
        items.add(shield);
        barbarian = new Barbarian("Bob", 20, items);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", barbarian.getName());
    }

    @Test
    public void hasMaxHp(){
        assertEquals(20, barbarian.getMax_hp());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(20, barbarian.getCurrent_hp());
    }

    @Test
    public void setCurrentHp(){
        barbarian.setCurrent_hp(10);
        assertEquals(10, barbarian.getCurrent_hp());
    }

    @Test
    public void hasItems(){
        assertEquals(2, barbarian.getItems().size());
    }

    @Test
    public void addItem(){
        Item helmet = new Item("helmet", 10, false);
        barbarian.addItems(helmet);
        assertEquals(3, barbarian.getItems().size());
    }

    @Test
    public void hasLevel(){
        assertEquals(1, barbarian.getLv());
    }

    @Test
    public void setLevel(){
        barbarian.setLv(2);
        assertEquals(2, barbarian.getLv());
    }

    @Test
    public void hasExp(){
        assertEquals(0, barbarian.getExp());
    }

    @Test
    public void setExp(){
        barbarian.setExp(1);
        assertEquals(1, barbarian.getExp());
    }
}
