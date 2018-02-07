package wie.wiggle.testplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class GearActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<Accessory> earrings;
    private ArrayList<Accessory> rings;
    private ArrayList<Accessory> belts;
    private ArrayList<Accessory> necklaces;
    private ArrayList<AlchemyStone> alchemyStones;
    private ArrayList<StatsAlchemyDestruction> statsAlchemyDestruction;
    private ArrayList<StatsAlchemyProtection> statsAlchemyProtection;
    private ArrayList<StatsAlchemyLife> statsAlchemyLife;

    private static final int REQUEST_CODE_ALCHEMY_STONE = 0;
    private static final int REQUEST_CODE_AWAKENING_WEAPON = 1;
    private static final int REQUEST_CODE_MAIN_WEAPON = 2;
    private static final int REQUEST_CODE_BELT = 3;
    private static final int REQUEST_CODE_SHOES = 4;
    private static final int REQUEST_CODE_EARRING2 = 5;
    private static final int REQUEST_CODE_EARRING1 = 6;
    private static final int REQUEST_CODE_HELMET = 7;
    private static final int REQUEST_CODE_ARMOR = 8;
    private static final int REQUEST_CODE_RING1 = 9;
    private static final int REQUEST_CODE_RING2 = 10;
    private static final int REQUEST_CODE_GLOVES = 0;
    private static final int REQUEST_CODE_NECKLACE = 12;
    private static final int REQUEST_CODE_SECONDARY_WEAPON = 13;
    private static final int REQUEST_CODE_COSTUME_SECONDARY_WEAPON = 14;
    private static final int REQUEST_CODE_COSTUME_UNDERWEAR = 15;
    private static final int REQUEST_CODE_COSTUME_AWAKENING_WEAPON = 16;
    private static final int REQUEST_CODE_COSTUME_MAIN_WEAPON = 17;
    private static final int REQUEST_CODE_COSTUME = 18;

    private ImageView classIcon;
    private ImageView viewAlchemyStone;
    private ImageView viewRing1;
    private ImageView viewRing2;
    private ImageView viewEarring1;
    private ImageView viewEarring2;
    private ImageView viewBelt;
    private ImageView viewNecklace;
    private ImageView viewHelmet;
    private ImageView viewArmor;
    private ImageView viewGloves;
    private ImageView viewShoes;
    private ImageView viewMainWeapon;
    private ImageView viewSecondaryWeapon;
    private ImageView viewAwakeningWeapon;
    private TextView viewAP;
    private TextView viewDP;
    private TextView viewAwaAP;
    private TextView viewGS;

    private ImageView viewEarring1enhLvl;
    private ImageView viewEarring2enhLv1;
    private ImageView viewRing1enhLvl;
    private ImageView viewRing2enhLvl;

    private CheckBox checkAlchemy;

    private int awaSum;
    private int apSum;
    private int dpSum;
    private int gs;

    private int rarityValue;

    private int icon;
    private String rarity;

    private int rarityResource;

    private int ap;
    private int dp;
    private int enhLvl;

    //stats
    private int valueHiddenAP;
    private int valueAccuracy;
    private int valueIgnoreAllResistance;
    private int valueAttackSpeedPercentage;
    private int valueCastingSpeedPercentage;

    private int valueDR;
    private int valueEvasion;
    private int valueMaxHP;
    private int valueKnockbackResistance;
    private int valueKnockdownResistance;
    private int valueStunResistance;
    private int valueGrappleResistance;

    private float valueCookingTime;
    private int valueProcessingSuccessRate;
    private int valueWeightLimit;
    private int valueGatheringFishingLvl;
    private int valueGatheringDropRate;

    private TextView viewHiddenAP;
    private TextView viewAccuracy;
    private TextView viewIgnoreAllResistance;
    private TextView viewAttackSpeedPercentage;
    private TextView viewCastingSpeedPercentage;

    private TextView viewDR;
    private TextView viewEvasion;
    private TextView viewMaxHP;
    private TextView viewKnockbackResistance;
    private TextView viewKnockdownResistance;
    private TextView viewStunResistance;
    private TextView viewGrappleResistance;

    private TextView viewCookingTime;
    private TextView viewProcessingSuccessRate;
    private TextView viewWeightLimit;
    private TextView viewGatheringFishingLvl;
    private TextView viewGatheringDropRate;

    private String alchemyStoneType;
    private StatsAlchemyDestruction statsDestr;
    private StatsAlchemyProtection statsProt;
    private StatsAlchemyLife statsLife;

    private Accessory accessory;
    private AlchemyStone alchemyStone;

    private ArrayList<Object> gear;
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

    private int[] apArray = new int[13];
    private int[] dpArray = new int[13];

//    private TextView className;


    private android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gear);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        classIcon = (ImageView) findViewById(R.id.view_class_icon);
//        className = (TextView) findViewById(R.id.toolbar_label);

        viewAlchemyStone = (ImageView) findViewById(R.id.view_alchemy_stone);
        viewRing1 = (ImageView) findViewById(R.id.view_ring1);
        viewRing2 = (ImageView) findViewById(R.id.view_ring2);
        viewEarring1 = (ImageView) findViewById(R.id.view_earring1);
        viewEarring2 = (ImageView) findViewById(R.id.view_earring2);
        viewBelt = (ImageView) findViewById(R.id.view_belt);
        viewNecklace = (ImageView) findViewById(R.id.view_necklace);
        viewHelmet = (ImageView) findViewById(R.id.view_helmet);
        viewArmor = (ImageView) findViewById(R.id.view_armor);
        viewGloves = (ImageView) findViewById(R.id.view_gloves);
        viewShoes = (ImageView) findViewById(R.id.view_shoes);
        viewMainWeapon = (ImageView) findViewById(R.id.view_main_weapon);
        viewSecondaryWeapon = (ImageView) findViewById(R.id.view_secondary_weapon);
        viewAwakeningWeapon = (ImageView) findViewById(R.id.view_awakening_weapon);
        viewAP = (TextView) findViewById(R.id.textView_AP);
        viewDP = (TextView) findViewById(R.id.textView_DP);
        viewAwaAP = (TextView) findViewById(R.id.textView_awakening_AP);
        viewGS = (TextView) findViewById(R.id.textView_GS);

        viewEarring1enhLvl = (ImageView) findViewById(R.id.view_earring1_enchLvl);
        viewEarring2enhLv1 = (ImageView) findViewById(R.id.view_earring2_enchLvl);
        viewRing1enhLvl = (ImageView) findViewById(R.id.view_ring1_enchLvl);
        viewRing2enhLvl = (ImageView) findViewById(R.id.view_ring2_enchLvl);

        checkAlchemy = (CheckBox) findViewById(R.id.checkAlchemy);

        viewHiddenAP = (TextView) findViewById(R.id.text_stats_offensive_hidden_ap);
        viewAccuracy = (TextView) findViewById(R.id.text_stats_offensive_accuracy);
        viewIgnoreAllResistance = (TextView) findViewById(R.id.text_stats_offensive_ignoreAllResistance);
        viewAttackSpeedPercentage = (TextView) findViewById(R.id.text_stats_attack_speed_percentage);
        viewCastingSpeedPercentage = (TextView) findViewById(R.id.text_stats_casting_speed_percentage);

        viewDR = (TextView) findViewById(R.id.text_stats_defensive_dr);
        viewEvasion = (TextView) findViewById(R.id.text_stats_defensive_evasion);
        viewMaxHP = (TextView) findViewById(R.id.text_stats_survivability_maxHP);
        viewKnockbackResistance = (TextView) findViewById(R.id.text_stats_resistance_knockback);
        viewKnockdownResistance = (TextView) findViewById(R.id.text_stats_resistance_knockdown);
        viewStunResistance = (TextView) findViewById(R.id.text_stats_resistance_stun);
        viewGrappleResistance = (TextView) findViewById(R.id.text_stats_resistance_grapple);

        viewCookingTime = (TextView) findViewById(R.id.text_stats_gearSpecials_cookingTime);
        viewProcessingSuccessRate = (TextView) findViewById(R.id.text_stats_gearSpecials_processingSuccessRate);
        viewWeightLimit = (TextView) findViewById(R.id.text_stats_general_weightLimit);
        viewGatheringFishingLvl = (TextView) findViewById(R.id.text_stats_gearSpecials_gatheringFishingLVL);
        viewGatheringDropRate = (TextView) findViewById(R.id.text_stats_gearSpecials_gatheringDropRate);

        valueKnockbackResistance = 20;
        valueKnockdownResistance = 20;
        valueStunResistance = 20;
        valueGrappleResistance = 20;

        //alchemy stone ON/OFF
        checkAlchemy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (gear.get(0) != null) {
                    if (checkAlchemy.isChecked()) {
                        if (alchemyStoneType.equals("destruction")) {

                            viewHiddenAP.setText(Integer.toString(statsDestr.hiddenAP));
                            viewAccuracy.setText(Integer.toString(statsDestr.accuracy));
                            viewIgnoreAllResistance.setText(Integer.toString(statsDestr.ignoreAllResistance));
                            viewAttackSpeedPercentage.setText(Integer.toString(statsDestr.attackSpeed));
                            viewCastingSpeedPercentage.setText(Integer.toString(statsDestr.castingSpeed));

                        } else if (alchemyStoneType.equals("protection")) {

                            viewDR.setText(Integer.toString(statsProt.damageReduction));
                            viewEvasion.setText(Integer.toString(statsProt.evasion));
                            viewMaxHP.setText(Integer.toString(statsProt.maxHP));
                            viewKnockbackResistance.setText(Integer.toString(valueKnockbackResistance + statsProt.resistanceAll));
                            viewKnockdownResistance.setText(Integer.toString(valueKnockdownResistance + statsProt.resistanceAll));
                            viewStunResistance.setText(Integer.toString(valueStunResistance + statsProt.resistanceAll));
                            viewGrappleResistance.setText(Integer.toString(valueGrappleResistance + statsProt.resistanceAll));

                        } else if (alchemyStoneType.equals("life")) {

                            viewCookingTime.setText(Float.toString(statsLife.cookingTime));
                            viewProcessingSuccessRate.setText(Integer.toString(statsLife.processingSuccessRate));
                            viewWeightLimit.setText(Integer.toString(statsLife.weightLimit));
                            viewGatheringFishingLvl.setText(Integer.toString(statsLife.gatheringFishingLvl));
                            viewGatheringDropRate.setText(Integer.toString(statsLife.gatheringDropRate));
                        }
                    } else {
                        alchStoneOff();
                    }
                } else {
                    checkAlchemy.setChecked(false);
                    alchStoneOff();
                }
            }

            private void alchStoneOff() {
                viewHiddenAP.setText(Integer.toString(valueHiddenAP));
                viewAccuracy.setText(Integer.toString(valueAccuracy));
                viewIgnoreAllResistance.setText(Integer.toString(valueIgnoreAllResistance));
                viewAttackSpeedPercentage.setText(Integer.toString(valueAttackSpeedPercentage));
                viewCastingSpeedPercentage.setText(Integer.toString(valueCastingSpeedPercentage));

                viewDR.setText(Integer.toString(valueDR));
                viewEvasion.setText(Integer.toString(valueEvasion));
                viewMaxHP.setText(Integer.toString(valueMaxHP));
                viewKnockbackResistance.setText(Integer.toString(valueKnockbackResistance));
                viewKnockdownResistance.setText(Integer.toString(valueKnockdownResistance));
                viewStunResistance.setText(Integer.toString(valueStunResistance));
                viewGrappleResistance.setText(Integer.toString(valueGrappleResistance));

                viewCookingTime.setText(Float.toString(valueCookingTime));
                viewProcessingSuccessRate.setText(Integer.toString(valueProcessingSuccessRate));
                viewWeightLimit.setText(Integer.toString(valueWeightLimit));
                viewGatheringFishingLvl.setText(Integer.toString(valueGatheringFishingLvl));
                viewGatheringDropRate.setText(Integer.toString(valueGatheringDropRate));
            }
        });

        viewAlchemyStone.setOnClickListener(this);
        viewRing1.setOnClickListener(this);
        viewRing2.setOnClickListener(this);
        viewEarring1.setOnClickListener(this);
        viewEarring2.setOnClickListener(this);
        viewBelt.setOnClickListener(this);
        viewNecklace.setOnClickListener(this);
        viewHelmet.setOnClickListener(this);
        viewArmor.setOnClickListener(this);
        viewGloves.setOnClickListener(this);
        viewShoes.setOnClickListener(this);
        viewMainWeapon.setOnClickListener(this);
        viewSecondaryWeapon.setOnClickListener(this);
        viewAwakeningWeapon.setOnClickListener(this);

        Character character = getIntent().getParcelableExtra("class");

        classIcon.setImageResource(character.icon);
//        className.setText(character.name);

        initEarrings();
        initRings();
        initAlchemyStones();

        //belts
        belts = new ArrayList<>();

        //necklaces
        necklaces = new ArrayList<>();

        gear = new ArrayList<>(19);
        gear.add(0, alchemyStone);
        gear.add(1, accessory);
        gear.add(2);
        gear.add(3);
        gear.add(4);
        gear.add(5, accessory);
        gear.add(6, accessory);
        gear.add(7);
        gear.add(8);
        gear.add(9, accessory);
        gear.add(10, accessory);
        gear.add(11);
        gear.add(12, accessory);
        gear.add(13);
        gear.add(14);
        gear.add(15);
        gear.add(16);
        gear.add(17);
        gear.add(18);

    }

    private void initAlchemyStones() {

        //init stats
        //stats destruction
        statsAlchemyDestruction = new ArrayList<>();
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "imperfect", 2, 0, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "imperfect", 2, 2, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "imperfect", 2, 2, 1, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "imperfect", 2, 2, 1, 1, 1));

        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "rough", 3, 0, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "rough", 3, 4, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "rough", 3, 4, 2, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "rough", 3, 4, 2, 2, 2));

        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "polished", 4, 0, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "polished", 4, 8, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "polished", 4, 6, 3, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "polished", 4, 6, 3, 3, 3));

        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "sturdy", 6, 0, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "sturdy", 6, 8, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "sturdy", 6, 8, 4, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "sturdy", 6, 8, 4, 4, 4));

        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "sharp", 8, 0, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "sharp", 8, 10, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "sharp", 8, 10, 5, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "sharp", 8, 10, 5, 5, 5));

        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "resplendent", 10, 0, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "resplendent", 10, 12, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "resplendent", 10, 12, 6, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "resplendent", 10, 0, 6, 6, 6));

        statsAlchemyDestruction.add(new StatsAlchemyDestruction("common", "splendid", 13, 0, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("uncommon", "splendid", 13, 14, 0, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("rare", "splendid", 13, 14, 8, 0, 0));
        statsAlchemyDestruction.add(new StatsAlchemyDestruction("epic", "splendid", 13, 14, 8, 8, 8));

        //stats protection
        statsAlchemyProtection = new ArrayList<>();
        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "imperfect", 2, 0, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "imperfect", 2, 2, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "imperfect", 2, 2, 50, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "imperfect", 2, 2, 50, 1));

        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "rough", 3, 0, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "rough", 3, 4, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "rough", 3, 4, 70, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "rough", 3, 4, 70, 2));

        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "polished", 4, 0, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "polished", 4, 6, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "polished", 4, 6, 90, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "polished", 4, 6, 90, 3));

        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "sturdy", 6, 0, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "sturdy", 6, 8, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "sturdy", 6, 8, 110, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "sturdy", 6, 8, 110, 4));

        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "sharp", 8, 0, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "sharp", 8, 10, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "sharp", 8, 10, 140, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "sharp", 8, 10, 140, 5));

        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "resplendent", 10, 0, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "resplendent", 10, 12, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "resplendent", 10, 12, 170, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "resplendent", 10, 12, 170, 6));

        statsAlchemyProtection.add(new StatsAlchemyProtection("common", "splendid", 13, 0, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("uncommon", "splendid", 13, 14, 0, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("rare", "splendid", 13, 14, 210, 0));
        statsAlchemyProtection.add(new StatsAlchemyProtection("epic", "splendid", 13, 14, 210, 7));

        //stats life
        statsAlchemyLife = new ArrayList<>();
        statsAlchemyLife.add(new StatsAlchemyLife("common", "imperfect", 0.5f, 5, 0, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "imperfect", 0.5f, 5, 15, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("rare", "imperfect", 0.5f, 5, 15, 1, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("epic", "imperfect", 0.5f, 5, 15, 1, 3));

        statsAlchemyLife.add(new StatsAlchemyLife("common", "rough", 0.7f, 7, 0, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "rough", 0.7f, 7, 30, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("rare", "rough", 0.7f, 7, 30, 1, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("epic", "rough", 0.7f, 7, 30, 1, 5));

        statsAlchemyLife.add(new StatsAlchemyLife("common", "polished", 0.9f, 9, 0, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "polished", 0.9f, 9, 45, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("rare", "polished", 0.9f, 9, 45, 1, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("epic", "polished", 0.9f, 9, 45, 1, 7));

        statsAlchemyLife.add(new StatsAlchemyLife("common", "sturdy", 1.1f, 11, 0, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "sturdy", 1.1f, 11, 60, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("rare", "sturdy", 1.1f, 11, 60, 2, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("epic", "sturdy", 1.1f, 11, 60, 2, 10));

        statsAlchemyLife.add(new StatsAlchemyLife("common", "sharp", 1.4f, 14, 0, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "sharp", 1.4f, 14, 75, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("rare", "sharp", 1.4f, 14, 75, 2, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("epic", "sharp", 1.4f, 14, 75, 2, 13));

        statsAlchemyLife.add(new StatsAlchemyLife("common", "resplendent", 1.7f, 17, 0, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "resplendent", 1.7f, 17, 90, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("rare", "resplendent", 1.7f, 17, 90, 2, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("epic", "resplendent", 1.7f, 17, 90, 2, 16));

        statsAlchemyLife.add(new StatsAlchemyLife("common", "splendid", 2f, 20, 0, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("uncommon", "splendid", 2f, 20, 105, 0, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("rare", "splendid", 2f, 20, 105, 3, 0));
        statsAlchemyLife.add(new StatsAlchemyLife("epic", "splendid", 2f, 20, 105, 3, 20));

        ArrayList<List> alchemyStonesStats = new ArrayList<>();

        alchemyStonesStats.add(new ArrayList(statsAlchemyDestruction));
        alchemyStonesStats.add(new ArrayList(statsAlchemyProtection));
        alchemyStonesStats.add(new ArrayList(statsAlchemyLife));

        ArrayList statsArrayDestruction = (ArrayList) alchemyStonesStats.get(0);
        ArrayList statsArrayProtection = (ArrayList) alchemyStonesStats.get(1);
        ArrayList statsArrayLife = (ArrayList) alchemyStonesStats.get(2);

        //stats destruction
        Object destructionCommonImperfect = statsArrayDestruction.get(0);
        Object destructionUncommonImperfect = statsArrayDestruction.get(1);
        Object destructionRareImperfect = statsArrayDestruction.get(2);
        Object destructionEpicImperfect = statsArrayDestruction.get(3);

        Object destructionCommonRough = statsArrayDestruction.get(4);
        Object destructionUncommonRough = statsArrayDestruction.get(5);
        Object destructionRareRough = statsArrayDestruction.get(6);
        Object destructionEpicRough = statsArrayDestruction.get(7);

        Object destructionCommonPolished = statsArrayDestruction.get(8);
        Object destructionUncommonPolished = statsArrayDestruction.get(9);
        Object destructionRarePolished = statsArrayDestruction.get(10);
        Object destructionEpicPolished = statsArrayDestruction.get(11);

        Object destructionCommonSturdy = statsArrayDestruction.get(0);
        Object destructionUncommonSturdy = statsArrayDestruction.get(1);
        Object destructionRareSturdy = statsArrayDestruction.get(2);
        Object destructionEpicSturdy = statsArrayDestruction.get(3);

        Object destructionCommonSharp = statsArrayDestruction.get(4);
        Object destructionUncommonSharp = statsArrayDestruction.get(5);
        Object destructionRareSharp = statsArrayDestruction.get(6);
        Object destructionEpicSharp = statsArrayDestruction.get(7);

        Object destructionCommonResplendent = statsArrayDestruction.get(8);
        Object destructionUncommonResplendent = statsArrayDestruction.get(9);
        Object destructionRareResplendent = statsArrayDestruction.get(10);
        Object destructionEpicResplendent = statsArrayDestruction.get(11);

        Object destructionCommonSplendid = statsArrayDestruction.get(12);
        Object destructionUncommonSplendid = statsArrayDestruction.get(13);
        Object destructionRareSplendid = statsArrayDestruction.get(14);
        Object destructionEpicSplendid = statsArrayDestruction.get(15);

        //stats protection
        Object protectionCommonImperfect = statsArrayProtection.get(0);
        Object protectionUncommonImperfect = statsArrayProtection.get(1);
        Object protectionRareImperfect = statsArrayProtection.get(2);
        Object protectionEpicImperfect = statsArrayProtection.get(3);

        Object protectionCommonRough = statsArrayProtection.get(4);
        Object protectionUncommonRough = statsArrayProtection.get(5);
        Object protectionRareRough = statsArrayProtection.get(6);
        Object protectionEpicRough = statsArrayProtection.get(7);

        Object protectionCommonPolished = statsArrayProtection.get(8);
        Object protectionUncommonPolished = statsArrayProtection.get(9);
        Object protectionRarePolished = statsArrayProtection.get(10);
        Object protectionEpicPolished = statsArrayProtection.get(11);

        Object protectionCommonSturdy = statsArrayProtection.get(0);
        Object protectionUncommonSturdy = statsArrayProtection.get(1);
        Object protectionRareSturdy = statsArrayProtection.get(2);
        Object protectionEpicSturdy = statsArrayProtection.get(3);

        Object protectionCommonSharp = statsArrayProtection.get(4);
        Object protectionUncommonSharp = statsArrayProtection.get(5);
        Object protectionRareSharp = statsArrayProtection.get(6);
        Object protectionEpicSharp = statsArrayProtection.get(7);

        Object protectionCommonResplendent = statsArrayProtection.get(8);
        Object protectionUncommonResplendent = statsArrayProtection.get(9);
        Object protectionRareResplendent = statsArrayProtection.get(10);
        Object protectionEpicResplendent = statsArrayProtection.get(11);

        Object protectionCommonSplendid = statsArrayProtection.get(12);
        Object protectionUncommonSplendid = statsArrayProtection.get(13);
        Object protectionRareSplendid = statsArrayProtection.get(14);
        Object protectionEpicSplendid = statsArrayProtection.get(15);

        //stats life
        Object lifeCommonImperfect = statsArrayLife.get(0);
        Object lifeUncommonImperfect = statsArrayLife.get(1);
        Object lifeRareImperfect = statsArrayLife.get(2);
        Object lifeEpicImperfect = statsArrayLife.get(3);

        Object lifeCommonRough = statsArrayLife.get(4);
        Object lifeUncommonRough = statsArrayLife.get(5);
        Object lifeRareRough = statsArrayLife.get(6);
        Object lifeEpicRough = statsArrayLife.get(7);

        Object lifeCommonPolished = statsArrayLife.get(8);
        Object lifeUncommonPolished = statsArrayLife.get(9);
        Object lifeRarePolished = statsArrayLife.get(10);
        Object lifeEpicPolished = statsArrayLife.get(11);

        Object lifeCommonSturdy = statsArrayLife.get(0);
        Object lifeUncommonSturdy = statsArrayLife.get(1);
        Object lifeRareSturdy = statsArrayLife.get(2);
        Object lifeEpicSturdy = statsArrayLife.get(3);

        Object lifeCommonSharp = statsArrayLife.get(4);
        Object lifeUncommonSharp = statsArrayLife.get(5);
        Object lifeRareSharp = statsArrayLife.get(6);
        Object lifeEpicSharp = statsArrayLife.get(7);

        Object lifeCommonResplendent = statsArrayLife.get(8);
        Object lifeUncommonResplendent = statsArrayLife.get(9);
        Object lifeRareResplendent = statsArrayLife.get(10);
        Object lifeEpicResplendent = statsArrayLife.get(11);

        Object lifeCommonSplendid = statsArrayLife.get(12);
        Object lifeUncommonSplendid = statsArrayLife.get(13);
        Object lifeRareSplendid = statsArrayLife.get(14);
        Object lifeEpicSplendid = statsArrayLife.get(15);

        //init alchemy stones
        alchemyStones = new ArrayList<>();

        //imperfect
        alchemyStones.add(new AlchemyStone("destruction", "Imperfect Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_imperfect, destructionCommonImperfect));
        alchemyStones.add(new AlchemyStone("destruction", "Imperfect Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_imperfect, destructionUncommonImperfect));
        alchemyStones.add(new AlchemyStone("destruction", "Imperfect Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_imperfect, destructionRareImperfect));
        alchemyStones.add(new AlchemyStone("destruction", "Imperfect Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_imperfect, destructionEpicImperfect));

        alchemyStones.add(new AlchemyStone("protection", "Imperfect Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_imperfect, protectionCommonImperfect));
        alchemyStones.add(new AlchemyStone("protection", "Imperfect Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_imperfect, protectionUncommonImperfect));
        alchemyStones.add(new AlchemyStone("protection", "Imperfect Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_imperfect, protectionRareImperfect));
        alchemyStones.add(new AlchemyStone("protection", "Imperfect Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_imperfect, protectionEpicImperfect));

        alchemyStones.add(new AlchemyStone("life", "Imperfect Alchemy Stone of Life", "common", R.drawable.alchemy_life_imperfect, lifeCommonImperfect));
        alchemyStones.add(new AlchemyStone("life", "Imperfect Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_imperfect, lifeUncommonImperfect));
        alchemyStones.add(new AlchemyStone("life", "Imperfect Alchemy Stone of Life", "rare", R.drawable.alchemy_life_imperfect, lifeRareImperfect));
        alchemyStones.add(new AlchemyStone("life", "Imperfect Alchemy Stone of Life", "epic", R.drawable.alchemy_life_imperfect, lifeEpicImperfect));

        //rough
        alchemyStones.add(new AlchemyStone("destruction", "Rough Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_rough, destructionCommonRough));
        alchemyStones.add(new AlchemyStone("destruction", "Rough Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_rough, destructionUncommonRough));
        alchemyStones.add(new AlchemyStone("destruction", "Rough Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_rough, destructionRareRough));
        alchemyStones.add(new AlchemyStone("destruction", "Rough Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_rough, destructionEpicRough));

        alchemyStones.add(new AlchemyStone("protection", "Rough Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_rough, protectionCommonRough));
        alchemyStones.add(new AlchemyStone("protection", "Rough Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_rough, protectionUncommonRough));
        alchemyStones.add(new AlchemyStone("protection", "Rough Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_rough, protectionRareRough));
        alchemyStones.add(new AlchemyStone("protection", "Rough Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_rough, protectionEpicRough));

        alchemyStones.add(new AlchemyStone("life", "Rough Alchemy Stone of Life", "common", R.drawable.alchemy_life_rough, lifeCommonRough));
        alchemyStones.add(new AlchemyStone("life", "Rough Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_rough, lifeUncommonRough));
        alchemyStones.add(new AlchemyStone("life", "Rough Alchemy Stone of Life", "rare", R.drawable.alchemy_life_rough, lifeRareRough));
        alchemyStones.add(new AlchemyStone("life", "Rough Alchemy Stone of Life", "epic", R.drawable.alchemy_life_rough, lifeEpicRough));

        //polished
        alchemyStones.add(new AlchemyStone("destruction", "Polished Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_polished, destructionCommonPolished));
        alchemyStones.add(new AlchemyStone("destruction", "Polished Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_polished, destructionUncommonPolished));
        alchemyStones.add(new AlchemyStone("destruction", "Polished Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_polished, destructionRarePolished));
        alchemyStones.add(new AlchemyStone("destruction", "Polished Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_polished, destructionEpicPolished));

        alchemyStones.add(new AlchemyStone("protection", "Polished Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_polished, protectionCommonPolished));
        alchemyStones.add(new AlchemyStone("protection", "Polished Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_polished, protectionUncommonPolished));
        alchemyStones.add(new AlchemyStone("protection", "Polished Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_polished, protectionRarePolished));
        alchemyStones.add(new AlchemyStone("protection", "Polished Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_polished, protectionEpicPolished));

        alchemyStones.add(new AlchemyStone("life", "Polished Alchemy Stone of Life", "common", R.drawable.alchemy_life_polished, lifeCommonPolished));
        alchemyStones.add(new AlchemyStone("life", "Polished Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_polished, lifeUncommonPolished));
        alchemyStones.add(new AlchemyStone("life", "Polished Alchemy Stone of Life", "rare", R.drawable.alchemy_life_polished, lifeRarePolished));
        alchemyStones.add(new AlchemyStone("life", "Polished Alchemy Stone of Life", "epic", R.drawable.alchemy_life_polished, lifeEpicPolished));

        //sturdy
        alchemyStones.add(new AlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_sturdy, destructionCommonSturdy));
        alchemyStones.add(new AlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_sturdy, destructionUncommonSturdy));
        alchemyStones.add(new AlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_sturdy, destructionRareSturdy));
        alchemyStones.add(new AlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_sturdy, destructionEpicSturdy));

        alchemyStones.add(new AlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_sturdy, protectionCommonSturdy));
        alchemyStones.add(new AlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_sturdy, protectionUncommonSturdy));
        alchemyStones.add(new AlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_sturdy, protectionRareSturdy));
        alchemyStones.add(new AlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_sturdy, protectionEpicSturdy));

        alchemyStones.add(new AlchemyStone("life", "Sturdy Alchemy Stone of Life", "common", R.drawable.alchemy_life_sturdy, lifeCommonSturdy));
        alchemyStones.add(new AlchemyStone("life", "Sturdy Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_sturdy, lifeUncommonSturdy));
        alchemyStones.add(new AlchemyStone("life", "Sturdy Alchemy Stone of Life", "rare", R.drawable.alchemy_life_sturdy, lifeRareSturdy));
        alchemyStones.add(new AlchemyStone("life", "Sturdy Alchemy Stone of Life", "epic", R.drawable.alchemy_life_sturdy, lifeEpicSturdy));

        //sharp
        alchemyStones.add(new AlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_sharp, destructionCommonSharp));
        alchemyStones.add(new AlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_sharp, destructionUncommonSharp));
        alchemyStones.add(new AlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_sharp, destructionRareSharp));
        alchemyStones.add(new AlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_sharp, destructionEpicSharp));

        alchemyStones.add(new AlchemyStone("protection", "Sharp Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_sharp, protectionCommonSharp));
        alchemyStones.add(new AlchemyStone("protection", "Sharp Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_sharp, protectionUncommonSharp));
        alchemyStones.add(new AlchemyStone("protection", "Sharp Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_sharp, protectionRareSharp));
        alchemyStones.add(new AlchemyStone("protection", "Sharp Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_sharp, protectionEpicSharp));

        alchemyStones.add(new AlchemyStone("life", "Sharp Alchemy Stone of Life", "common", R.drawable.alchemy_life_sharp, lifeCommonSharp));
        alchemyStones.add(new AlchemyStone("life", "Sharp Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_sharp, lifeUncommonSharp));
        alchemyStones.add(new AlchemyStone("life", "Sharp Alchemy Stone of Life", "rare", R.drawable.alchemy_life_sharp, lifeRareSharp));
        alchemyStones.add(new AlchemyStone("life", "Sharp Alchemy Stone of Life", "epic", R.drawable.alchemy_life_sharp, lifeEpicSharp));

        //resplendent
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_resplendent, destructionCommonResplendent));
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_resplendent, destructionUncommonResplendent));
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_resplendent, destructionRareResplendent));
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_resplendent, destructionEpicResplendent));

        alchemyStones.add(new AlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_resplendent, protectionCommonResplendent));
        alchemyStones.add(new AlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_resplendent, protectionUncommonResplendent));
        alchemyStones.add(new AlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_resplendent, protectionRareResplendent));
        alchemyStones.add(new AlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_resplendent, protectionEpicResplendent));

        alchemyStones.add(new AlchemyStone("life", "Resplendent Alchemy Stone of Life", "common", R.drawable.alchemy_life_resplendent, lifeCommonResplendent));
        alchemyStones.add(new AlchemyStone("life", "Resplendent Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_resplendent, lifeUncommonResplendent));
        alchemyStones.add(new AlchemyStone("life", "Resplendent Alchemy Stone of Life", "rare", R.drawable.alchemy_life_resplendent, lifeRareResplendent));
        alchemyStones.add(new AlchemyStone("life", "Resplendent Alchemy Stone of Life", "epic", R.drawable.alchemy_life_resplendent, lifeEpicResplendent));

        //splendid
        alchemyStones.add(new AlchemyStone("destruction", "Splendid Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_splendid, destructionCommonSplendid));
        alchemyStones.add(new AlchemyStone("destruction", "Splendid Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_splendid, destructionUncommonSplendid));
        alchemyStones.add(new AlchemyStone("destruction", "Splendid Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_splendid, destructionRareSplendid));
        alchemyStones.add(new AlchemyStone("destruction", "Splendid Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_splendid, destructionEpicSplendid));

        alchemyStones.add(new AlchemyStone("protection", "Splendid Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_splendid, protectionCommonSplendid));
        alchemyStones.add(new AlchemyStone("protection", "Splendid Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_splendid, protectionUncommonSplendid));
        alchemyStones.add(new AlchemyStone("protection", "Splendid Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_splendid, protectionRareSplendid));
        alchemyStones.add(new AlchemyStone("protection", "Splendid Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_splendid, protectionEpicSplendid));

        alchemyStones.add(new AlchemyStone("life", "Splendid Alchemy Stone of Life", "common", R.drawable.alchemy_life_splendid, lifeCommonSplendid));
        alchemyStones.add(new AlchemyStone("life", "Splendid Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_splendid, lifeUncommonSplendid));
        alchemyStones.add(new AlchemyStone("life", "Splendid Alchemy Stone of Life", "rare", R.drawable.alchemy_life_splendid, lifeRareSplendid));
        alchemyStones.add(new AlchemyStone("life", "Splendid Alchemy Stone of Life", "epic", R.drawable.alchemy_life_splendid, lifeEpicSplendid));
    }

    private void initRings() {
        rings = new ArrayList<>();
        rings.add(new Accessory("ring", "Yuria Ring", "uncommon", R.drawable.ring_uncommon_yuria, 0, 0, 0, 0, 0));
        rings.add(new Accessory("ring", "Bares Ring", "uncommon", R.drawable.ring_uncommon_bares, 2, 0, 0, 1, 0));
        rings.add(new Accessory("ring", "Hesus Ring", "uncommon", R.drawable.ring_uncommon_hesus, 0, 1, 0, 0, 1));
        rings.add(new Accessory("ring", "Ring of Crescent Guardian", "epic", R.drawable.ring_epic_crescent_guardian, 5, 0, 0, 3, 0));
        rings.add(new Accessory("ring", "Ring of Cadry Guardian", "epic", R.drawable.ring_epic_cadry_guardian, 0, 5, 0, 0, 3));
        rings.add(new Accessory("ring", "Topaz Ring of Regeneration", "epic", R.drawable.ring_epic_topaz_of_regeneration, 0, 0, 0, 0, 0));
        rings.add(new Accessory("ring", "Emerald Ring of Tranquility", "epic", R.drawable.ring_epic_emerald_of_tranquility, 0, 0, 0, 0, 0));
    }

    private void initEarrings() {
        earrings = new ArrayList<>();
        earrings.add(new Accessory("earring", "Yuria Earring", "uncommon", R.drawable.earring_uncommon_yuria, 0, 0, 0, 0, 0));
        earrings.add(new Accessory("earring", "Bares Earring", "uncommon", R.drawable.earring_uncommon_bares, 2, 0, 0, 1, 0));
        earrings.add(new Accessory("earring", "Jarette's Earring", "rare", R.drawable.earring_rare_jarettes, 4, 0, 0, 0, 0));
        earrings.add(new Accessory("earring", "Ridell Earring", "rare", R.drawable.earring_rare_ridell, 0, 5, 0, 0, 1));
        earrings.add(new Accessory("earring", "Fugitive Khalk's Earring", "rare", R.drawable.earring_rare_fugitive_khalks, 5, 0, 0, 2, 0));
        earrings.add(new Accessory("earring", "Blue Coral Earring", "rare", R.drawable.earring_rare_blue_coral, 4, 0, 0, 2, 0));
        earrings.add(new Accessory("earring", "Red Coral Earring", "rare", R.drawable.earring_rare_red_coral, 2, 0, 0, 2, 0));
        earrings.add(new Accessory("earring", "Tungrad Earring", "epic", R.drawable.earring_epic_tungrad, 7, 0, 0, 2, 0));
        earrings.add(new Accessory("earring", "Dark Blood Ruby Earring", "rare", R.drawable.earring_rare_dark_blood_ruby, 4, 0, 0, 0, 0));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_gear, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.menu_gear_settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_gear_about:
                Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View view) {

        Intent intentAccessoryChoose = new Intent(this, ItemAccessoryChooseActivity.class);
        Intent intentAlchemyStoneChoose = new Intent(this, ItemAlchemyStoneChooseActivity.class);

        switch (view.getId()) {
            case R.id.view_alchemy_stone:
                intentAlchemyStoneChoose.putExtra("alchemyStones", alchemyStones);
                startActivityForResult(intentAlchemyStoneChoose, REQUEST_CODE_ALCHEMY_STONE);
                break;
            case R.id.view_earring1:
                intentAccessoryChoose.putExtra("accessoryArray", earrings);
                startActivityForResult(intentAccessoryChoose, REQUEST_CODE_EARRING1);
                break;
            case R.id.view_earring2:
                intentAccessoryChoose.putExtra("accessoryArray", earrings);
                startActivityForResult(intentAccessoryChoose, REQUEST_CODE_EARRING2);
                break;
            case R.id.view_ring1:
                intentAccessoryChoose.putExtra("accessoryArray", rings);
                startActivityForResult(intentAccessoryChoose, REQUEST_CODE_RING1);
                break;
            case R.id.view_ring2:
                intentAccessoryChoose.putExtra("accessoryArray", rings);
                startActivityForResult(intentAccessoryChoose, REQUEST_CODE_RING2);
                break;
            case R.id.view_belt:
                intentAccessoryChoose.putExtra("accessoryArray", belts);
                startActivityForResult(intentAccessoryChoose, REQUEST_CODE_BELT);
                break;
            case R.id.view_necklace:
                intentAccessoryChoose.putExtra("accessoryArray", necklaces);
                startActivityForResult(intentAccessoryChoose, REQUEST_CODE_NECKLACE);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (data == null) {
            return;
        }

        if (resultCode == RESULT_OK) {

            switch (requestCode) {
                case REQUEST_CODE_ALCHEMY_STONE:
                    alchemyInit(data);
                    rarityResource = rarityCheck(rarity);
                    viewAlchemyStone.setBackgroundResource(rarityResource);
                    viewAlchemyStone.setImageResource(icon);

                    alchemyStoneType = alchemyStone.type;
                    switch (alchemyStoneType) {
                        case "destruction":
                            statsDestr = (StatsAlchemyDestruction) alchemyStone.stats;
                            break;
                        case "protection":
                            statsProt = (StatsAlchemyProtection) alchemyStone.stats;
                            break;
                        case "life":
                            statsLife = (StatsAlchemyLife) alchemyStone.stats;
                            break;
                    }
                    gear.set(0, alchemyStone);
                    checkAlchemy.setEnabled(true);
                    checkAlchemy.setChecked(false);
                    break;
                case REQUEST_CODE_EARRING1:
                    accessoryInit(data);
                    rarityResource = rarityCheck(rarity);
                    viewEarring1.setBackgroundResource(rarityResource);
                    viewEarring1.setImageResource(icon);
                    viewEarring1enhLvl.setImageResource(enhLvl);
                    gear.set(6, accessory);
                    apArray[6] = ap;
                    dpArray[6] = dp;
                    break;
                case REQUEST_CODE_EARRING2:
                    accessoryInit(data);
                    rarityResource = rarityCheck(rarity);
                    viewEarring2.setBackgroundResource(rarityResource);
                    viewEarring2.setImageResource(icon);
                    viewEarring2enhLv1.setImageResource(enhLvl);
                    gear.set(5, accessory);
                    apArray[5] = ap;
                    dpArray[5] = dp;
                    break;
                case REQUEST_CODE_RING1:
                    accessoryInit(data);
                    rarityResource = rarityCheck(rarity);
                    viewRing1.setBackgroundResource(rarityResource);
                    viewRing1.setImageResource(icon);
                    viewRing1enhLvl.setImageResource(enhLvl);
                    gear.set(9, accessory);
                    apArray[9] = ap;
                    dpArray[9] = dp;
                    break;
                case REQUEST_CODE_RING2:
                    accessoryInit(data);
                    rarityResource = rarityCheck(rarity);
                    viewRing2.setBackgroundResource(rarityResource);
                    viewRing2.setImageResource(icon);
                    viewRing2enhLvl.setImageResource(enhLvl);
                    gear.set(10, accessory);
                    apArray[10] = ap;
                    dpArray[10] = dp;
                    break;
                case REQUEST_CODE_BELT:
                    accessoryInit(data);
                    viewBelt.setImageResource(icon);
                    apArray[3] = ap;
                    dpArray[3] = dp;
                    break;
                case REQUEST_CODE_NECKLACE:
                    accessoryInit(data);
                    viewNecklace.setImageResource(icon);
                    apArray[12] = ap;
                    dpArray[12] = dp;
                    break;
            }
        } else {

            Toast.makeText(this, "Clear", Toast.LENGTH_SHORT).show();

            switch (requestCode) {
                case REQUEST_CODE_ALCHEMY_STONE:
                    viewAlchemyStone.setImageResource(R.drawable.alchemy_placeholder);
                    viewAlchemyStone.setBackgroundResource(R.drawable.outline_default);
                    gear.set(0, null);
                    if (checkAlchemy.isChecked()) {
                        checkAlchemy.setChecked(false);
                    }
                    checkAlchemy.setEnabled(false);
                    break;
                case REQUEST_CODE_EARRING1:
                    viewEarring1.setImageResource(R.drawable.earring_placeholder);
                    viewEarring1.setBackgroundResource(R.drawable.outline_default);
                    viewEarring1enhLvl.setImageResource(0);
                    gear.set(6, null);
                    apArray[6] = 0;
                    dpArray[6] = 0;
                    break;
                case REQUEST_CODE_EARRING2:
                    viewEarring2.setImageResource(R.drawable.earring_placeholder);
                    viewEarring2.setBackgroundResource(R.drawable.outline_default);
                    viewEarring2enhLv1.setImageResource(0);
                    gear.set(5, null);
                    apArray[5] = 0;
                    dpArray[5] = 0;
                    break;
                case REQUEST_CODE_RING1:
                    viewRing1.setImageResource(R.drawable.ring_placeholder);
                    viewRing1.setBackgroundResource(R.drawable.outline_default);
                    viewRing1enhLvl.setImageResource(0);
                    gear.set(9, null);
                    apArray[9] = 0;
                    dpArray[9] = 0;
                    break;
                case REQUEST_CODE_RING2:
                    viewRing2.setImageResource(R.drawable.ring_placeholder);
                    viewRing2.setBackgroundResource(R.drawable.outline_default);
                    viewRing2enhLvl.setImageResource(0);
                    gear.set(10, null);
                    apArray[10] = 0;
                    dpArray[10] = 0;
                    break;
            }
        }
        gearScore();

//        gearScore2();
    }

    private void gearScore2() {
        Object objAwakening = gear.get(1);
        Object objMain = gear.get(2);
        Object objBelt = gear.get(3);
        Object objShoes = gear.get(4);
        Object objEarring2 = gear.get(5);
        Object objEarring1 = gear.get(6);
        Object objHelmet = gear.get(7);
        Object objArmor = gear.get(8);
        Object objRing1 = gear.get(9);
        Object objRing2 = gear.get(10);
        Object objGloves = gear.get(11);
        Object objNecklace = gear.get(12);
        Object objSecondary = gear.get(13);

        Accessory ring1 = (Accessory) objRing1;
        Accessory ring2 = (Accessory) objRing2;
        int apRing1 = ring1.ap;
        int dpRing1 = ring1.dp;

    }

    private void accessoryInit(Intent data) {
        accessory = (Accessory) data.getSerializableExtra("accessoryName");
        icon = accessory.icon;
        ap = accessory.ap;
        dp = accessory.dp;
        enhLvl = enhLvl(accessory.enhLVL);
        rarity = accessory.rarity;
    }

    private void alchemyInit(Intent data) {
        alchemyStone = (AlchemyStone) data.getSerializableExtra("alchemyName");
        icon = alchemyStone.icon;
        rarity = alchemyStone.rarity;
    }

    private int enhLvl(int enhLvl) {

        switch (enhLvl) {
            case 0:
                break;
            case 1:
                enhLvl = R.drawable.image_pri;
                break;
            case 2:
                enhLvl = R.drawable.image_duo;
                break;
            case 3:
                enhLvl = R.drawable.image_tri;
                break;
            case 4:
                enhLvl = R.drawable.image_tet;
                break;
            case 5:
                enhLvl = R.drawable.image_pen;
                break;
        }

        return enhLvl;
    }

    private int rarityCheck(String rarity) {

        switch (rarity) {
            case "common":
                rarityValue = R.drawable.outline_common;
                break;
            case "uncommon":
                rarityValue = R.drawable.outline_uncommon;
                break;
            case "rare":
                rarityValue = R.drawable.outline_rare;
                break;
            case "epic":
                rarityValue = R.drawable.outline_epic;
                break;
        }
        return rarityValue;
    }

    private void gearScore() {

        awaSum = 0;
        for (int i = 0; i < 13; i++) {
            awaSum = awaSum + apArray[i];
        }
        awaSum = awaSum - apArray[2];
        viewAwaAP.setText("" + awaSum);

        apSum = 0;
        for (int i = 0; i < 13; i++) {
            apSum = apSum + apArray[i];
        }
        apSum = apSum - apArray[1];
        viewAP.setText("" + apSum);

        dpSum = 0;
        for (int i = 0; i < 13; i++) {
            dpSum = dpSum + dpArray[i];
        }
        viewDP.setText("" + dpSum);

        //make awakening ap
        //count GS as awaAP + DP

        if (awaSum == 0) {
            gs = apSum + dpSum;
        } else {
            gs = awaSum + dpSum;
        }

        viewGS.setText("" + gs);

    }

}
