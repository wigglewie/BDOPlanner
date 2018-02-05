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
import android.view.View;

import com.rohit.recycleritemclicksupport.RecyclerItemClickSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timox on 05-Feb-18.
 */

public class ItemAlchemyStoneChooseActivity extends AppCompatActivity implements RecyclerItemClickSupport.OnItemClickListener {

    private List<AlchemyStone> alchemyStones;
    private RecyclerView rv;
    private AdapterAlchemyStones mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private android.support.v7.widget.Toolbar toolbar;

    private SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_alchemy_stone_choose);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        rv = (RecyclerView) findViewById(R.id.recyclerView_gear_items);
        RecyclerItemClickSupport.addTo(rv).setOnItemClickListener(this);

        alchemyStones = (ArrayList<AlchemyStone>) getIntent().getSerializableExtra("alchemyStones");

        mAdapter = new AdapterAlchemyStones(alchemyStones);
        mLayoutManager = new LinearLayoutManager(this);

        rv.addItemDecoration(new EqualSpacingItemDecoration(30));

        rv.setHasFixedSize(true);
        rv.setLayoutManager(mLayoutManager);
        rv.setAdapter(mAdapter);

        searchView = (SearchView) findViewById(R.id.menu_search);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView sv = (SearchView) menu.findItem(R.id.menu_search).getActionView();
        sv.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                mAdapter.filter(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapter.filter(newText);
                return true;
            }
        });

        return super.onCreateOptionsMenu(menu);
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
        AlchemyStone alchemyStone = alchemyStones.get(position);
        intent.putExtra("alchemyName", alchemyStone);
        setResult(RESULT_OK, intent);
        finish();

    }

}
