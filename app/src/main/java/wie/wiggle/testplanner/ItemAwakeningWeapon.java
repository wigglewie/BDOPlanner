package wie.wiggle.testplanner;

import java.io.Serializable;

/**
 * Created by timox on 09-Feb-18.
 */

public class ItemAwakeningWeapon implements Serializable {

    String className;
    String name;
    String type;
    String rarity;
    int icon;
    int ap1;
    int ap2;
    int enhLVL;
    Object stats;

    public ItemAwakeningWeapon(String className, String name, String type, String rarity, int icon, int ap1, int ap2, int enhLVL, Object stats) {
        this.className = className;
        this.name = name;
        this.type = type;
        this.rarity = rarity;
        this.icon = icon;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.enhLVL = enhLVL;
        this.stats = stats;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public int getAp1() {
        return ap1;
    }

    public void setAp1(int ap1) {
        this.ap1 = ap1;
    }

    public int getAp2() {
        return ap2;
    }

    public void setAp2(int ap2) {
        this.ap2 = ap2;
    }

    public int getEnhLVL() {
        return enhLVL;
    }

    public void setEnhLVL(int enhLVL) {
        this.enhLVL = enhLVL;
    }

    public Object getStats() {
        return stats;
    }

    public void setStats(Object stats) {
        this.stats = stats;
    }
}
