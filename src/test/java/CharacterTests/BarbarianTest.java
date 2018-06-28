package CharacterTests;

import Characters.Players.Barbarian;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void Setup(){
        ArrayList<String> items = new ArrayList<String>();
        items.add("Axe");
        items.add("Shield");
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
        barbarian.adItems("Helmet");
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
