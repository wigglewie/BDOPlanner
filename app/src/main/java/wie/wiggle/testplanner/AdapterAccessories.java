package wie.wiggle.testplanner;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by timox on 01/09/2017.
 */

public class AdapterAccessories extends RecyclerView.Adapter<AdapterAccessories.MyViewHolder> {

    private List<ItemAccessory> accessories;
    private List<ItemAccessory> itemsCopy = new ArrayList<>();
    int valueAP;
    int valueDP;
    String stringAP;
    String stringDP;

    public AdapterAccessories(List accessories) {
        this.accessories = accessories;
        itemsCopy.addAll(accessories);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View earring = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_accessory_choose, viewGroup, false);
        return new MyViewHolder(earring);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int i) {
        final ItemAccessory item = accessories.get(i);
        String ap = "" + item.ap;
        String dp = "" + item.dp;
        holder.name.setText(item.name);
        holder.icon.setImageResource(item.icon);
        holder.ap.setText(ap);
        holder.dp.setText(dp);

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

        holder.seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                valueAP = item.ap + i * item.enhStepAP;
                valueDP = item.dp + i * item.enhStepDP;
                switch (i) {
                    case 0:
                        holder.name.setText(item.name);
                        item.setEnhLVL(0);
                        break;
                    case 1:
                        holder.name.setText("I PRI: " + item.name);
                        item.setEnhLVL(1);
                        break;
                    case 2:
                        holder.name.setText("II DUO: " + item.name);
                        item.setEnhLVL(2);
                        break;
                    case 3:
                        holder.name.setText("III TRI: " + item.name);
                        item.setEnhLVL(3);
                        break;
                    case 4:
                        holder.name.setText("IV TET: " + item.name);
                        item.setEnhLVL(4);
                        break;
                    case 5:
                        holder.name.setText("V PEN: " + item.name);
                        item.setEnhLVL(5);
                        break;
                }
                stringAP = String.valueOf(valueAP);
                stringDP = String.valueOf(valueDP);
                holder.ap.setText(stringAP);
                holder.dp.setText(stringDP);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    public void filter(String text) {
        accessories.clear();
        if (text.isEmpty()) {
            accessories.addAll(itemsCopy);
        } else {
            text = text.toLowerCase();
            for (ItemAccessory item : itemsCopy) {
                if (item.name.toLowerCase().contains(text)) {
                    accessories.add(item);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return accessories.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView icon;
        TextView ap;
        TextView dp;
        SeekBar seekBar;


        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.item_accessory_name);
            icon = (ImageView) itemView.findViewById(R.id.item_awakening_icon);
            ap = (TextView) itemView.findViewById(R.id.item_accessory_ap);
            dp = (TextView) itemView.findViewById(R.id.item_accessory_dp);
            seekBar = (SeekBar) itemView.findViewById(R.id.item_accessory_seekBar);
        }
    }
}
