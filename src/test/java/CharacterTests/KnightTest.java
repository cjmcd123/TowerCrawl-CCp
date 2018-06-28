package CharacterTests;

import Characters.Players.Knight;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void Setup(){
        ArrayList<String> items = new ArrayList<String>();
        items.add("Longsword");
        items.add("Shield");
        knight = new Knight("Bob", 20, items);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", knight.getName());
    }

    @Test
    public void hasMaxHp(){
        assertEquals(20, knight.getMax_hp());
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
        knight.adItems("Helmet");
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
