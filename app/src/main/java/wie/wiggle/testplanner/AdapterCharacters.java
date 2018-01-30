package wie.wiggle.testplanner;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by timox on 24/08/2017.
 */

public class AdapterCharacters extends RecyclerView.Adapter<AdapterCharacters.MyViewHolder> {

    private List<Character> characters;

    public AdapterCharacters(List characters) {
        this.characters = characters;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View person = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_class_name, viewGroup, false);
        return new MyViewHolder(person);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Character character = characters.get(position);
        holder.name.setText(character.name);
//        holder.icon.setImageResource(characters.get(position).icon);
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }


    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.test_text);
//            icon = (ImageView) itemView.findViewById(R.id.test_icon);
        }
    }

}
