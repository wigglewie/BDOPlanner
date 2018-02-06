package wie.wiggle.testplanner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by timox on 05-Feb-18.
 */

public class AlchemyStone implements Serializable {

    String type;
    String name;
    String rarity;
    int icon;
    Object stats;

    public AlchemyStone(String type, String name, String rarity, int icon, Object stats) {
        this.type = type;
        this.name = name;
        this.rarity = rarity;
        this.icon = icon;
        this.stats = stats;
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

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public Object getStats() {
        return stats;
    }

    public void setStats(Object stats) {
        this.stats = stats;
    }
}
