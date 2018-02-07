package wie.wiggle.testplanner;

import java.io.Serializable;

/**
 * Created by timox on 06-Feb-18.
 */

public class StatsAlchemyProtection implements Serializable {

    // index:
    // 0 - alchemy stone
    // 1 - awakening weapon
    // 2 - main weapon
    // 3 - belt
    // 4 - shoes
    // 5 - earring2
    // 6 - earring1
    // 7 - helmet
    // 8 - chest (armor)
    // 9 - ring1
    // 10 - ring2
    // 11 - gloves
    // 12 - necklace
    // 13 - secondary weapon
    // 14 - secondary weapon costume
    // 15 - underwear
    // 16 - awakening weapon costume
    // 17 - main weapon costume
    // 18 - costume

    String rarity;
    String name;
    int damageReduction;
    int evasion;
    int maxHP;
    int resistanceAll;

    public StatsAlchemyProtection(String rarity, String name, int damageReduction, int evasion, int maxHP, int resistanceAll) {
        this.rarity = rarity;
        this.name = name;
        this.damageReduction = damageReduction;
        this.evasion = evasion;
        this.maxHP = maxHP;
        this.resistanceAll = resistanceAll;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(int damageReduction) {
        this.damageReduction = damageReduction;
    }

    public int getEvasion() {
        return evasion;
    }

    public void setEvasion(int evasion) {
        this.evasion = evasion;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getResistanceAll() {
        return resistanceAll;
    }

    public void setResistanceAll(int resistanceAll) {
        this.resistanceAll = resistanceAll;
    }
}
