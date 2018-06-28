package ItemTest;

import Items.Item;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ItemTest {

    Item item;

    @Before
    public void setUp(){
        item = new Item("Something", 20, false);
    }

    @Test
    public void hasName() {
        assertEquals("Something", item.getName());
    }

    @Test
    public void hasDamage(){
        assertEquals(20, item.getHp_modifier());
    }

    @Test
    public void hasCause(){
        assertEquals(false, item.isCausesDamage());
    }

}
