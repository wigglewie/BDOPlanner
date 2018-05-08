package wie.wiggle.testplanner;

import java.util.ArrayList;
import java.util.List;


public class InitializingAlchemyStones {

    private ArrayList<ItemAlchemyStone> alchemyStones;
    private ArrayList<StatsAlchemyDestruction> statsAlchemyDestruction;
    private ArrayList<StatsAlchemyProtection> statsAlchemyProtection;
    private ArrayList<StatsAlchemyLife> statsAlchemyLife;

    private Object destructionCommonImperfect;
    private Object destructionUncommonImperfect;
    private Object destructionRareImperfect;
    private Object destructionEpicImperfect;

    private Object destructionCommonRough;
    private Object destructionUncommonRough;
    private Object destructionRareRough;
    private Object destructionEpicRough;

    private Object destructionCommonPolished;
    private Object destructionUncommonPolished;
    private Object destructionRarePolished;
    private Object destructionEpicPolished;

    private Object destructionCommonSturdy;
    private Object destructionUncommonSturdy;
    private Object destructionRareSturdy;
    private Object destructionEpicSturdy;

    private Object destructionCommonSharp;
    private Object destructionUncommonSharp;
    private Object destructionRareSharp;
    private Object destructionEpicSharp;

    private Object destructionCommonResplendent;
    private Object destructionUncommonResplendent;
    private Object destructionRareResplendent;
    private Object destructionEpicResplendent;

    private Object destructionCommonSplendid;
    private Object destructionUncommonSplendid;
    private Object destructionRareSplendid;
    private Object destructionEpicSplendid;

    private Object protectionCommonImperfect;
    private Object protectionUncommonImperfect;
    private Object protectionRareImperfect;
    private Object protectionEpicImperfect;

    private Object protectionCommonRough;
    private Object protectionUncommonRough;
    private Object protectionRareRough;
    private Object protectionEpicRough;

    private Object protectionCommonPolished;
    private Object protectionUncommonPolished;
    private Object protectionRarePolished;
    private Object protectionEpicPolished;

    private Object protectionCommonSturdy;
    private Object protectionUncommonSturdy;
    private Object protectionRareSturdy;
    private Object protectionEpicSturdy;

    private Object protectionCommonSharp;
    private Object protectionUncommonSharp;
    private Object protectionRareSharp;
    private Object protectionEpicSharp;

    private Object protectionCommonResplendent;
    private Object protectionUncommonResplendent;
    private Object protectionRareResplendent;
    private Object protectionEpicResplendent;

    private Object protectionCommonSplendid;
    private Object protectionUncommonSplendid;
    private Object protectionRareSplendid;
    private Object protectionEpicSplendid;

    private Object lifeCommonImperfect;
    private Object lifeUncommonImperfect;
    private Object lifeRareImperfect;
    private Object lifeEpicImperfect;

    private Object lifeCommonRough;
    private Object lifeUncommonRough;
    private Object lifeRareRough;
    private Object lifeEpicRough;

    private Object lifeCommonPolished;
    private Object lifeUncommonPolished;
    private Object lifeRarePolished;
    private Object lifeEpicPolished;

    private Object lifeCommonSturdy;
    private Object lifeUncommonSturdy;
    private Object lifeRareSturdy;
    private Object lifeEpicSturdy;

    private Object lifeCommonSharp;
    private Object lifeUncommonSharp;
    private Object lifeRareSharp;
    private Object lifeEpicSharp;

    private Object lifeCommonResplendent;
    private Object lifeUncommonResplendent;
    private Object lifeRareResplendent;
    private Object lifeEpicResplendent;

    private Object lifeCommonSplendid;
    private Object lifeUncommonSplendid;
    private Object lifeRareSplendid;
    private Object lifeEpicSplendid;

    public ArrayList<ItemAlchemyStone> initializeAlchemyStones() {

        initStats();
        initObjectStats();

        //init alchemy stones
        alchemyStones = new ArrayList<>();
        //imperfect
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Imperfect Alchemy Stone of Destruction", "common", R.drawable.alchemy_destruction_imperfect, destructionCommonImperfect));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Imperfect Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destruction_imperfect, destructionUncommonImperfect));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Imperfect Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destruction_imperfect, destructionRareImperfect));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Imperfect Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destruction_imperfect, destructionEpicImperfect));
//
//        alchemyStones.add(new ItemAlchemyStone("protection", "Imperfect Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_imperfect, protectionCommonImperfect));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Imperfect Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_imperfect, protectionUncommonImperfect));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Imperfect Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_imperfect, protectionRareImperfect));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Imperfect Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_imperfect, protectionEpicImperfect));
//
//        alchemyStones.add(new ItemAlchemyStone("life", "Imperfect Alchemy Stone of Life", "common", R.drawable.alchemy_life_imperfect, lifeCommonImperfect));
//        alchemyStones.add(new ItemAlchemyStone("life", "Imperfect Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_imperfect, lifeUncommonImperfect));
//        alchemyStones.add(new ItemAlchemyStone("life", "Imperfect Alchemy Stone of Life", "rare", R.drawable.alchemy_life_imperfect, lifeRareImperfect));
//        alchemyStones.add(new ItemAlchemyStone("life", "Imperfect Alchemy Stone of Life", "epic", R.drawable.alchemy_life_imperfect, lifeEpicImperfect));
//
//        rough
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Rough Alchemy Stone of Destruction", "common", R.drawable.alchemy_destruction_rough, destructionCommonRough));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Rough Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destruction_rough, destructionUncommonRough));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Rough Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destruction_rough, destructionRareRough));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Rough Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destruction_rough, destructionEpicRough));
//
//        alchemyStones.add(new ItemAlchemyStone("protection", "Rough Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_rough, protectionCommonRough));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Rough Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_rough, protectionUncommonRough));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Rough Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_rough, protectionRareRough));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Rough Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_rough, protectionEpicRough));
//
//        alchemyStones.add(new ItemAlchemyStone("life", "Rough Alchemy Stone of Life", "common", R.drawable.alchemy_life_rough, lifeCommonRough));
//        alchemyStones.add(new ItemAlchemyStone("life", "Rough Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_rough, lifeUncommonRough));
//        alchemyStones.add(new ItemAlchemyStone("life", "Rough Alchemy Stone of Life", "rare", R.drawable.alchemy_life_rough, lifeRareRough));
//        alchemyStones.add(new ItemAlchemyStone("life", "Rough Alchemy Stone of Life", "epic", R.drawable.alchemy_life_rough, lifeEpicRough));
//
//        polished
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Polished Alchemy Stone of Destruction", "common", R.drawable.alchemy_destruction_polished, destructionCommonPolished));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Polished Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destruction_polished, destructionUncommonPolished));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Polished Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destruction_polished, destructionRarePolished));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Polished Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destruction_polished, destructionEpicPolished));
//
//        alchemyStones.add(new ItemAlchemyStone("protection", "Polished Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_polished, protectionCommonPolished));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Polished Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_polished, protectionUncommonPolished));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Polished Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_polished, protectionRarePolished));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Polished Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_polished, protectionEpicPolished));
//
//        alchemyStones.add(new ItemAlchemyStone("life", "Polished Alchemy Stone of Life", "common", R.drawable.alchemy_life_polished, lifeCommonPolished));
//        alchemyStones.add(new ItemAlchemyStone("life", "Polished Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_polished, lifeUncommonPolished));
//        alchemyStones.add(new ItemAlchemyStone("life", "Polished Alchemy Stone of Life", "rare", R.drawable.alchemy_life_polished, lifeRarePolished));
//        alchemyStones.add(new ItemAlchemyStone("life", "Polished Alchemy Stone of Life", "epic", R.drawable.alchemy_life_polished, lifeEpicPolished));
//
//        sturdy
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "common", R.drawable.alchemy_destruction_sturdy, destructionCommonSturdy));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destruction_sturdy, destructionUncommonSturdy));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destruction_sturdy, destructionRareSturdy));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destruction_sturdy, destructionEpicSturdy));
//
//        alchemyStones.add(new ItemAlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_sturdy, protectionCommonSturdy));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_sturdy, protectionUncommonSturdy));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_sturdy, protectionRareSturdy));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_sturdy, protectionEpicSturdy));
//
//        alchemyStones.add(new ItemAlchemyStone("life", "Sturdy Alchemy Stone of Life", "common", R.drawable.alchemy_life_sturdy, lifeCommonSturdy));
//        alchemyStones.add(new ItemAlchemyStone("life", "Sturdy Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_sturdy, lifeUncommonSturdy));
//        alchemyStones.add(new ItemAlchemyStone("life", "Sturdy Alchemy Stone of Life", "rare", R.drawable.alchemy_life_sturdy, lifeRareSturdy));
//        alchemyStones.add(new ItemAlchemyStone("life", "Sturdy Alchemy Stone of Life", "epic", R.drawable.alchemy_life_sturdy, lifeEpicSturdy));
//
//        sharp
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "common", R.drawable.alchemy_destruction_sharp, destructionCommonSharp));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destruction_sharp, destructionUncommonSharp));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destruction_sharp, destructionRareSharp));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destruction_sharp, destructionEpicSharp));
//
//        alchemyStones.add(new ItemAlchemyStone("protection", "Sharp Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_sharp, protectionCommonSharp));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Sharp Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_sharp, protectionUncommonSharp));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Sharp Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_sharp, protectionRareSharp));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Sharp Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_sharp, protectionEpicSharp));
//
//        alchemyStones.add(new ItemAlchemyStone("life", "Sharp Alchemy Stone of Life", "common", R.drawable.alchemy_life_sharp, lifeCommonSharp));
//        alchemyStones.add(new ItemAlchemyStone("life", "Sharp Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_sharp, lifeUncommonSharp));
//        alchemyStones.add(new ItemAlchemyStone("life", "Sharp Alchemy Stone of Life", "rare", R.drawable.alchemy_life_sharp, lifeRareSharp));
//        alchemyStones.add(new ItemAlchemyStone("life", "Sharp Alchemy Stone of Life", "epic", R.drawable.alchemy_life_sharp, lifeEpicSharp));
//
//        resplendent
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "common", R.drawable.alchemy_destruction_resplendent, destructionCommonResplendent));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destruction_resplendent, destructionUncommonResplendent));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destruction_resplendent, destructionRareResplendent));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destruction_resplendent, destructionEpicResplendent));
//
//        alchemyStones.add(new ItemAlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_resplendent, protectionCommonResplendent));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_resplendent, protectionUncommonResplendent));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_resplendent, protectionRareResplendent));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_resplendent, protectionEpicResplendent));
//
//        alchemyStones.add(new ItemAlchemyStone("life", "Resplendent Alchemy Stone of Life", "common", R.drawable.alchemy_life_resplendent, lifeCommonResplendent));
//        alchemyStones.add(new ItemAlchemyStone("life", "Resplendent Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_resplendent, lifeUncommonResplendent));
//        alchemyStones.add(new ItemAlchemyStone("life", "Resplendent Alchemy Stone of Life", "rare", R.drawable.alchemy_life_resplendent, lifeRareResplendent));
//        alchemyStones.add(new ItemAlchemyStone("life", "Resplendent Alchemy Stone of Life", "epic", R.drawable.alchemy_life_resplendent, lifeEpicResplendent));
//
//        splendid
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Splendid Alchemy Stone of Destruction", "common", R.drawable.alchemy_destruction_splendid, destructionCommonSplendid));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Splendid Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destruction_splendid, destructionUncommonSplendid));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Splendid Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destruction_splendid, destructionRareSplendid));
//        alchemyStones.add(new ItemAlchemyStone("destruction", "Splendid Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destruction_splendid, destructionEpicSplendid));
//
//        alchemyStones.add(new ItemAlchemyStone("protection", "Splendid Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_splendid, protectionCommonSplendid));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Splendid Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_splendid, protectionUncommonSplendid));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Splendid Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_splendid, protectionRareSplendid));
//        alchemyStones.add(new ItemAlchemyStone("protection", "Splendid Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_splendid, protectionEpicSplendid));
//
//        alchemyStones.add(new ItemAlchemyStone("life", "Splendid Alchemy Stone of Life", "common", R.drawable.alchemy_life_splendid, lifeCommonSplendid));
//        alchemyStones.add(new ItemAlchemyStone("life", "Splendid Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_splendid, lifeUncommonSplendid));
//        alchemyStones.add(new ItemAlchemyStone("life", "Splendid Alchemy Stone of Life", "rare", R.drawable.alchemy_life_splendid, lifeRareSplendid));
//        alchemyStones.add(new ItemAlchemyStone("life", "Splendid Alchemy Stone of Life", "epic", R.drawable.alchemy_life_splendid, lifeEpicSplendid));
//
        return alchemyStones;
    }

    private void initStats() {

//        statsAlchemyDestruction = new ArrayList<>();
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "imperfect", 2, 0, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "imperfect", 2, 2, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "imperfect", 2, 2, 1, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "imperfect", 2, 2, 1, 1, 1));
//
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "rough", 3, 0, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "rough", 3, 4, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "rough", 3, 4, 2, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "rough", 3, 4, 2, 2, 2));
//
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "polished", 4, 0, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "polished", 4, 8, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "polished", 4, 6, 3, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "polished", 4, 6, 3, 3, 3));
//
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "sturdy", 6, 0, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "sturdy", 6, 8, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "sturdy", 6, 8, 4, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "sturdy", 6, 8, 4, 4, 4));
//
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "sharp", 8, 0, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "sharp", 8, 10, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "sharp", 8, 10, 5, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "sharp", 8, 10, 5, 5, 5));
//
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "resplendent", 10, 0, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "resplendent", 10, 12, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "resplendent", 10, 12, 6, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "resplendent", 10, 0, 6, 6, 6));
//
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "splendid", 13, 0, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "splendid", 13, 14, 0, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "splendid", 13, 14, 8, 0, 0));
//        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "splendid", 13, 14, 8, 8, 8));
//
//        item_effects protection
//        statsAlchemyProtection = new ArrayList<>();
//        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "imperfect", 2, 0, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "imperfect", 2, 2, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "imperfect", 2, 2, 50, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "imperfect", 2, 2, 50, 1));
//
//        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "rough", 3, 0, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "rough", 3, 4, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "rough", 3, 4, 70, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "rough", 3, 4, 70, 2));
//
//        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "polished", 4, 0, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "polished", 4, 6, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "polished", 4, 6, 90, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "polished", 4, 6, 90, 3));
//
//        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "sturdy", 6, 0, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "sturdy", 6, 8, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "sturdy", 6, 8, 110, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "sturdy", 6, 8, 110, 4));
//
//        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "sharp", 8, 0, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "sharp", 8, 10, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "sharp", 8, 10, 140, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "sharp", 8, 10, 140, 5));
//
//        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "resplendent", 10, 0, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "resplendent", 10, 12, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "resplendent", 10, 12, 170, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "resplendent", 10, 12, 170, 6));
//
//        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "splendid", 13, 0, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "splendid", 13, 14, 0, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "splendid", 13, 14, 210, 0));
//        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "splendid", 13, 14, 210, 7));
//
//        item_effects life
//        statsAlchemyLife = new ArrayList<>();
//        statsAlchemyLife.add(new StatsAlchemyLife("common", "imperfect", 0.5f, 5, 0, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "imperfect", 0.5f, 5, 15, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("rare", "imperfect", 0.5f, 5, 15, 1, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("epic", "imperfect", 0.5f, 5, 15, 1, 3));
//
//        statsAlchemyLife.add(new StatsAlchemyLife("common", "rough", 0.7f, 7, 0, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "rough", 0.7f, 7, 30, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("rare", "rough", 0.7f, 7, 30, 1, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("epic", "rough", 0.7f, 7, 30, 1, 5));
//
//        statsAlchemyLife.add(new StatsAlchemyLife("common", "polished", 0.9f, 9, 0, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "polished", 0.9f, 9, 45, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("rare", "polished", 0.9f, 9, 45, 1, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("epic", "polished", 0.9f, 9, 45, 1, 7));
//
//        statsAlchemyLife.add(new StatsAlchemyLife("common", "sturdy", 1.1f, 11, 0, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "sturdy", 1.1f, 11, 60, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("rare", "sturdy", 1.1f, 11, 60, 2, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("epic", "sturdy", 1.1f, 11, 60, 2, 10));
//
//        statsAlchemyLife.add(new StatsAlchemyLife("common", "sharp", 1.4f, 14, 0, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "sharp", 1.4f, 14, 75, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("rare", "sharp", 1.4f, 14, 75, 2, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("epic", "sharp", 1.4f, 14, 75, 2, 13));
//
//        statsAlchemyLife.add(new StatsAlchemyLife("common", "resplendent", 1.7f, 17, 0, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "resplendent", 1.7f, 17, 90, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("rare", "resplendent", 1.7f, 17, 90, 2, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("epic", "resplendent", 1.7f, 17, 90, 2, 16));
//
//        statsAlchemyLife.add(new StatsAlchemyLife("common", "splendid", 2f, 20, 0, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "splendid", 2f, 20, 105, 0, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("rare", "splendid", 2f, 20, 105, 3, 0));
//        statsAlchemyLife.add(new StatsAlchemyLife("epic", "splendid", 2f, 20, 105, 3, 20));
//
    }

    private void initObjectStats() {

        ArrayList<List> alchemyStonesAllStats = new ArrayList<>();

        alchemyStonesAllStats.add(new ArrayList(statsAlchemyDestruction));
        alchemyStonesAllStats.add(new ArrayList(statsAlchemyProtection));
        alchemyStonesAllStats.add(new ArrayList(statsAlchemyLife));

        ArrayList statsArrayDestruction = (ArrayList) alchemyStonesAllStats.get(0);
        ArrayList statsArrayProtection = (ArrayList) alchemyStonesAllStats.get(1);
        ArrayList statsArrayLife = (ArrayList) alchemyStonesAllStats.get(2);

        //item_effects destruction
        destructionCommonImperfect = statsArrayDestruction.get(0);
        destructionUncommonImperfect = statsArrayDestruction.get(1);
        destructionRareImperfect = statsArrayDestruction.get(2);
        destructionEpicImperfect = statsArrayDestruction.get(3);

        destructionCommonRough = statsArrayDestruction.get(4);
        destructionUncommonRough = statsArrayDestruction.get(5);
        destructionRareRough = statsArrayDestruction.get(6);
        destructionEpicRough = statsArrayDestruction.get(7);

        destructionCommonPolished = statsArrayDestruction.get(8);
        destructionUncommonPolished = statsArrayDestruction.get(9);
        destructionRarePolished = statsArrayDestruction.get(10);
        destructionEpicPolished = statsArrayDestruction.get(11);

        destructionCommonSturdy = statsArrayDestruction.get(0);
        destructionUncommonSturdy = statsArrayDestruction.get(1);
        destructionRareSturdy = statsArrayDestruction.get(2);
        destructionEpicSturdy = statsArrayDestruction.get(3);

        destructionCommonSharp = statsArrayDestruction.get(4);
        destructionUncommonSharp = statsArrayDestruction.get(5);
        destructionRareSharp = statsArrayDestruction.get(6);
        destructionEpicSharp = statsArrayDestruction.get(7);

        destructionCommonResplendent = statsArrayDestruction.get(8);
        destructionUncommonResplendent = statsArrayDestruction.get(9);
        destructionRareResplendent = statsArrayDestruction.get(10);
        destructionEpicResplendent = statsArrayDestruction.get(11);

        destructionCommonSplendid = statsArrayDestruction.get(12);
        destructionUncommonSplendid = statsArrayDestruction.get(13);
        destructionRareSplendid = statsArrayDestruction.get(14);
        destructionEpicSplendid = statsArrayDestruction.get(15);

        //item_effects protection
        protectionCommonImperfect = statsArrayProtection.get(0);
        protectionUncommonImperfect = statsArrayProtection.get(1);
        protectionRareImperfect = statsArrayProtection.get(2);
        protectionEpicImperfect = statsArrayProtection.get(3);

        protectionCommonRough = statsArrayProtection.get(4);
        protectionUncommonRough = statsArrayProtection.get(5);
        protectionRareRough = statsArrayProtection.get(6);
        protectionEpicRough = statsArrayProtection.get(7);

        protectionCommonPolished = statsArrayProtection.get(8);
        protectionUncommonPolished = statsArrayProtection.get(9);
        protectionRarePolished = statsArrayProtection.get(10);
        protectionEpicPolished = statsArrayProtection.get(11);

        protectionCommonSturdy = statsArrayProtection.get(0);
        protectionUncommonSturdy = statsArrayProtection.get(1);
        protectionRareSturdy = statsArrayProtection.get(2);
        protectionEpicSturdy = statsArrayProtection.get(3);

        protectionCommonSharp = statsArrayProtection.get(4);
        protectionUncommonSharp = statsArrayProtection.get(5);
        protectionRareSharp = statsArrayProtection.get(6);
        protectionEpicSharp = statsArrayProtection.get(7);

        protectionCommonResplendent = statsArrayProtection.get(8);
        protectionUncommonResplendent = statsArrayProtection.get(9);
        protectionRareResplendent = statsArrayProtection.get(10);
        protectionEpicResplendent = statsArrayProtection.get(11);

        protectionCommonSplendid = statsArrayProtection.get(12);
        protectionUncommonSplendid = statsArrayProtection.get(13);
        protectionRareSplendid = statsArrayProtection.get(14);
        protectionEpicSplendid = statsArrayProtection.get(15);

        //item_effects life
        lifeCommonImperfect = statsArrayLife.get(0);
        lifeUncommonImperfect = statsArrayLife.get(1);
        lifeRareImperfect = statsArrayLife.get(2);
        lifeEpicImperfect = statsArrayLife.get(3);

        lifeCommonRough = statsArrayLife.get(4);
        lifeUncommonRough = statsArrayLife.get(5);
        lifeRareRough = statsArrayLife.get(6);
        lifeEpicRough = statsArrayLife.get(7);

        lifeCommonPolished = statsArrayLife.get(8);
        lifeUncommonPolished = statsArrayLife.get(9);
        lifeRarePolished = statsArrayLife.get(10);
        lifeEpicPolished = statsArrayLife.get(11);

        lifeCommonSturdy = statsArrayLife.get(0);
        lifeUncommonSturdy = statsArrayLife.get(1);
        lifeRareSturdy = statsArrayLife.get(2);
        lifeEpicSturdy = statsArrayLife.get(3);

        lifeCommonSharp = statsArrayLife.get(4);
        lifeUncommonSharp = statsArrayLife.get(5);
        lifeRareSharp = statsArrayLife.get(6);
        lifeEpicSharp = statsArrayLife.get(7);

        lifeCommonResplendent = statsArrayLife.get(8);
        lifeUncommonResplendent = statsArrayLife.get(9);
        lifeRareResplendent = statsArrayLife.get(10);
        lifeEpicResplendent = statsArrayLife.get(11);

        lifeCommonSplendid = statsArrayLife.get(12);
        lifeUncommonSplendid = statsArrayLife.get(13);
        lifeRareSplendid = statsArrayLife.get(14);
        lifeEpicSplendid = statsArrayLife.get(15);

    }

}
