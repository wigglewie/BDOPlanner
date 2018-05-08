package wie.wiggle.testplanner;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by timox on 01/09/2017.
 */

public class AdapterAlchemyStones extends RecyclerView.Adapter<AdapterAlchemyStones.MyViewHolder> {

    private List<ItemAlchemyStone> alchemyStones;
    private List<ItemAlchemyStone> itemsCopy = new ArrayList<>();

    String type;

    int valueHiddenAP;
    int valueAccuracy;
    int valueIgnoreResistance;
    int valueAttackSpeed;
    int valueCastingSpeed;

    int valueDR;
    int valueEvasion;
    int valueMaxHP;
    int valueResistanceAll;

    float valueCookingTime;
    int valueProcessingSuccessRate;
    int valueWeightLimit;
    int valueGatheringFishingLvl;
    int valueGatheringDropRate;


    public AdapterAlchemyStones(List alchemyStones) {
        this.alchemyStones = alchemyStones;
        itemsCopy.addAll(alchemyStones);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View alchemyStone = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_alchemy_stone_choose, viewGroup, false);
        return new MyViewHolder(alchemyStone);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int i) {
        final ItemAlchemyStone item = alchemyStones.get(i);
        type = item.type;

        if (type.equals("destruction")) {

            holder.statsDestruction.setVisibility(View.VISIBLE);
            holder.statsProtection.setVisibility(View.GONE);
            holder.statsLife.setVisibility(View.GONE);

            holder.viewHiddenAP.setVisibility(View.GONE);
            holder.viewAccuracy.setVisibility(View.GONE);
            holder.viewIgnoreResistance.setVisibility(View.GONE);
            holder.viewAttackSpeed.setVisibility(View.GONE);
            holder.viewCastingSpeed.setVisibility(View.GONE);

//            LinkedHashMap<String, Double> item_effects = (LinkedHashMap<String, Double>) item.item_effects;

//            final StatsAlchemyDestruction statsDestruction = new StatsAlchemyDestruction(
//                    item_effects.get("hiddenAp").intValue(),
//                    item_effects.get("accuracy").intValue(),
//                    item_effects.get("ignoreAllResistance").intValue(),
//                    item_effects.get("attackSpeed").intValue(),
//                    item_effects.get("castingSpeed").intValue());

            final HashMap stats = (HashMap) item.item_effects;
//            ArrayList list = new ArrayList<>(stats.values());

            ArrayList list = new ArrayList<>(stats.values());

            Double v1 = (Double) list.get(0);
            Double v2 = (Double) list.get(1);
            Double v3 = (Double) list.get(2);
            Double v4 = (Double) list.get(3);
            Double v5 = (Double) list.get(4);

            final StatsAlchemyDestruction statsDestruction = new StatsAlchemyDestruction(v1.intValue(), v2.intValue(), v3.intValue(), v4.intValue(), v5.intValue());

            valueHiddenAP = statsDestruction.hiddenAP;
            valueAccuracy = statsDestruction.accuracy;
            valueIgnoreResistance = statsDestruction.ignoreAllResistance;
            valueAttackSpeed = statsDestruction.attackSpeed;
            valueCastingSpeed = statsDestruction.castingSpeed;

            holder.name.setText(item.name);
            holder.icon.setImageResource(holder.icon.getContext().getResources().getIdentifier("drawable/" + item.icon, null, holder.icon.getContext().getPackageName()));

            holder.valueHiddenAP.setText(Integer.toString(valueHiddenAP));
            holder.valueAccuracy.setText(Integer.toString(valueAccuracy));
            holder.valueIgnoreResistance.setText(Integer.toString(valueIgnoreResistance));
            holder.valueAttackSpeed.setText(Integer.toString(valueAttackSpeed));
            holder.valueCastingSpeed.setText(Integer.toString(valueCastingSpeed));

            if (valueHiddenAP > 0) {
                holder.viewHiddenAP.setVisibility(View.VISIBLE);
            }
            if (valueAccuracy > 0) {
                holder.viewAccuracy.setVisibility(View.VISIBLE);
            }
            if (valueIgnoreResistance > 0) {
                holder.viewIgnoreResistance.setVisibility(View.VISIBLE);
            }
            if (valueAttackSpeed > 0) {
                holder.viewAttackSpeed.setVisibility(View.VISIBLE);
            }
            if (valueCastingSpeed > 0) {
                holder.viewCastingSpeed.setVisibility(View.VISIBLE);
            }

        } else if (type.equals("protection")) {

            holder.statsDestruction.setVisibility(View.GONE);
            holder.statsProtection.setVisibility(View.VISIBLE);
            holder.statsLife.setVisibility(View.GONE);

            holder.viewDR.setVisibility(View.GONE);
            holder.viewEvasion.setVisibility(View.GONE);
            holder.viewMaxHP.setVisibility(View.GONE);
            holder.viewKnockback.setVisibility(View.GONE);
            holder.viewKnockdown.setVisibility(View.GONE);
            holder.viewStun.setVisibility(View.GONE);
            holder.viewGrapple.setVisibility(View.GONE);

            final HashMap stats = (HashMap) item.item_effects;

            ArrayList list = new ArrayList(stats.values());

            Double v1 = (Double) list.get(0);
            Double v2 = (Double) list.get(1);
            Double v3 = (Double) list.get(2);
            Double v4 = (Double) list.get(3);

            final StatsAlchemyProtection statsProtection = new StatsAlchemyProtection(v1.intValue(), v2.intValue(), v3.intValue(), v4.intValue());

            valueDR = statsProtection.damageReduction;
            valueEvasion = statsProtection.evasion;
            valueMaxHP = statsProtection.maxHP;
            valueResistanceAll = statsProtection.resistanceAll;

            holder.name.setText(item.name);
            holder.icon.setImageResource(holder.icon.getContext().getResources().getIdentifier("drawable/" + item.icon, null, holder.icon.getContext().getPackageName()));

            holder.valueDR.setText(Integer.toString(valueDR));
            holder.valueEvasion.setText(Integer.toString(valueEvasion));
            holder.valueMaxHP.setText(Integer.toString(valueMaxHP));
            holder.valueKnockback.setText(Integer.toString(valueResistanceAll));
            holder.valueKnockdown.setText(Integer.toString(valueResistanceAll));
            holder.valueStun.setText(Integer.toString(valueResistanceAll));
            holder.valueGrapple.setText(Integer.toString(valueResistanceAll));

            if (valueDR > 0) {
                holder.viewDR.setVisibility(View.VISIBLE);
            }
            if (valueEvasion > 0) {
                holder.viewEvasion.setVisibility(View.VISIBLE);
            }
            if (valueMaxHP > 0) {
                holder.viewMaxHP.setVisibility(View.VISIBLE);
            }
            if (valueResistanceAll > 0) {
                holder.viewKnockback.setVisibility(View.VISIBLE);
                holder.viewKnockdown.setVisibility(View.VISIBLE);
                holder.viewStun.setVisibility(View.VISIBLE);
                holder.viewGrapple.setVisibility(View.VISIBLE);
            }

        } else if (type.equals("life")) {

            holder.statsDestruction.setVisibility(View.GONE);
            holder.statsProtection.setVisibility(View.GONE);
            holder.statsLife.setVisibility(View.VISIBLE);

            holder.viewCookingTime.setVisibility(View.GONE);
            holder.viewProcessingSuccessRate.setVisibility(View.GONE);
            holder.viewWeightLimit.setVisibility(View.GONE);
            holder.viewGatheringFishingLvl.setVisibility(View.GONE);
            holder.viewGatheringDropRate.setVisibility(View.GONE);

            final HashMap stats = (HashMap) item.item_effects;

            ArrayList list = new ArrayList(stats.values());

            Double v1 = (Double) list.get(0);
            Double v2 = (Double) list.get(1);
            Double v3 = (Double) list.get(2);
            Double v4 = (Double) list.get(3);
            Double v5 = (Double) list.get(4);

            final StatsAlchemyLife statsLife = new StatsAlchemyLife(v1.floatValue(), v2.intValue(), v3.intValue(), v4.intValue(), v5.intValue());

            valueCookingTime = statsLife.cookingTime;
            valueProcessingSuccessRate = statsLife.processingSuccessRate;
            valueWeightLimit = statsLife.weightLimit;
            valueGatheringFishingLvl = statsLife.gatheringFishingLvl;
            valueGatheringDropRate = statsLife.gatheringDropRate;

            holder.name.setText(item.name);
            holder.icon.setImageResource(holder.icon.getContext().getResources().getIdentifier("drawable/" + item.icon, null, holder.icon.getContext().getPackageName()));

            holder.valueCookingTime.setText(Float.toString(valueCookingTime));
            holder.valueProcessingSuccessRate.setText(Integer.toString(valueProcessingSuccessRate));
            holder.valueWeightLimit.setText(Integer.toString(valueWeightLimit));
            holder.valueGatheringFishingLvl.setText(Integer.toString(valueGatheringFishingLvl));
            holder.valueGatheringDropRate.setText(Integer.toString(valueGatheringDropRate));

            if (valueCookingTime > 0) {
                holder.viewCookingTime.setVisibility(View.VISIBLE);
            }
            if (valueProcessingSuccessRate > 0) {
                holder.viewProcessingSuccessRate.setVisibility(View.VISIBLE);
            }
            if (valueWeightLimit > 0) {
                holder.viewWeightLimit.setVisibility(View.VISIBLE);
            }
            if (valueGatheringFishingLvl > 0) {
                holder.viewGatheringFishingLvl.setVisibility(View.VISIBLE);
            }
            if (valueGatheringDropRate > 0) {
                holder.viewGatheringDropRate.setVisibility(View.VISIBLE);
            }
        }

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
            for (ItemAlchemyStone item : itemsCopy) {
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

        View statsDestruction;
        View statsProtection;
        View statsLife;

        TextView valueHiddenAP;
        TextView valueAccuracy;
        TextView valueIgnoreResistance;
        TextView valueAttackSpeed;
        TextView valueCastingSpeed;
        View viewHiddenAP;
        View viewAccuracy;
        View viewIgnoreResistance;
        View viewAttackSpeed;
        View viewCastingSpeed;

        TextView valueDR;
        TextView valueEvasion;
        TextView valueMaxHP;
        TextView valueKnockback;
        TextView valueKnockdown;
        TextView valueStun;
        TextView valueGrapple;
        View viewDR;
        View viewEvasion;
        View viewMaxHP;
        View viewKnockback;
        View viewKnockdown;
        View viewStun;
        View viewGrapple;

        TextView valueCookingTime;
        TextView valueProcessingSuccessRate;
        TextView valueWeightLimit;
        TextView valueGatheringFishingLvl;
        TextView valueGatheringDropRate;
        View viewCookingTime;
        View viewProcessingSuccessRate;
        View viewWeightLimit;
        View viewGatheringFishingLvl;
        View viewGatheringDropRate;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.item_alchemy_name);
            icon = (ImageView) itemView.findViewById(R.id.item_alchemy_icon);

            statsDestruction = itemView.findViewById(R.id.stats_alchemy_destruction);
            statsProtection = itemView.findViewById(R.id.stats_alchemy_protection);
            statsLife = itemView.findViewById(R.id.stats_alchemy_life);

            valueHiddenAP = (TextView) itemView.findViewById(R.id.item_alchemy_value_hiddenAP);
            valueAccuracy = (TextView) itemView.findViewById(R.id.item_alchemy_value_accuracy);
            valueIgnoreResistance = (TextView) itemView.findViewById(R.id.item_alchemy_value_ignoreAllResistance);
            valueAttackSpeed = (TextView) itemView.findViewById(R.id.item_alchemy_value_attackSpeed);
            valueCastingSpeed = (TextView) itemView.findViewById(R.id.item_alchemy_value_castingSpeed);
            viewHiddenAP = itemView.findViewById(R.id.item_alchemy_view_hiddenAP);
            viewAccuracy = itemView.findViewById(R.id.item_alchemy_view_accuracy);
            viewIgnoreResistance = itemView.findViewById(R.id.item_alchemy_view_ignoreAllResistance);
            viewAttackSpeed = itemView.findViewById(R.id.item_alchemy_view_attackSpeed);
            viewCastingSpeed = itemView.findViewById(R.id.item_alchemy_view_castingSpeed);

            valueDR = (TextView) itemView.findViewById(R.id.item_alchemy_value_dr);
            valueEvasion = (TextView) itemView.findViewById(R.id.item_alchemy_value_evasion);
            valueMaxHP = (TextView) itemView.findViewById(R.id.item_alchemy_value_maxHP);
            valueKnockdown = (TextView) itemView.findViewById(R.id.item_alchemy_value_knockdownResistance);
            valueKnockback = (TextView) itemView.findViewById(R.id.item_alchemy_value_knockbackResistance);
            valueStun = (TextView) itemView.findViewById(R.id.item_alchemy_value_stunResistance);
            valueGrapple = (TextView) itemView.findViewById(R.id.item_alchemy_value_grappleResistance);
            viewDR = itemView.findViewById(R.id.item_alchemy_view_dr);
            viewEvasion = itemView.findViewById(R.id.item_alchemy_view_evasion);
            viewMaxHP = itemView.findViewById(R.id.item_alchemy_view_maxHP);
            viewKnockdown = itemView.findViewById(R.id.item_alchemy_view_knockdownResistance);
            viewKnockback = itemView.findViewById(R.id.item_alchemy_view_knockbackResistance);
            viewStun = itemView.findViewById(R.id.item_alchemy_view_stunResistance);
            viewGrapple = itemView.findViewById(R.id.item_alchemy_view_grappleResistance);

            valueCookingTime = (TextView) itemView.findViewById(R.id.item_alchemy_value_cookingTime);
            valueProcessingSuccessRate = (TextView) itemView.findViewById(R.id.item_alchemy_value_processingSuccessRate);
            valueWeightLimit = (TextView) itemView.findViewById(R.id.item_alchemy_value_weightLimit);
            valueGatheringFishingLvl = (TextView) itemView.findViewById(R.id.item_alchemy_value_gatheringFishingLvl);
            valueGatheringDropRate = (TextView) itemView.findViewById(R.id.item_alchemy_value_gatheringDropRate);

            viewCookingTime = itemView.findViewById(R.id.item_alchemy_view_cookingTime);
            viewProcessingSuccessRate = itemView.findViewById(R.id.item_alchemy_view_processingSuccessRate);
            viewWeightLimit = itemView.findViewById(R.id.item_alchemy_view_weightLimit);
            viewGatheringFishingLvl = itemView.findViewById(R.id.item_alchemy_view_gatheringFishingLvl);
            viewGatheringDropRate = itemView.findViewById(R.id.item_alchemy_view_gatheringDropRate);
        }
    }
}
