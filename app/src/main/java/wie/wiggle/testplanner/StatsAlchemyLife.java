package wie.wiggle.testplanner;

import java.io.Serializable;

/**
 * Created by timox on 06-Feb-18.
 */

public class StatsAlchemyLife implements Serializable {

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

//    String rarity;
//    String name;
    float cookingTime;
    int processingSuccessRate;
    int weightLimit;
    int gatheringFishingLvl;
    int gatheringDropRate;

    public StatsAlchemyLife(float cookingTime, int processingSuccessRate, int weightLimit, int gatheringFishingLvl, int gatheringDropRate) {
//        this.rarity = rarity;
//        this.name = name;
        this.cookingTime = cookingTime;
        this.processingSuccessRate = processingSuccessRate;
        this.weightLimit = weightLimit;
        this.gatheringFishingLvl = gatheringFishingLvl;
        this.gatheringDropRate = gatheringDropRate;
    }

//    public String getRarity() {
//        return rarity;
//    }
//
//    public void setRarity(String rarity) {
//        this.rarity = rarity;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public float getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(float cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getProcessingSuccessRate() {
        return processingSuccessRate;
    }

    public void setProcessingSuccessRate(int processingSuccessRate) {
        this.processingSuccessRate = processingSuccessRate;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public int getGatheringFishingLvl() {
        return gatheringFishingLvl;
    }

    public void setGatheringFishingLvl(int gatheringFishingLvl) {
        this.gatheringFishingLvl = gatheringFishingLvl;
    }

    public int getGatheringDropRate() {
        return gatheringDropRate;
    }

    public void setGatheringDropRate(int gatheringDropRate) {
        this.gatheringDropRate = gatheringDropRate;
    }
}
