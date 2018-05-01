package wie.wiggle.testplanner;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
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

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class GearActivity extends AppCompatActivity implements View.OnClickListener, View.OnLongClickListener {

    private ArrayList<ItemAccessory> earrings;
    private ArrayList<ItemAccessory> rings;
    private ArrayList<ItemAccessory> belts;
    private ArrayList<ItemAccessory> necklaces;
    private ArrayList<ItemAlchemyStone> alchemyStones;
    private ArrayList<StatsAlchemyDestruction> adStatsDestruction;
    private ArrayList<StatsAlchemyProtection> adStatsProtection;
    private ArrayList<StatsAlchemyLife> adStatsLife;

    private ArrayList<ItemAwakeningWeapon> awakeningWeapons;
    private ArrayList<ItemAwakeningWeapon> awakeningWeaponsCopy;

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

    //item_effects
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

    private ItemAccessory accessory;
    private ItemAlchemyStone alchemyStone;
    private ItemAwakeningWeapon awakeningWeapon;

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

    //showing alert dialog
    TextView adTest;
    TextView adValueHiddenAP;
    TextView adValueAccuracy;
    TextView adValueIgnoreResistance;
    TextView adValueAttackSpeed;
    TextView adValueCastingSpeed;

    private Character character;

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

        alchemyStoneType = "default";

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
        viewAlchemyStone.setOnLongClickListener(this);

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

        character = getIntent().getParcelableExtra("class");

        classIcon.setImageResource(character.icon);
//        className.setText(character.name);

//        alchemyStones = new InitializingAlchemyStones().initializeAlchemyStones();

        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<ItemAlchemyStone>>() {
        }.getType();
        alchemyStones = gson.fromJson(new InputStreamReader(getResources().openRawResource(R.raw.test)), type);

//        try {
//            JSONObject object = new JSONObject("test.json");
//            JSONArray array = object.getJSONArray("item_effects");
//            ArrayList arrayList = new ArrayList();
//            for (int i = 0; i < array.length(); i++) {
//                arrayList.add(array.getJSONObject(i).getString("hiddenAp"));
//            }
//            getClass();
//        } catch (JSONException e) {
//        }


        awakeningWeapons = new InitializingAwakeningWeapons().initializeAwakeningWeapons();
        awakeningWeaponsCopy = new InitializingAwakeningWeapons().initializeAwakeningWeapons();

        initEarrings();
        initRings();
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

    private void initRings() {
        rings = new ArrayList<>();
        rings.add(new ItemAccessory("ring", "Yuria Ring", "uncommon", R.drawable.ring_uncommon_yuria, 0, 0, 0, 0, 0));
        rings.add(new ItemAccessory("ring", "Bares Ring", "uncommon", R.drawable.ring_uncommon_bares, 2, 0, 0, 1, 0));
        rings.add(new ItemAccessory("ring", "Hesus Ring", "uncommon", R.drawable.ring_uncommon_hesus, 0, 1, 0, 0, 1));
        rings.add(new ItemAccessory("ring", "Ring of Crescent Guardian", "epic", R.drawable.ring_epic_crescent_guardian, 5, 0, 0, 3, 0));
        rings.add(new ItemAccessory("ring", "Ring of Cadry Guardian", "epic", R.drawable.ring_epic_cadry_guardian, 0, 5, 0, 0, 3));
        rings.add(new ItemAccessory("ring", "Topaz Ring of Regeneration", "epic", R.drawable.ring_epic_topaz_of_regeneration, 0, 0, 0, 0, 0));
        rings.add(new ItemAccessory("ring", "Emerald Ring of Tranquility", "epic", R.drawable.ring_epic_emerald_of_tranquility, 0, 0, 0, 0, 0));
    }

    private void initEarrings() {
        earrings = new ArrayList<>();
        earrings.add(new ItemAccessory("earring", "Yuria Earring", "uncommon", R.drawable.earring_uncommon_yuria, 0, 0, 0, 0, 0));
        earrings.add(new ItemAccessory("earring", "Bares Earring", "uncommon", R.drawable.earring_uncommon_bares, 2, 0, 0, 1, 0));
        earrings.add(new ItemAccessory("earring", "Jarette's Earring", "rare", R.drawable.earring_rare_jarettes, 4, 0, 0, 0, 0));
        earrings.add(new ItemAccessory("earring", "Ridell Earring", "rare", R.drawable.earring_rare_ridell, 0, 5, 0, 0, 1));
        earrings.add(new ItemAccessory("earring", "Fugitive Khalk's Earring", "rare", R.drawable.earring_rare_fugitive_khalks, 5, 0, 0, 2, 0));
        earrings.add(new ItemAccessory("earring", "Blue Coral Earring", "rare", R.drawable.earring_rare_blue_coral, 4, 0, 0, 2, 0));
        earrings.add(new ItemAccessory("earring", "Red Coral Earring", "rare", R.drawable.earring_rare_red_coral, 2, 0, 0, 2, 0));
        earrings.add(new ItemAccessory("earring", "Tungrad Earring", "epic", R.drawable.earring_epic_tungrad, 7, 0, 0, 2, 0));
        earrings.add(new ItemAccessory("earring", "Dark Blood Ruby Earring", "rare", R.drawable.earring_rare_dark_blood_ruby, 4, 0, 0, 0, 0));
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
        Intent intentAwakeningChoose = new Intent(this, ItemAwakeningWeaponChooseActivity.class);

        switch (view.getId()) {
            case R.id.view_alchemy_stone:
                intentAlchemyStoneChoose.putExtra("alchemyStones", alchemyStones);
                startActivityForResult(intentAlchemyStoneChoose, REQUEST_CODE_ALCHEMY_STONE);
                break;
            case R.id.view_awakening_weapon:
                awakeningWeaponsCopy.clear();
                for (int i = 0; i < awakeningWeapons.size(); i++) {
                    if (awakeningWeapons.get(i).className.equals(character.name)) {
                        awakeningWeaponsCopy.add(awakeningWeapons.get(i));
                    }
                }
                intentAwakeningChoose.putExtra("awakeningWeapons", awakeningWeaponsCopy);
                getClass();
                startActivityForResult(intentAwakeningChoose, REQUEST_CODE_AWAKENING_WEAPON);
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
    public boolean onLongClick(View view) {

        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        View v = getLayoutInflater().inflate(R.layout.dialog_alchemy_stone, null);
        AlertDialogAlchemyShow adas = new AlertDialogAlchemyShow();

        switch (alchemyStoneType) {
            case "destruction":
                Toast.makeText(this, "destruction", Toast.LENGTH_SHORT).show();
                adas.showStatsDestruction(alchemyStone, v);
                adb.setView(v);
                adb.create().show();
                break;
            case "protection":
                Toast.makeText(this, "protection", Toast.LENGTH_SHORT).show();
                adas.showStatsProtection(alchemyStone, v);
                adb.setView(v);
                adb.create().show();
                break;
            case "life":
                Toast.makeText(this, "life", Toast.LENGTH_SHORT).show();
                adas.showStatsLife(alchemyStone, v);
                adb.setView(v);
                adb.create().show();
                break;
            case "default":
                Toast.makeText(this, "choose alchemy stone", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
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
                            statsDestr = (StatsAlchemyDestruction) alchemyStone.item_effects;
                            break;
                        case "protection":
                            statsProt = (StatsAlchemyProtection) alchemyStone.item_effects;
                            break;
                        case "life":
                            statsLife = (StatsAlchemyLife) alchemyStone.item_effects;
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
                    alchemyStoneType = "default";
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

        ItemAccessory ring1 = (ItemAccessory) objRing1;
        ItemAccessory ring2 = (ItemAccessory) objRing2;
        int apRing1 = ring1.ap;
        int dpRing1 = ring1.dp;

    }

    private void accessoryInit(Intent data) {
        accessory = (ItemAccessory) data.getSerializableExtra("accessoryName");
        icon = accessory.icon;
        ap = accessory.ap;
        dp = accessory.dp;
        enhLvl = enhLvl(accessory.enhLVL);
        rarity = accessory.rarity;
    }

    private void alchemyInit(Intent data) {
        alchemyStone = (ItemAlchemyStone) data.getSerializableExtra("alchemyName");
//        icon = alchemyStone.icon;
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

        //make awakening ap1
        //count GS as awaAP + DP

        if (awaSum == 0) {
            gs = apSum + dpSum;
        } else {
            gs = awaSum + dpSum;
        }

        viewGS.setText("" + gs);

    }


}
