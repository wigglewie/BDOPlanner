package wie.wiggle.testplanner;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timox on 01/09/2017.
 */

public class AdapterAlchemyStones extends RecyclerView.Adapter<AdapterAlchemyStones.MyViewHolder> {

    private List<AlchemyStone> alchemyStones;
    private List<AlchemyStone> itemsCopy = new ArrayList<>();

    public AdapterAlchemyStones(List alchemyStones) {
        this.alchemyStones = alchemyStones;
        itemsCopy.addAll(alchemyStones);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View earring = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_alchemy_stone_choose, viewGroup, false);
        return new MyViewHolder(earring);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int i) {
        final AlchemyStone item = alchemyStones.get(i);
        holder.name.setText(item.name);
        holder.icon.setImageResource(item.icon);

        switch (item.rarity) {

            case "common":
                holder.name.setTextColor(holder.name.getResources().getColor(R.color.colorItemCommon));
                break;
            case "uncommon":
                holder.name.setTextColor(holder.name.getResources().getColor(R.color.colorItemUncommon));
                break;
            case "rare":
                holder.name.setTextColor(holder.name.getResources().getColor(R.color.colorItemRare));
                break;
            case "epic":
                holder.name.setTextColor(holder.name.getResources().getColor(R.color.colorItemEpic));
                break;
        }

    }

    public void filter(String text) {
        alchemyStones.clear();
        if (text.isEmpty()) {
            alchemyStones.addAll(itemsCopy);
        } else {
            text = text.toLowerCase();
            for (AlchemyStone item : itemsCopy) {
                if (item.name.toLowerCase().contains(text)) {
                    alchemyStones.add(item);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return alchemyStones.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.item_alchemy_name);
            icon = (ImageView) itemView.findViewById(R.id.item_alchemy_icon);
        }
    }
}
