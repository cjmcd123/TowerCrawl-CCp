package CharacterTests;

import Characters.Players.Mage;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MageTest {

    Mage mage;

    @Before
    public void Setup(){
        ArrayList<String> items = new ArrayList<String>();
        items.add("Fireball");
        items.add("Frost bite");
        mage = new Mage("Bob", 20, 20, items);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", mage.getName());
    }

    @Test
    public void hasMaxHp(){
        assertEquals(20, mage.getMax_hp());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(20, mage.getCurrent_hp());
    }

    @Test
    public void setCurrentHp(){
        mage.setCurrent_hp(10);
        assertEquals(10, mage.getCurrent_hp());
    }

    @Test
    public void hasItems(){
        assertEquals(2, mage.getItems().size());
    }

    @Test
    public void addItem(){
        mage.adItems("Helmet");
        assertEquals(3, mage.getItems().size());
    }

    @Test
    public void hasLevel(){
        assertEquals(1, mage.getLv());
    }

    @Test
    public void setLevel(){
        mage.setLv(2);
        assertEquals(2, mage.getLv());
    }

    @Test
    public void hasExp(){
        assertEquals(0, mage.getExp());
    }

    @Test
    public void setExp(){
        mage.setExp(1);
        assertEquals(1, mage.getExp());
    }

    @Test
    public void hasMaxMp(){
        assertEquals(20, mage.getMax_mp());
    }

    @Test
    public void hasCurrentMp(){
        assertEquals(20, mage.getCurrent_mp());
    }

    @Test
    public void setCurrentMp(){
        mage.setCurrent_mp(10);
        assertEquals(10, mage.getCurrent_mp());
    }
}
