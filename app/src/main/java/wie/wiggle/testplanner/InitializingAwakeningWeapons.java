package wie.wiggle.testplanner;

import java.util.ArrayList;

/**
 * Created by timox on 09-Feb-18.
 */

public class InitializingAwakeningWeapons {

    private ArrayList<ItemAwakeningWeapon> awakeningWeapons;

    private int[] enhancingArray = new int[21];
    private int[] enhancingArrayDande = new int[21];

    public ArrayList<ItemAwakeningWeapon> initializeAwakeningWeapons() {

        enhancingArray[0] = 0;
        enhancingArray[1] = 4;
        enhancingArray[2] = 3;
        enhancingArray[3] = 3;
        enhancingArray[4] = 2;
        enhancingArray[5] = 2;
        enhancingArray[6] = 3;
        enhancingArray[7] = 3;
        enhancingArray[8] = 4;
        enhancingArray[9] = 4;
        enhancingArray[10] = 4;
        enhancingArray[11] = 4;
        enhancingArray[12] = 4;
        enhancingArray[13] = 4;
        enhancingArray[14] = 4;
        enhancingArray[15] = 4;
        enhancingArray[16] = 8;
        enhancingArray[17] = 8;
        enhancingArray[18] = 12;
        enhancingArray[19] = 8;
        enhancingArray[20] = 8;

        enhancingArrayDande[0] = 0;
        enhancingArrayDande[1] = 4;
        enhancingArrayDande[2] = 3;
        enhancingArrayDande[3] = 3;
        enhancingArrayDande[4] = 2;
        enhancingArrayDande[5] = 2;
        enhancingArrayDande[6] = 3;
        enhancingArrayDande[7] = 3;
        enhancingArrayDande[8] = 5;
        enhancingArrayDande[9] = 5;
        enhancingArrayDande[10] = 5;
        enhancingArrayDande[11] = 5;
        enhancingArrayDande[12] = 5;
        enhancingArrayDande[13] = 5;
        enhancingArrayDande[14] = 5;
        enhancingArrayDande[15] = 5;
        enhancingArrayDande[16] = 8;
        enhancingArrayDande[17] = 8;
        enhancingArrayDande[18] = 12;
        enhancingArrayDande[19] = 8;
        enhancingArrayDande[20] = 8;


        Object enhancingStats = enhancingArray;
        Object enhancingStatsDande = enhancingArrayDande;

        awakeningWeapons = new ArrayList<>();

        awakeningWeapons.add(new ItemAwakeningWeapon("Warrior", "Dandelion Great Sword", "dande", "epic", R.drawable.awakening_warrior_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Warrior", "Mercenary's Great Sword", "normal", "uncommon", R.drawable.awakening_warrior_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Warrior", "Ultimate Mercenary's Great Sword", "normal", "epic", R.drawable.awakening_warrior_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Warrior", "Mercenary's Steel Great Sword", "normal", "rare", R.drawable.awakening_warrior_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Warrior", "Ultimate Mercenary's Steel Great Sword", "normal", "epic", R.drawable.awakening_warrior_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Sorceress", "Dandelion Scythe", "dande", "epic", R.drawable.awakening_sorceress_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Sorceress", "Scythe of Seduction", "normal", "uncommon", R.drawable.awakening_sorceress_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Sorceress", "Ultimate Scythe of Seduction", "normal", "epic", R.drawable.awakening_sorceress_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Sorceress", "Spell Scythe of Seduction", "normal", "rare", R.drawable.awakening_sorceress_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Sorceress", "Ultimate Spell Scythe of Seduction", "normal", "epic", R.drawable.awakening_sorceress_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Ranger", "Dandelion Kamasylven Sword", "dande", "epic", R.drawable.awakening_ranger_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Ranger", "Young Tree Spirit's Kamasylven Sword", "normal", "uncommon", R.drawable.awakening_ranger_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Ranger", "Ultimate Young Tree Spirit's Kamasylven Sword", "normal", "epic", R.drawable.awakening_ranger_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Ranger", "Heiress's Kamasylven Sword", "normal", "rare", R.drawable.awakening_ranger_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Ranger", "Ultimate Heiress's Kamasylven Sword", "normal", "epic", R.drawable.awakening_ranger_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Berserker", "Dandelion Iron Buster", "dande", "epic", R.drawable.awakening_berserker_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Berserker", "Rough Iron Buster", "normal", "uncommon", R.drawable.awakening_berserker_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Berserker", "Ultimate Rough Iron Buster", "normal", "epic", R.drawable.awakening_berserker_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Berserker", "Upgraded Iron Buster", "normal", "rare", R.drawable.awakening_berserker_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Berserker", "Ultimate Upgraded Iron Buster", "normal", "epic", R.drawable.awakening_berserker_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Tamer", "Dandelion Celestial Bo Staff", "dande", "epic", R.drawable.awakening_tamer_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Tamer", "Practice Celestial Bo Staff", "normal", "uncommon", R.drawable.awakening_tamer_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Tamer", "Ultimate Practice Celestial Bo Staff", "normal", "epic", R.drawable.awakening_tamer_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Tamer", "Azure Thunder Celestial Bo Staff", "normal", "rare", R.drawable.awakening_tamer_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Tamer", "Ultimate Azure Thunder Celestial Bo Staff", "normal", "epic", R.drawable.awakening_tamer_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Musa", "Dandelion Crescent Blade", "dande", "epic", R.drawable.awakening_musa_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Musa", "Iron Crescent Blade", "normal", "uncommon", R.drawable.awakening_musa_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Musa", "Ultimate Iron Crescent Blade", "normal", "epic", R.drawable.awakening_musa_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Musa", "Immaculate Crescent Blade", "normal", "rare", R.drawable.awakening_musa_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Musa", "Ultimate Immaculate Crescent Blade", "normal", "epic", R.drawable.awakening_musa_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Maehva", "Dandelion Kerispear", "dande", "epic", R.drawable.awakening_maehva_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Maehva", "Sundo Kerispear", "normal", "uncommon", R.drawable.awakening_maehva_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Maehva", "Ultimate Sundo Kerispear", "normal", "epic", R.drawable.awakening_maehva_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Maehva", "Frosty Cloud Kerispear", "normal", "rare", R.drawable.awakening_maehva_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Maehva", "Ultimate Frosty Cloud Kerispear", "normal", "epic", R.drawable.awakening_maehva_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Valkyrie", "Dandelion Lancia", "dande", "epic", R.drawable.awakening_valkyrie_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Valkyrie", "Schzeriel Lancia", "normal", "uncommon", R.drawable.awakening_valkyrie_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Valkyrie", "Ultimate Schzeriel Lancia", "normal", "epic", R.drawable.awakening_valkyrie_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Valkyrie", "Piece of Purification Lancia", "normal", "rare", R.drawable.awakening_valkyrie_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Valkyrie", "Ultimate Piece of Purification Lancia", "normal", "epic", R.drawable.awakening_valkyrie_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Wizard", "Dandelion Godr Sphera", "dande", "epic", R.drawable.awakening_wizard_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Wizard", "Tati Godr Sphera", "normal", "uncommon", R.drawable.awakening_wizard_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Wizard", "Ultimate Tati Godr Sphera", "normal", "epic", R.drawable.awakening_wizard_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Wizard", "Lord Godr Sphera", "normal", "rare", R.drawable.awakening_wizard_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Wizard", "Ultimate Lord Godr Sphera", "normal", "epic", R.drawable.awakening_wizard_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Witch", "Dandelion Aad Sphera", "dande", "epic", R.drawable.awakening_witch_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Witch", "Pri Aad Sphera", "normal", "uncommon", R.drawable.awakening_witch_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Witch", "Ultimate Pri Aad Sphera", "normal", "epic", R.drawable.awakening_witch_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Witch", "Alloria Aad Sphera", "normal", "rare", R.drawable.awakening_witch_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Witch", "Ultimate Alloria Aad Sphera", "normal", "epic", R.drawable.awakening_witch_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Ninja", "Dandelion Sura Katana", "dande", "epic", R.drawable.awakening_ninja_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Ninja", "Tempest Sura Katana", "normal", "uncommon", R.drawable.awakening_ninja_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Ninja", "Ultimate Tempest Sura Katana", "normal", "epic", R.drawable.awakening_ninja_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Ninja", "Yagakmu Sura Katana", "normal", "rare", R.drawable.awakening_ninja_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Ninja", "Ultimate Yagakmu Sura Katana", "normal", "epic", R.drawable.awakening_ninja_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Kunoichi", "Dandelion Sah Chakram", "dande", "epic", R.drawable.awakening_kunoichi_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Kunoichi", "Sonan Sah Chakram", "normal", "uncommon", R.drawable.awakening_kunoichi_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Kunoichi", "Ultimate Sonan Sah Chakram", "normal", "epic", R.drawable.awakening_kunoichi_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Kunoichi", "Oeki's Sah Chakram", "normal", "rare", R.drawable.awakening_kunoichi_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Kunoichi", "Ultimate Oeki's Sah Chakram", "normal", "epic", R.drawable.awakening_kunoichi_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Dark Knight", "Dandelion Vediant", "dande", "epic", R.drawable.awakening_darkknight_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Dark Knight", "Thorn Tree Vediant", "normal", "uncommon", R.drawable.awakening_darkknight_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Dark Knight", "Ultimate Thorn Tree Vediant", "normal", "epic", R.drawable.awakening_darkknight_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Dark Knight", "Light-Swallowing Vediant", "normal", "rare", R.drawable.awakening_darkknight_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Dark Knight", "Ultimate Light-Swallowing Vediant", "normal", "epic", R.drawable.awakening_darkknight_blue, 18, 27, 0, enhancingStats));

        awakeningWeapons.add(new ItemAwakeningWeapon("Striker", "Dandelion Gardbrace", "dande", "epic", R.drawable.awakening_striker_dande, 18, 27, 0, enhancingStatsDande));
        awakeningWeapons.add(new ItemAwakeningWeapon("Striker", "Iron Chain Gardbrace", "normal", "uncommon", R.drawable.awakening_striker_green, 11, 20, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Striker", "Ultimate Iron Chain Gardbrace", "normal", "epic", R.drawable.awakening_striker_green, 13, 22, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Striker", "Backflow Gardbrace", "normal", "rare", R.drawable.awakening_striker_blue, 16, 25, 0, enhancingStats));
        awakeningWeapons.add(new ItemAwakeningWeapon("Striker", "Ultimate Backflow Gardbrace", "normal", "epic", R.drawable.awakening_striker_blue, 18, 27, 0, enhancingStats));

        return awakeningWeapons;
    }
}
