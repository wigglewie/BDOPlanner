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

import java.util.stream.*;

/**
 * Created by timox on 01/09/2017.
 */

public class AdapterAwakening extends RecyclerView.Adapter<AdapterAwakening.MyViewHolder> {

    private List<ItemAwakeningWeapon> awakeningWeapons;
    private List<ItemAwakeningWeapon> itemsCopy = new ArrayList<>();
    int valueAP1;
    int valueAP2;
    String stringAP1;
    String stringAP2;
    private int[] statsArray;
    int statsSum;

    private String className;

    public AdapterAwakening(List awakeningWeapons, String className) {
        this.awakeningWeapons = awakeningWeapons;
        itemsCopy.addAll(awakeningWeapons);
        this.className = className;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View earring = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_awakening_choose, viewGroup, false);
        return new MyViewHolder(earring);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int i) {

        final ItemAwakeningWeapon item = awakeningWeapons.get(i);

        String className = awakeningWeapons.get(i).className;

        if (item.className.equals(className)) {

            String ap1 = "" + item.ap1;
            String ap2 = "" + item.ap2;
            holder.name.setText(item.name);
            holder.icon.setImageResource(item.icon);
            holder.ap1.setText(ap1);
            holder.ap2.setText(ap2);

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

                    statsArray = (int[]) item.stats;
                    statsSum = 0;

                    for (int i1 = 0; i1 < i + 1 | i1 == i; i1++) {
                        statsSum += statsArray[i1];
                    }

                    getClass();

                    valueAP1 = item.ap1 + statsSum;
                    valueAP2 = item.ap2 + statsSum;
                switch (i) {
                    case 0:
                        holder.name.setText(item.name);
                        item.setEnhLVL(0);
                        break;
                    case 1:
                        holder.name.setText("+1 " + item.name);
                        item.setEnhLVL(1);
                        break;
                    case 2:
                        holder.name.setText("+2 " + item.name);
                        item.setEnhLVL(2);
                        break;
                    case 3:
                        holder.name.setText("+3 " + item.name);
                        item.setEnhLVL(3);
                        break;
                    case 4:
                        holder.name.setText("+4 " + item.name);
                        item.setEnhLVL(4);
                        break;
                    case 5:
                        holder.name.setText("+5 " + item.name);
                        item.setEnhLVL(5);
                        break;
                    case 6:
                        holder.name.setText("+6 " + item.name);
                        item.setEnhLVL(6);
                        break;
                    case 7:
                        holder.name.setText("+7 " + item.name);
                        item.setEnhLVL(7);
                        break;
                    case 8:
                        holder.name.setText("+8 " + item.name);
                        item.setEnhLVL(8);
                        break;
                    case 9:
                        holder.name.setText("+9 " + item.name);
                        item.setEnhLVL(9);
                        break;
                    case 10:
                        holder.name.setText("+10 " + item.name);
                        item.setEnhLVL(10);
                        break;
                    case 11:
                        holder.name.setText("+11 " + item.name);
                        item.setEnhLVL(11);
                        break;
                    case 12:
                        holder.name.setText("+12 " + item.name);
                        item.setEnhLVL(12);
                        break;
                    case 13:
                        holder.name.setText("+13 " + item.name);
                        item.setEnhLVL(13);
                        break;
                    case 14:
                        holder.name.setText("+14 " + item.name);
                        item.setEnhLVL(14);
                        break;
                    case 15:
                        holder.name.setText("+15 " + item.name);
                        item.setEnhLVL(15);
                        break;
                    case 16:
                        holder.name.setText("I PRI: " + item.name);
                        item.setEnhLVL(16);
                        break;
                    case 17:
                        holder.name.setText("II DUO: " + item.name);
                        item.setEnhLVL(17);
                        break;
                    case 18:
                        holder.name.setText("III TRI: " + item.name);
                        item.setEnhLVL(18);
                        break;
                    case 19:
                        holder.name.setText("IV TET: " + item.name);
                        item.setEnhLVL(19);
                        break;
                    case 20:
                        holder.name.setText("V PEN: " + item.name);
                        item.setEnhLVL(20);
                        break;
                }
                    stringAP1 = String.valueOf(valueAP1);
                    stringAP2 = String.valueOf(valueAP2);
                    holder.ap1.setText(stringAP1);
                    holder.ap2.setText(stringAP2);

                    statsSum = 0;
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

        }



    }

    public void filter(String text) {
        awakeningWeapons.clear();
        if (text.isEmpty()) {
            awakeningWeapons.addAll(itemsCopy);
        } else {
            text = text.toLowerCase();
            for (ItemAwakeningWeapon item : itemsCopy) {
                if (item.name.toLowerCase().contains(text)) {
                    awakeningWeapons.add(item);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return awakeningWeapons.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView icon;
        TextView ap1;
        TextView ap2;
        SeekBar seekBar;


        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.item_awakening_name);
            icon = (ImageView) itemView.findViewById(R.id.item_awakening_icon);
            ap1 = (TextView) itemView.findViewById(R.id.item_awakening_ap1);
            ap2 = (TextView) itemView.findViewById(R.id.item_awakening_ap2);
            seekBar = (SeekBar) itemView.findViewById(R.id.item_awakening_seekBar);
        }
    }
}
