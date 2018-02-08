package wie.wiggle.testplanner;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by timox on 08-Feb-18.
 */

public class AlertDialogAlchemyShow extends AppCompatActivity {

//    private AlchemyStone alchemyStone;

    TextView adAlchemyName;

    int adStatHiddenAP;
    int adStatAccuracy;
    int adStatIgnoreResistance;
    int adStatAttackSpeed;
    int adStatCastingSpeed;

    int adStatDR;
    int adStatEvasion;
    int adStatMaxHP;
    int adStatResistanceAll;

    float adStatCookingTime;
    int adStatProcessingSuccessRate;
    int adStatWeightLimit;
    int adStatGatheringFishingLvl;
    int adStatGatheringDropRate;

    View adViewStatsDestruction;
    View adViewStatsProtection;
    View adViewStatsLife;

    TextView adValueHiddenAP;
    TextView adValueAccuracy;
    TextView adValueIgnoreResistance;
    TextView adValueAttackSpeed;
    TextView adValueCastingSpeed;
    View adViewHiddenAP;
    View adViewAccuracy;
    View adViewIgnoreResistance;
    View adViewAttackSpeed;
    View adViewCastingSpeed;

    TextView adValueDR;
    TextView adValueEvasion;
    TextView adValueMaxHP;
    TextView adValueKnockback;
    TextView adValueKnockdown;
    TextView adValueStun;
    TextView adValueGrapple;
    View adViewDR;
    View adViewEvasion;
    View adViewMaxHP;
    View adViewKnockback;
    View adViewKnockdown;
    View adViewStun;
    View adViewGrapple;

    TextView adValueCookingTime;
    TextView adValueProcessingSuccessRate;
    TextView adValueWeightLimit;
    TextView adValueGatheringFishingLvl;
    TextView adValueGatheringDropRate;
    View adViewCookingTime;
    View adViewProcessingSuccessRate;
    View adViewWeightLimit;
    View adViewGatheringFishingLvl;
    View adViewGatheringDropRate;

    void initViews(View view) {

        adAlchemyName = (TextView) view.findViewById(R.id.ad_alchemy_name);

        adViewStatsDestruction = view.findViewById(R.id.stats_alchemy_destruction);
        adViewStatsProtection = view.findViewById(R.id.stats_alchemy_protection);
        adViewStatsLife = view.findViewById(R.id.stats_alchemy_life);

        adValueHiddenAP = (TextView) view.findViewById(R.id.item_alchemy_value_hiddenAP);
        adValueAccuracy = (TextView) view.findViewById(R.id.item_alchemy_value_accuracy);
        adValueIgnoreResistance = (TextView) view.findViewById(R.id.item_alchemy_value_ignoreAllResistance);
        adValueAttackSpeed = (TextView) view.findViewById(R.id.item_alchemy_value_attackSpeed);
        adValueCastingSpeed = (TextView) view.findViewById(R.id.item_alchemy_value_castingSpeed);
        adViewHiddenAP = view.findViewById(R.id.item_alchemy_view_hiddenAP);
        adViewAccuracy = view.findViewById(R.id.item_alchemy_view_accuracy);
        adViewIgnoreResistance = view.findViewById(R.id.item_alchemy_view_ignoreAllResistance);
        adViewAttackSpeed = view.findViewById(R.id.item_alchemy_view_attackSpeed);
        adViewCastingSpeed = view.findViewById(R.id.item_alchemy_view_castingSpeed);

        adValueDR = (TextView) view.findViewById(R.id.item_alchemy_value_dr);
        adValueEvasion = (TextView) view.findViewById(R.id.item_alchemy_value_evasion);
        adValueMaxHP = (TextView) view.findViewById(R.id.item_alchemy_value_maxHP);
        adValueKnockdown = (TextView) view.findViewById(R.id.item_alchemy_value_knockdownResistance);
        adValueKnockback = (TextView) view.findViewById(R.id.item_alchemy_value_knockbackResistance);
        adValueStun = (TextView) view.findViewById(R.id.item_alchemy_value_stunResistance);
        adValueGrapple = (TextView) view.findViewById(R.id.item_alchemy_value_grappleResistance);

        adViewDR = view.findViewById(R.id.item_alchemy_view_dr);
        adViewEvasion = view.findViewById(R.id.item_alchemy_view_evasion);
        adViewMaxHP = view.findViewById(R.id.item_alchemy_view_maxHP);
        adViewKnockdown = view.findViewById(R.id.item_alchemy_view_knockdownResistance);
        adViewKnockback = view.findViewById(R.id.item_alchemy_view_knockbackResistance);
        adViewStun = view.findViewById(R.id.item_alchemy_view_stunResistance);
        adViewGrapple = view.findViewById(R.id.item_alchemy_view_grappleResistance);

        adValueCookingTime = (TextView) view.findViewById(R.id.item_alchemy_value_cookingTime);
        adValueProcessingSuccessRate = (TextView) view.findViewById(R.id.item_alchemy_value_processingSuccessRate);
        adValueWeightLimit = (TextView) view.findViewById(R.id.item_alchemy_value_weightLimit);
        adValueGatheringFishingLvl = (TextView) view.findViewById(R.id.item_alchemy_value_gatheringFishingLvl);
        adValueGatheringDropRate = (TextView) view.findViewById(R.id.item_alchemy_value_gatheringDropRate);

        adViewCookingTime = view.findViewById(R.id.item_alchemy_view_cookingTime);
        adViewProcessingSuccessRate = view.findViewById(R.id.item_alchemy_view_processingSuccessRate);
        adViewWeightLimit = view.findViewById(R.id.item_alchemy_view_weightLimit);
        adViewGatheringFishingLvl = view.findViewById(R.id.item_alchemy_view_gatheringFishingLvl);
        adViewGatheringDropRate = view.findViewById(R.id.item_alchemy_view_gatheringDropRate);
    }

    public View showStatsDestruction(AlchemyStone alchemyStone, View view) {

        initViews(view);
        adCheckRarity(alchemyStone);
        adAlchemyName.setText(alchemyStone.name);

        adViewStatsDestruction.setVisibility(View.VISIBLE);
        adViewStatsProtection.setVisibility(View.GONE);
        adViewStatsLife.setVisibility(View.GONE);

        adViewHiddenAP.setVisibility(View.GONE);
        adViewAccuracy.setVisibility(View.GONE);
        adViewIgnoreResistance.setVisibility(View.GONE);
        adViewAttackSpeed.setVisibility(View.GONE);
        adViewCastingSpeed.setVisibility(View.GONE);

        final StatsAlchemyDestruction adStatsDestruction = (StatsAlchemyDestruction) alchemyStone.stats;

        adStatHiddenAP = adStatsDestruction.hiddenAP;
        adStatAccuracy = adStatsDestruction.accuracy;
        adStatIgnoreResistance = adStatsDestruction.ignoreAllResistance;
        adStatAttackSpeed = adStatsDestruction.attackSpeed;
        adStatCastingSpeed = adStatsDestruction.castingSpeed;

//        holder.name.setText(item.name);
//        holder.icon.setImageResource(item.icon);

        adValueHiddenAP.setText(Integer.toString(adStatHiddenAP));
        adValueAccuracy.setText(Integer.toString(adStatAccuracy));
        adValueIgnoreResistance.setText(Integer.toString(adStatIgnoreResistance));
        adValueAttackSpeed.setText(Integer.toString(adStatAttackSpeed));
        adValueCastingSpeed.setText(Integer.toString(adStatCastingSpeed));

        if (adStatHiddenAP > 0) {
            adViewHiddenAP.setVisibility(View.VISIBLE);
        }
        if (adStatAccuracy > 0) {
            adViewAccuracy.setVisibility(View.VISIBLE);
        }
        if (adStatIgnoreResistance > 0) {
            adViewIgnoreResistance.setVisibility(View.VISIBLE);
        }
        if (adStatAttackSpeed > 0) {
            adViewAttackSpeed.setVisibility(View.VISIBLE);
        }
        if (adStatCastingSpeed > 0) {
            adViewCastingSpeed.setVisibility(View.VISIBLE);
        }

        return view;
    }

    public void showStatsProtection(AlchemyStone alchemyStone, View view) {

        initViews(view);
        adCheckRarity(alchemyStone);
        adAlchemyName.setText(alchemyStone.name);

        adViewStatsDestruction.setVisibility(View.GONE);
        adViewStatsProtection.setVisibility(View.VISIBLE);
        adViewStatsLife.setVisibility(View.GONE);

        adViewDR.setVisibility(View.GONE);
        adViewEvasion.setVisibility(View.GONE);
        adViewMaxHP.setVisibility(View.GONE);
        adViewKnockback.setVisibility(View.GONE);
        adViewKnockdown.setVisibility(View.GONE);
        adViewStun.setVisibility(View.GONE);
        adViewGrapple.setVisibility(View.GONE);

        final StatsAlchemyProtection adStatsProtection = (StatsAlchemyProtection) alchemyStone.stats;

        adStatDR = adStatsProtection.damageReduction;
        adStatEvasion = adStatsProtection.evasion;
        adStatMaxHP = adStatsProtection.maxHP;
        adStatResistanceAll = adStatsProtection.resistanceAll;

//        holder.name.setText(item.name);
//        holder.icon.setImageResource(item.icon);

        adValueDR.setText(Integer.toString(adStatDR));
        adValueEvasion.setText(Integer.toString(adStatEvasion));
        adValueMaxHP.setText(Integer.toString(adStatMaxHP));
        adValueKnockback.setText(Integer.toString(adStatResistanceAll));
        adValueKnockdown.setText(Integer.toString(adStatResistanceAll));
        adValueStun.setText(Integer.toString(adStatResistanceAll));
        adValueGrapple.setText(Integer.toString(adStatResistanceAll));

        if (adStatDR > 0) {
            adViewDR.setVisibility(View.VISIBLE);
        }
        if (adStatEvasion > 0) {
            adViewEvasion.setVisibility(View.VISIBLE);
        }
        if (adStatMaxHP > 0) {
            adViewMaxHP.setVisibility(View.VISIBLE);
        }
        if (adStatResistanceAll > 0) {
            adViewKnockback.setVisibility(View.VISIBLE);
            adViewKnockdown.setVisibility(View.VISIBLE);
            adViewStun.setVisibility(View.VISIBLE);
            adViewGrapple.setVisibility(View.VISIBLE);
        }
    }

    public void showStatsLife(AlchemyStone alchemyStone, View view) {

        initViews(view);
        adCheckRarity(alchemyStone);
        adAlchemyName.setText(alchemyStone.name);

        adViewStatsDestruction.setVisibility(View.GONE);
        adViewStatsProtection.setVisibility(View.GONE);
        adViewStatsLife.setVisibility(View.VISIBLE);

        adViewCookingTime.setVisibility(View.GONE);
        adViewProcessingSuccessRate.setVisibility(View.GONE);
        adViewWeightLimit.setVisibility(View.GONE);
        adViewGatheringFishingLvl.setVisibility(View.GONE);
        adViewGatheringDropRate.setVisibility(View.GONE);

        final StatsAlchemyLife adStatsLife = (StatsAlchemyLife) alchemyStone.stats;

        adStatCookingTime = adStatsLife.cookingTime;
        adStatProcessingSuccessRate = adStatsLife.processingSuccessRate;
        adStatWeightLimit = adStatsLife.weightLimit;
        adStatGatheringFishingLvl = adStatsLife.gatheringFishingLvl;
        adStatGatheringDropRate = adStatsLife.gatheringDropRate;

        adValueCookingTime.setText(Float.toString(adStatCookingTime));
        adValueProcessingSuccessRate.setText(Integer.toString(adStatProcessingSuccessRate));
        adValueWeightLimit.setText(Integer.toString(adStatWeightLimit));
        adValueGatheringFishingLvl.setText(Integer.toString(adStatGatheringFishingLvl));
        adValueGatheringDropRate.setText(Integer.toString(adStatGatheringDropRate));

        if (adStatCookingTime > 0) {
            adViewCookingTime.setVisibility(View.VISIBLE);
        }
        if (adStatProcessingSuccessRate > 0) {
            adViewProcessingSuccessRate.setVisibility(View.VISIBLE);
        }
        if (adStatWeightLimit > 0) {
            adViewWeightLimit.setVisibility(View.VISIBLE);
        }
        if (adStatGatheringFishingLvl > 0) {
            adViewGatheringFishingLvl.setVisibility(View.VISIBLE);
        }
        if (adStatGatheringDropRate > 0) {
            adViewGatheringDropRate.setVisibility(View.VISIBLE);
        }
    }

    private void adCheckRarity(AlchemyStone alchemyStone) {
        switch (alchemyStone.rarity) {
            case "common":
                adAlchemyName.setTextColor(adAlchemyName.getResources().getColor(R.color.colorItemCommon));
                break;
            case "uncommon":
                adAlchemyName.setTextColor(adAlchemyName.getResources().getColor(R.color.colorItemUncommon));
                break;
            case "rare":
                adAlchemyName.setTextColor(adAlchemyName.getResources().getColor(R.color.colorItemRare));
                break;
            case "epic":
                adAlchemyName.setTextColor(adAlchemyName.getResources().getColor(R.color.colorItemEpic));
                break;
        }
    }


}
