package wie.wiggle.testplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.rohit.recycleritemclicksupport.RecyclerItemClickSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timox on 31/08/2017.
 */

public class ItemGearChooseActivity extends AppCompatActivity implements RecyclerItemClickSupport.OnItemClickListener {

    private List<Accessory> accessoryArray;
    private RecyclerView rv;
    private AdapterGear mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    String stringAP;
    String stringDP;
    int valueAP;
    int valueDP;
    int sb;

    private android.support.v7.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_choose);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        rv = (RecyclerView) findViewById(R.id.recyclerView_gear_items);
        RecyclerItemClickSupport.addTo(rv).setOnItemClickListener(this);

        accessoryArray = (ArrayList<Accessory>) getIntent().getSerializableExtra("accessoryArray");

        mAdapter = new AdapterGear(accessoryArray);
        mLayoutManager = new LinearLayoutManager(this);

        rv.addItemDecoration(new EqualSpacingItemDecoration(30));

        rv.setHasFixedSize(true);
        rv.setLayoutManager(mLayoutManager);
        rv.setAdapter(mAdapter);

//        rv.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
//            @Override
//            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
//                return false;
//            }
//
//            @Override
//            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
//
//            }
//
//            @Override
//            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//            }
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_clear:
                Intent intent = new Intent();
                setResult(RESULT_CANCELED, intent);
                finish();

                break;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onItemClicked(RecyclerView recyclerView, int position, View v) {

        Intent intent = new Intent();
        Accessory accessory = accessoryArray.get(position);
        stringAP = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.item_ap_test)).getText().toString();
        stringDP = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.item_dp_test)).getText().toString();
        valueAP = Integer.parseInt(stringAP);
        valueDP = Integer.parseInt(stringDP);
        sb = ((SeekBar) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.seekBar)).getProgress();
        accessory.setAp(valueAP);
        accessory.setDp(valueDP);
        accessory.setEnchLVL(sb);
        intent.putExtra("accessoryName", accessory);
        setResult(RESULT_OK, intent);
        finish();

    }

}
