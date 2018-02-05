package wie.wiggle.testplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class GearActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<Accessory> earrings;
    private ArrayList<Accessory> rings;
    private ArrayList<Accessory> belts;
    private ArrayList<Accessory> necklaces;

    private ArrayList<AlchemyStone> alchemyStones;

    private static final int REQUEST_CODE_RING1 = 1;
    private static final int REQUEST_CODE_RING2 = 2;
    private static final int REQUEST_CODE_EARRING1 = 3;
    private static final int REQUEST_CODE_EARRING2 = 4;
    private static final int REQUEST_CODE_BELT = 5;
    private static final int REQUEST_CODE_NECKLACE = 6;
    private static final int REQUEST_CODE_ALCHEMY_STONE = 7;
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

    Accessory accessory;
    AlchemyStone alchemyStone;

    private int[] apArray = new int[13];
    private int[] dpArray = new int[13];

    private android.support.v7.widget.Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gear);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        classIcon = (ImageView) findViewById(R.id.view_class_icon);
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

        Character person = getIntent().getParcelableExtra("class");

        classIcon.setImageResource(person.icon);

        //earrings
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

        //rings
        rings = new ArrayList<>();
        rings.add(new Accessory("ring", "Yuria Ring", "uncommon", R.drawable.ring_uncommon_yuria, 0, 0, 0, 0, 0));
        rings.add(new Accessory("ring", "Bares Ring", "uncommon", R.drawable.ring_uncommon_bares, 2, 0, 0, 1, 0));
        rings.add(new Accessory("ring", "Hesus Ring", "uncommon", R.drawable.ring_uncommon_hesus, 0, 1, 0, 0, 1));
        rings.add(new Accessory("ring", "Ring of Crescent Guardian", "epic", R.drawable.ring_epic_crescent_guardian, 5, 0, 0, 3, 0));
        rings.add(new Accessory("ring", "Ring of Cadry Guardian", "epic", R.drawable.ring_epic_cadry_guardian, 0, 5, 0, 0, 3));
        rings.add(new Accessory("ring", "Topaz Ring of Regeneration", "epic", R.drawable.ring_epic_topaz_of_regeneration, 0, 0, 0, 0, 0));
        rings.add(new Accessory("ring", "Emerald Ring of Tranquility", "epic", R.drawable.ring_epic_emerald_of_tranquility, 0, 0, 0, 0, 0));

        //belts
        belts = new ArrayList<>();

        //necklaces
        necklaces = new ArrayList<>();

        //alchemy stones
        alchemyStones = new ArrayList<>();
        //sturdy
        alchemyStones.add(new AlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_sturdy));
        alchemyStones.add(new AlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_sturdy));
        alchemyStones.add(new AlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_sturdy));
        alchemyStones.add(new AlchemyStone("destruction", "Sturdy Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_sturdy));

        alchemyStones.add(new AlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_sturdy));
        alchemyStones.add(new AlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_sturdy));
        alchemyStones.add(new AlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_sturdy));
        alchemyStones.add(new AlchemyStone("protection", "Sturdy Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_sturdy));

        alchemyStones.add(new AlchemyStone("life", "Sturdy Alchemy Stone of Life", "common", R.drawable.alchemy_life_sturdy));
        alchemyStones.add(new AlchemyStone("life", "Sturdy Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_sturdy));
        alchemyStones.add(new AlchemyStone("life", "Sturdy Alchemy Stone of Life", "rare", R.drawable.alchemy_life_sturdy));
        alchemyStones.add(new AlchemyStone("life", "Sturdy Alchemy Stone of Life", "epic", R.drawable.alchemy_life_sturdy));

        //sharp
        alchemyStones.add(new AlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_sharp));
        alchemyStones.add(new AlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_sharp));
        alchemyStones.add(new AlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_sharp));
        alchemyStones.add(new AlchemyStone("destruction", "Sharp Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_sharp));

        alchemyStones.add(new AlchemyStone("protection", "Sharp Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_sharp));
        alchemyStones.add(new AlchemyStone("protection", "Sharp Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_sharp));
        alchemyStones.add(new AlchemyStone("protection", "Sharp Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_sharp));
        alchemyStones.add(new AlchemyStone("protection", "Sharp Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_sharp));

        alchemyStones.add(new AlchemyStone("life", "Sharp Alchemy Stone of Life", "common", R.drawable.alchemy_life_sharp));
        alchemyStones.add(new AlchemyStone("life", "Sharp Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_sharp));
        alchemyStones.add(new AlchemyStone("life", "Sharp Alchemy Stone of Life", "rare", R.drawable.alchemy_life_sharp));
        alchemyStones.add(new AlchemyStone("life", "Sharp Alchemy Stone of Life", "epic", R.drawable.alchemy_life_sharp));

        //resplendent
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_resplendent));
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_resplendent));
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_resplendent));
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_resplendent));

        alchemyStones.add(new AlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_resplendent));
        alchemyStones.add(new AlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_resplendent));
        alchemyStones.add(new AlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_resplendent));
        alchemyStones.add(new AlchemyStone("protection", "Resplendent Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_resplendent));

        alchemyStones.add(new AlchemyStone("life", "Resplendent Alchemy Stone of Life", "common", R.drawable.alchemy_life_resplendent));
        alchemyStones.add(new AlchemyStone("life", "Resplendent Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_resplendent));
        alchemyStones.add(new AlchemyStone("life", "Resplendent Alchemy Stone of Life", "rare", R.drawable.alchemy_life_resplendent));
        alchemyStones.add(new AlchemyStone("life", "Resplendent Alchemy Stone of Life", "epic", R.drawable.alchemy_life_resplendent));

        //splendid
        alchemyStones.add(new AlchemyStone("destruction", "Splendid Alchemy Stone of Destruction", "common", R.drawable.alchemy_destuction_splendid));
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "uncommon", R.drawable.alchemy_destuction_splendid));
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "rare", R.drawable.alchemy_destuction_splendid));
        alchemyStones.add(new AlchemyStone("destruction", "Resplendent Alchemy Stone of Destruction", "epic", R.drawable.alchemy_destuction_splendid));

        alchemyStones.add(new AlchemyStone("protection", "Splendid Alchemy Stone of Protection", "common", R.drawable.alchemy_protection_splendid));
        alchemyStones.add(new AlchemyStone("protection", "Splendid Alchemy Stone of Protection", "uncommon", R.drawable.alchemy_protection_splendid));
        alchemyStones.add(new AlchemyStone("protection", "Splendid Alchemy Stone of Protection", "rare", R.drawable.alchemy_protection_splendid));
        alchemyStones.add(new AlchemyStone("protection", "Splendid Alchemy Stone of Protection", "epic", R.drawable.alchemy_protection_splendid));

        alchemyStones.add(new AlchemyStone("life", "Splendid Alchemy Stone of Life", "common", R.drawable.alchemy_life_splendid));
        alchemyStones.add(new AlchemyStone("life", "Splendid Alchemy Stone of Life", "uncommon", R.drawable.alchemy_life_splendid));
        alchemyStones.add(new AlchemyStone("life", "Splendid Alchemy Stone of Life", "rare", R.drawable.alchemy_life_splendid));
        alchemyStones.add(new AlchemyStone("life", "Splendid Alchemy Stone of Life", "epic", R.drawable.alchemy_life_splendid));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id) {
            case R.id.menu_settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_about:
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
                    break;
                case REQUEST_CODE_EARRING1:
                    accessoryInit(data);
                    rarityResource = rarityCheck(rarity);
                    viewEarring1.setBackgroundResource(rarityResource);
                    viewEarring1.setImageResource(icon);
                    viewEarring1enhLvl.setImageResource(enhLvl);
                    apArray[11] = ap;
                    dpArray[11] = dp;
                    break;
                case REQUEST_CODE_EARRING2:
                    accessoryInit(data);
                    rarityResource = rarityCheck(rarity);
                    viewEarring2.setBackgroundResource(rarityResource);
                    viewEarring2.setImageResource(icon);
                    viewEarring2enhLv1.setImageResource(enhLvl);
                    apArray[10] = ap;
                    dpArray[10] = dp;
                    break;
                case REQUEST_CODE_RING1:
                    accessoryInit(data);
                    rarityResource = rarityCheck(rarity);
                    viewRing1.setBackgroundResource(rarityResource);
                    viewRing1.setImageResource(icon);
                    viewRing1enhLvl.setImageResource(enhLvl);
                    apArray[1] = ap;
                    dpArray[1] = dp;
                    break;
                case REQUEST_CODE_RING2:
                    accessoryInit(data);
                    rarityResource = rarityCheck(rarity);
                    viewRing2.setBackgroundResource(rarityResource);
                    viewRing2.setImageResource(icon);
                    viewRing2enhLvl.setImageResource(enhLvl);
                    apArray[2] = ap;
                    dpArray[2] = dp;
                    break;
                case REQUEST_CODE_BELT:
                    accessoryInit(data);
                    viewBelt.setImageResource(icon);
                    apArray[8] = ap;
                    dpArray[8] = dp;
                    break;
                case REQUEST_CODE_NECKLACE:
                    accessoryInit(data);
                    viewNecklace.setImageResource(icon);
                    apArray[4] = ap;
                    dpArray[4] = dp;
                    break;
            }
        } else {

            Toast.makeText(this, "Clear", Toast.LENGTH_SHORT).show();

            switch (requestCode) {
                case REQUEST_CODE_ALCHEMY_STONE:
                    viewAlchemyStone.setImageResource(R.drawable.alchemy_placeholder);
                    viewAlchemyStone.setBackgroundResource(R.drawable.outline_default);
                    break;
                case REQUEST_CODE_EARRING1:
                    viewEarring1.setImageResource(R.drawable.earring_placeholder);
                    viewEarring1.setBackgroundResource(R.drawable.outline_default);
                    viewEarring1enhLvl.setImageResource(0);
                    apArray[11] = 0;
                    dpArray[11] = 0;
                    break;
                case REQUEST_CODE_EARRING2:
                    viewEarring2.setImageResource(R.drawable.earring_placeholder);
                    viewEarring2.setBackgroundResource(R.drawable.outline_default);
                    viewEarring2enhLv1.setImageResource(0);
                    apArray[10] = 0;
                    dpArray[10] = 0;
                    break;
                case REQUEST_CODE_RING1:
                    viewRing1.setImageResource(R.drawable.ring_placeholder);
                    viewRing1.setBackgroundResource(R.drawable.outline_default);
                    viewRing1enhLvl.setImageResource(0);
                    apArray[1] = 0;
                    dpArray[1] = 0;
                    break;
                case REQUEST_CODE_RING2:
                    viewRing2.setImageResource(R.drawable.ring_placeholder);
                    viewRing2.setBackgroundResource(R.drawable.outline_default);
                    viewRing2enhLvl.setImageResource(0);
                    apArray[2] = 0;
                    dpArray[2] = 0;
                    break;
            }
        }
        gearScore();
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

        apSum = 0;
        for (int i = 0; i < 13; i++) {
            apSum = apSum + apArray[i];
        }
        viewAP.setText("" + apSum);
        viewAwaAP.setText("" + apSum);

        dpSum = 0;
        for (int i = 0; i < 13; i++) {
            dpSum = dpSum + dpArray[i];
        }
        viewDP.setText("" + dpSum);

        //make awakening ap
        //count GS as awaAP + DP

        gs = apSum + dpSum;

        viewGS.setText("" + gs);

    }

}
