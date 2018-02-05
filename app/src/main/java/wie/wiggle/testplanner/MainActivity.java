package wie.wiggle.testplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.rohit.recycleritemclicksupport.RecyclerItemClickSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timox on 24/08/2017.
 */

public class MainActivity extends AppCompatActivity implements RecyclerItemClickSupport.OnItemClickListener {


    private List<Character> characters;
    private RecyclerView rv;
    private AdapterCharacters mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.recyclerView_classes);

        RecyclerItemClickSupport.addTo(rv).setOnItemClickListener(this);

        characters = new ArrayList<>();
        characters.add(new Character("Warrior", R.drawable.warrior_class_icon));
        characters.add(new Character("Sorceress", R.drawable.sorceress_class_icon));
        characters.add(new Character("Ranger", R.drawable.ranger_class_icon));
        characters.add(new Character("Berserker", R.drawable.berserker_class_icon));
        characters.add(new Character("Tamer", R.drawable.tamer_class_icon));
        characters.add(new Character("Musa", R.drawable.musa_class_icon));
        characters.add(new Character("Maehva", R.drawable.maehwa_class_icon));
        characters.add(new Character("Valkyrie", R.drawable.valkyrie_class_icon));
        characters.add(new Character("Wizard", R.drawable.wizard_class_icon));
        characters.add(new Character("Witch", R.drawable.witch_class_icon));
        characters.add(new Character("Ninja", R.drawable.ninja_class_icon));
        characters.add(new Character("Kunoichi", R.drawable.kunoichi_class_icon));
        characters.add(new Character("Dark Knight", R.drawable.darkknight_class_icon));
        characters.add(new Character("Striker", R.drawable.striker_class_icon));

        mAdapter = new AdapterCharacters(characters);

        mLayoutManager = new LinearLayoutManager(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(mLayoutManager);
        rv.setAdapter(mAdapter);

    }




    @Override
    public void onItemClicked(RecyclerView recyclerView, int position, View v) {

        Intent intent = new Intent(this, GearActivity.class);

        intent.putExtra("class", characters.get(position));
        startActivity(intent);
        Toast.makeText(this, characters.get(position).name, Toast.LENGTH_SHORT).show();

    }

}
