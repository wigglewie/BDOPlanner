package wie.wiggle.testplanner;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.SeekBar;
import android.widget.TextView;

import com.rohit.recycleritemclicksupport.RecyclerItemClickSupport;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timox on 31/08/2017.
 */

public class ItemAccessoryChooseActivity extends AppCompatActivity implements RecyclerItemClickSupport.OnItemClickListener {

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
        setContentView(R.layout.activity_item_accessory_choose);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        rv = (RecyclerView) findViewById(R.id.recyclerView_gear_items);
        RecyclerItemClickSupport.addTo(rv).setOnItemClickListener(this);

        accessoryArray = (ArrayList<Accessory>) getIntent().getSerializableExtra("accessoryArray");

        mAdapter = new AdapterGear(accessoryArray);
        mLayoutManager = new LinearLayoutManager(this);

        rv.addItemDecoration(new EqualSpacingItemDecoration(30));

        rv.setHasFixedSize(true);
        rv.setLayoutManager(mLayoutManager);
        rv.setAdapter(mAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        final SearchView searchView = (SearchView) menu.findItem(R.id.menu_items_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                mAdapter.filter(query);
                searchView.clearFocus();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapter.filter(newText);
                return true;
            }
        });

        rv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(searchView.getWindowToken(), 0);

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_items_clear:
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
        stringAP = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.item_gear_ap)).getText().toString();
        stringDP = ((TextView) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.item_gearp_dp)).getText().toString();
        valueAP = Integer.parseInt(stringAP);
        valueDP = Integer.parseInt(stringDP);
        sb = ((SeekBar) recyclerView.findViewHolderForAdapterPosition(position).itemView.findViewById(R.id.item_gear_seekbar)).getProgress();
        accessory.setAp(valueAP);
        accessory.setDp(valueDP);
        accessory.setEnhLVL(sb);
        intent.putExtra("accessoryName", accessory);
        setResult(RESULT_OK, intent);
        finish();

    }

}
