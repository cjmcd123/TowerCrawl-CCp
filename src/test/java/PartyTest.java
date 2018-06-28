import Characters.Sprite;
import Characters.Players.*;
import Items.Loot;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class PartyTest {
    Loot loot1, loot2;
    Party party;
    Mage mage;
    Knight knight;
    Cleric cleric;
    Barbarian barbarian;


    @Before
    public void setUp() throws Exception {
        ArrayList<Sprite> team = new ArrayList<Sprite>();
        team.add(mage);
        team.add(knight);
        team.add(cleric);
        team.add(barbarian);
        loot1 = new Loot("coin", 1);
        loot2 = new Loot("Gold", 10);
        party = new Party(team);
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
}
