package net.skyblock.item.abilities;

import java.util.List;

public abstract class Ability {
    public String name;
    public boolean fullSetBonus = false;

    public Ability(String name) {
        this.name = name;
    }
    public Ability(String name, boolean fullSetBonus) {
        this.name = name;
        this.fullSetBonus = fullSetBonus;
    }
    public abstract List<Object> getLoreArgs(int i);
    public String getLoreKey () {
        return "lore.skyblock.ability." + name;
    }
}
