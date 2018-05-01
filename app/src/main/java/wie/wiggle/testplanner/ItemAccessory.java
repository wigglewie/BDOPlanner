package wie.wiggle.testplanner;

import java.io.Serializable;

/**
 * Created by timox on 01/09/2017.
 */

public class ItemAccessory implements Serializable {

    String type;
    String name;
    String rarity;
    int icon;
    int ap;
    int dp;
    int enhLVL;
    int enhStepAP;
    int enhStepDP;

    ItemAccessory(String type, String name, String rarity, int icon, int ap, int dp, int enhLVL, int enhStepAP, int enhStepDP) {
        this.type = type;
        this.name = name;
        this.rarity = rarity;
        this.icon = icon;
        this.ap = ap;
        this.dp = dp;
        this.enhLVL = enhLVL;
        this.enhStepAP = enhStepAP;
        this.enhStepDP = enhStepDP;
    }

    public void setEnhStepDP(int enhStepDP) {
        this.enhStepDP = enhStepDP;
    }

    public int getEnhStepDP() {

        return enhStepDP;
    }

    public void setEnhLVL(int enhLVL) {
        this.enhLVL = enhLVL;
    }

    public void setEnhStepAP(int enhStepAP) {
        this.enhStepAP = enhStepAP;
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

    public int getEnhLVL() {
        return enhLVL;
    }

    public int getEnhStepAP() {
        return enhStepAP;
    }

}
