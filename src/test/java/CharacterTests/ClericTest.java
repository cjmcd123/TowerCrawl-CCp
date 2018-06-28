package CharacterTests;

import Characters.Players.Cleric;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void Setup(){
        ArrayList<String> items = new ArrayList<String>();
        items.add("Sword");
        items.add("Shield");
        ArrayList<String> healItems = new ArrayList<String>();
        healItems.add("Small Potion of Healing");
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
        cleric.adItems("Helmet");
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
        cleric.addHealItems("Potion of True Heal");
        assertEquals(2, cleric.getHealItems().size());
    }
}
