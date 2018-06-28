package Items;

public abstract class Item {
    private String name;
    private int hp_modifier;
    private boolean causesDamage;

    public Item(String name, int hp_modifier, boolean causesDamage) {
        this.name = name;
        this.hp_modifier = hp_modifier;
        this.causesDamage = causesDamage;
    }

    public String getName() {
        return name;
    }

    public int getHp_modifier() {
        return hp_modifier;
    }

    public boolean isCausesDamage() {
        return causesDamage;
    }
}
