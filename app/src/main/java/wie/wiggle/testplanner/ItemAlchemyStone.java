package wie.wiggle.testplanner;

import java.io.Serializable;

/**
 * Created by timox on 05-Feb-18.
 */

public class ItemAlchemyStone implements Serializable {

    String type;
    String name;
    String rarity;
    String icon;
    Object item_effects;

    public ItemAlchemyStone(String type, String name, String rarity, String icon, Object item_effects) {
        this.type = type;
        this.name = name;
        this.rarity = rarity;
        this.icon = icon;
        this.item_effects = item_effects;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Object getItem_effects() {
        return item_effects;
    }

    public void setItem_effects(Object item_effects) {
        this.item_effects = item_effects;
    }
}
