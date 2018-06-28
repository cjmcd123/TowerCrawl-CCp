package CharacterTests;

import Characters.Players.Knight;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Item sword;
    Item shield;

    @Before
    public void Setup(){
        ArrayList<Item> items = new ArrayList<Item>();
        sword = new Item("sword", 5, true);
        shield = new Item("shield", 10, false);
        items.add(sword);
        items.add(shield);
        knight = new Knight("Bob", 20, items, 1);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", knight.getName());
    }

    @Test
    public void hasMaxHp(){
        assertEquals(20, knight.getBase_hp());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(20, knight.getCurrent_hp());
    }

    @Test
    public void setCurrentHp(){
        knight.setCurrent_hp(10);
        assertEquals(10, knight.getCurrent_hp());
    }

    @Test
    public void hasItems(){
        assertEquals(2, knight.getItems().size());
    }

    @Test
    public void addItem(){
        Item helmet = new Item("helmet", 10, false);
        knight.addItems(helmet);
        assertEquals(3, knight.getItems().size());
    }

    @Test
    public void hasLevel(){
        assertEquals(1, knight.getLv());
    }

    @Test
    public void setLevel(){
        knight.setLv(2);
        assertEquals(2, knight.getLv());
    }

    @Test
    public void hasExp(){
        assertEquals(0, knight.getExp());
    }

    @Test
    public void setExp(){
        knight.setExp(1);
        assertEquals(1, knight.getExp());
    }
}
