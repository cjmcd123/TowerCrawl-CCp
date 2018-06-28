package EnemyTest;

import Characters.Enemies.Orc;
import Items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void setUp(){
        orc = new Orc("Orc Warrior", 50, new ArrayList<Item>(), 3);
    }

    @Test
    public void hasName(){
        assertEquals("Orc Warrior", orc.getName());
    }

    @Test
    public void hasMaxHp(){
        assertEquals(50, orc.getBase_hp());
    }

    @Test
    public void hasCurrentHp(){
        assertEquals(150, orc.getCurrent_hp());
    }

    @Test
    public void setCurrentHp(){
        orc.setCurrent_hp(30);
        assertEquals(30, orc.getCurrent_hp());
    }

    @Test
    public void hasEmptyItems(){
        assertEquals(0, orc.getItems().size());
    }

    @Test
    public void hasLv(){
        assertEquals(3, orc.getLv());
    }

    @Test
    public void hasExp(){
        assertEquals(300, orc.getExp());
    }

}
