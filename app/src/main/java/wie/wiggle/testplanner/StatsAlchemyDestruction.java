package wie.wiggle.testplanner;

import java.io.Serializable;

/**
 * Created by timox on 06-Feb-18.
 */

public class StatsAlchemyDestruction implements Serializable {

    String rarity;
    String name;
    int hiddenAP;
    int accuracy;
    int ignoreAllResistance;
    int attackSpeed;
    int castingSpeed;

    public StatsAlchemyDestruction(String rarity, String name, int hiddenAP, int accuracy, int ignoreAllResistance, int attackSpeed, int castingSpeed) {
        this.rarity = rarity;
        this.name = name;
        this.hiddenAP = hiddenAP;
        this.accuracy = accuracy;
        this.ignoreAllResistance = ignoreAllResistance;
        this.attackSpeed = attackSpeed;
        this.castingSpeed = castingSpeed;
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

    public int getHiddenAP() {
        return hiddenAP;
    }

    public void setHiddenAP(int hiddenAP) {
        this.hiddenAP = hiddenAP;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getIgnoreAllResistance() {
        return ignoreAllResistance;
    }

    public void setIgnoreAllResistance(int ignoreAllResistance) {
        this.ignoreAllResistance = ignoreAllResistance;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public int getCastingSpeed() {
        return castingSpeed;
    }

    public void setCastingSpeed(int castingSpeed) {
        this.castingSpeed = castingSpeed;
    }
}
