package wie.wiggle.testplanner;

import java.io.Serializable;

/**
 * Created by timox on 01/09/2017.
 */

public class Accessory implements Serializable {

    String type;
    String name;
    String rarity;
    int icon;
    int ap;
    int dp;
    int enchLVL;
    int enchStepAP;
    int enchStepDP;

    Accessory(String type, String name, String rarity, int icon, int ap, int dp, int enchLVL, int enchStepAP, int enchStepDP) {
        this.type = type;
        this.name = name;
        this.rarity = rarity;
        this.icon = icon;
        this.ap = ap;
        this.dp = dp;
        this.enchLVL = enchLVL;
        this.enchStepAP = enchStepAP;
        this.enchStepDP = enchStepDP;
    }

    public void setEnchStepDP(int enchStepDP) {
        this.enchStepDP = enchStepDP;
    }

    public int getEnchStepDP() {

        return enchStepDP;
    }

    public void setEnchLVL(int enchLVL) {
        this.enchLVL = enchLVL;
    }

    public void setEnchStepAP(int enchStepAP) {
        this.enchStepAP = enchStepAP;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }

    public int getAp() {
        return ap;
    }

    public int getDp() {
        return dp;
    }

    public String getRarity() {
        return rarity;
    }

    public String getType() {
        return type;
    }

    public int getEnchLVL() {
        return enchLVL;
    }

    public int getEnchStepAP() {
        return enchStepAP;
    }

}
