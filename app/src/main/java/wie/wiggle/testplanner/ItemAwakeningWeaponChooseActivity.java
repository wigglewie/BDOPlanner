package wie.wiggle.testplanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class ItemAwakeningWeaponChooseActivity extends AppCompatActivity {

    private List<ItemAwakeningWeapon> awakeningWeapons;
    private RecyclerView rv;
    private AdapterAwakening mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    String stringAP;
    String stringDP;
    int valueAP;
    int valueDP;
    int sb;

    private String className;

    private android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_choose);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        rv = (RecyclerView) findViewById(R.id.recyclerView_gear_items);
//        RecyclerItemClickSupport.addTo(rv).setOnItemClickListener(this);

        awakeningWeapons = (ArrayList<ItemAwakeningWeapon>) getIntent().getSerializableExtra("awakeningWeapons");

        mAdapter = new AdapterAwakening(awakeningWeapons, className);
        mLayoutManager = new LinearLayoutManager(this);

        rv.addItemDecoration(new EqualSpacingItemDecoration(30));

        rv.setHasFixedSize(true);
        rv.setLayoutManager(mLayoutManager);
        rv.setAdapter(mAdapter);

    }
}
