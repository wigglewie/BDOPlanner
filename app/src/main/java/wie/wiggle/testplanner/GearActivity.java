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

    private static final int REQUEST_CODE_RING1 = 1;
    private static final int REQUEST_CODE_RING2 = 2;
    private static final int REQUEST_CODE_EARRING1 = 3;
    private static final int REQUEST_CODE_EARRING2 = 4;
    private static final int REQUEST_CODE_BELT = 5;
    private static final int REQUEST_CODE_NECKLACE = 6;
    private ImageView classIcon;
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

    private ImageView viewEarring1enchLvl;
    private ImageView viewEarring2enchLv1;
    private ImageView viewRing1enchLvl;
    private ImageView viewRing2enchLvl;

    private int apSum;
    private int dpSum;
    private int gs;

    private int rarityValue;

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

        viewEarring1enchLvl = (ImageView) findViewById(R.id.view_earring1_enchLvl);
        viewEarring2enchLv1 = (ImageView) findViewById(R.id.view_earring2_enchLvl);
        viewRing1enchLvl = (ImageView) findViewById(R.id.view_ring1_enchLvl);
        viewRing2enchLvl = (ImageView) findViewById(R.id.view_ring2_enchLvl);


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

        rings = new ArrayList<>();
        rings.add(new Accessory("ring", "Yuria Ring", "uncommon", R.drawable.ring_uncommon_yuria, 0, 0, 0, 0, 0));
        rings.add(new Accessory("ring", "Bares Ring", "uncommon", R.drawable.ring_uncommon_bares, 2, 0, 0, 1, 0));
        rings.add(new Accessory("ring", "Hesus Ring", "uncommon", R.drawable.ring_uncommon_hesus, 0, 1, 0, 0, 1));
        rings.add(new Accessory("ring", "Ring of Crescent Guardian", "epic", R.drawable.ring_epic_crescent_guardian, 5, 0, 0, 3, 0));
        rings.add(new Accessory("ring", "Ring of Cadry Guardian", "epic", R.drawable.ring_epic_cadry_guardian, 0, 5, 0, 0, 3));
        rings.add(new Accessory("ring", "Topaz Ring of Regeneration", "epic", R.drawable.ring_epic_topaz_of_regeneration, 0, 0, 0, 0, 0));
        rings.add(new Accessory("ring", "Emerald Ring of Tranquility", "epic", R.drawable.ring_epic_emerald_of_tranquility, 0, 0, 0, 0, 0));


        belts = new ArrayList<>();

        necklaces = new ArrayList<>();


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
                return true;
            case R.id.menu_about:
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

        Intent intent = new Intent(this, ItemGearChooseActivity.class);

        switch (view.getId()) {
            case R.id.view_earring1:
                intent.putExtra("accessoryArray", earrings);
                startActivityForResult(intent, REQUEST_CODE_EARRING1);
                break;
            case R.id.view_earring2:
                intent.putExtra("accessoryArray", earrings);
                startActivityForResult(intent, REQUEST_CODE_EARRING2);
                break;
            case R.id.view_ring1:
                intent.putExtra("accessoryArray", rings);
                startActivityForResult(intent, REQUEST_CODE_RING1);
                break;
            case R.id.view_ring2:
                intent.putExtra("accessoryArray", rings);
                startActivityForResult(intent, REQUEST_CODE_RING2);
                break;
            case R.id.view_belt:
                intent.putExtra("accessoryArray", belts);
                startActivityForResult(intent, REQUEST_CODE_BELT);
                break;
            case R.id.view_necklace:
                intent.putExtra("accessoryArray", necklaces);
                startActivityForResult(intent, REQUEST_CODE_NECKLACE);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (data == null) {
            return;
        }

        int icon;
        int ap;
        int dp;
        int enchLvl;
        String rarity;

        int rarityResource;

        if (resultCode == RESULT_OK) {

            Accessory accessory = (Accessory) data.getSerializableExtra("accessoryName");
            icon = accessory.icon;
            ap = accessory.ap;
            dp = accessory.dp;
            enchLvl = accessory.enchLVL;
            rarity = accessory.rarity;
            switch (enchLvl) {
                case 0:
                    break;
                case 1:
                    enchLvl = R.drawable.image_pri;
                    break;
                case 2:
                    enchLvl = R.drawable.image_duo;
                    break;
                case 3:
                    enchLvl = R.drawable.image_tri;
                    break;
                case 4:
                    enchLvl = R.drawable.image_tet;
                    break;
                case 5:
                    enchLvl = R.drawable.image_pen;
                    break;
            }

            switch (requestCode) {
                case REQUEST_CODE_EARRING1:
                    viewEarring1.setImageResource(icon);
                    viewEarring1enchLvl.setImageResource(enchLvl);
                    apArray[11] = ap;
                    dpArray[11] = dp;
                    break;
                case REQUEST_CODE_EARRING2:
                    viewEarring2.setImageResource(icon);
                    viewEarring2enchLv1.setImageResource(enchLvl);
                    apArray[10] = ap;
                    dpArray[10] = dp;
                    break;
                case REQUEST_CODE_RING1:
                    rarityResource = rarityCheck(rarity);
                    viewRing1.setBackgroundResource(rarityResource);
                    viewRing1.setImageResource(icon);
                    viewRing1enchLvl.setImageResource(enchLvl);
                    apArray[1] = ap;
                    dpArray[1] = dp;
                    break;
                case REQUEST_CODE_RING2:
                    rarityResource = rarityCheck(rarity);
                    viewRing2.setBackgroundResource(rarityResource);
                    viewRing2.setImageResource(icon);
                    viewRing2enchLvl.setImageResource(enchLvl);
                    apArray[2] = ap;
                    dpArray[2] = dp;
                    break;
                case REQUEST_CODE_BELT:
                    viewBelt.setImageResource(icon);
                    apArray[8] = ap;
                    dpArray[8] = dp;
                    break;
                case REQUEST_CODE_NECKLACE:
                    viewNecklace.setImageResource(icon);
                    apArray[4] = ap;
                    dpArray[4] = dp;
                    break;
            }

        } else {
            Toast.makeText(this, "Clear", Toast.LENGTH_SHORT).show();
            switch (requestCode) {
                case REQUEST_CODE_EARRING1:
                    viewEarring1.setImageResource(R.drawable.earring_placeholder);
                    viewEarring1.setBackgroundResource(R.drawable.outline_default);
                    viewEarring1enchLvl.setImageResource(0);
                    apArray[11] = 0;
                    dpArray[11] = 0;
                    break;
                case REQUEST_CODE_EARRING2:
                    viewEarring2.setImageResource(R.drawable.earring_placeholder);
                    viewEarring2.setBackgroundResource(R.drawable.outline_default);
                    viewEarring2enchLv1.setImageResource(0);
                    apArray[10] = 0;
                    dpArray[10] = 0;
                    break;
                case REQUEST_CODE_RING1:
                    viewRing1.setImageResource(R.drawable.ring_placeholder);
                    viewRing1.setBackgroundResource(R.drawable.outline_default);
                    viewRing1enchLvl.setImageResource(0);
                    apArray[1] = 0;
                    dpArray[1] = 0;
                    break;
                case REQUEST_CODE_RING2:
                    viewRing2.setImageResource(R.drawable.ring_placeholder);
                    viewRing2.setBackgroundResource(R.drawable.outline_default);
                    viewRing2enchLvl.setImageResource(0);
                    apArray[2] = 0;
                    dpArray[2] = 0;
                    break;
            }
        }

        sumApDp();

    }

    private int rarityCheck(String rarity) {

        switch (rarity) {
            case "epic":
                rarityValue = R.drawable.outline_epic;
                break;
            case "rare":
                rarityValue = R.drawable.outline_rare;
                break;
            case "uncommon":
                rarityValue = R.drawable.outline_uncommon;
                break;
        }
        return rarityValue;
    }

    private void sumApDp() {

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

//    public void ringChoose(String ringName, int ap, int dp, ImageView ringView, int index) {
//
//        switch (ringName) {
//            case "ringRedCoral":
//                ringView.setImageResource(R.drawable.ring_red_coral);
//                apArray[index] = ap;
//                dpArray[index] = dp;
//                break;
//            case "ringBlueCoral":
//                ringView.setImageResource(R.drawable.ring_blue_coral);
//                apArray[index] = ap;
//                dpArray[index] = dp;
//                break;
//            case "ringCrescent":
//                ringView.setImageResource(R.drawable.ring_crescent);
//                apArray[index] = ap;
//                dpArray[index] = dp;
//                break;
//            case "ringPlaceholder":
//                ringView.setImageResource(R.drawable.ring_placeholder);
//                apArray[index] = ap;
//                dpArray[index] = dp;
//                break;
//        }
//
//    }

//    public void earringChoose(String earringName, int ap, int dp, ImageView earringView, int index) {
//
//        switch (earringName) {
//            case "earringTungrad":
//                earringView.setImageResource(R.drawable.earring_epic_tungrad);
//                apArray[index] = ap;
//                dpArray[index] = dp;
//                break;
//            case "earringBlueCoral":
//                earringView.setImageResource(R.drawable.earring_rare_blue_coral);
//                apArray[index] = ap;
//                dpArray[index] = dp;
//                break;
//            case "earringRedCoral":
//                earringView.setImageResource(R.drawable.earring_rare_red_coral);
//                apArray[index] = ap;
//                dpArray[index] = dp;
//                break;
//            case "earringWitch":
//                earringView.setImageResource(R.drawable.earring_rare_witch);
//                apArray[index] = ap;
//                dpArray[index] = dp;
//                break;
//            case "earringPlaceholder":
//                earringView.setImageResource(R.drawable.earring_placeholder);
//                apArray[index] = ap;
//                dpArray[index] = dp;
//                break;
//        }
//    }

    public void earringChoose(ImageView earringView, int icon) {
        earringView.setImageResource(icon);
    }
}
