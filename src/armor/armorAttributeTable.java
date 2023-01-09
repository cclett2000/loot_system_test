package armor;

import structure.attributeObject;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class armorAttributeTable {
    static final int STAT_COUNT = 9;

    public ArrayList<Object> getStat(int quality){
        attributeObject stat_storage = new attributeObject();
        Random stat_rng = new Random();
        ArrayList<Object> stats = new ArrayList();

        int stat_num = 0;
        int stat_key = 0;

        if (quality == 2) stat_num = 4;
        if (quality == 3) stat_num = 3;
        if (quality == 4) stat_num = 2;
        if (quality == 5) stat_num = 1;
        if (quality == 6) stat_num = 1;

        for(int i = 0; i < stat_num; i++) {
            stat_key = stat_rng.nextInt(STAT_COUNT);
            stat_storage.setName(getAttributeName(stat_key));
            stat_storage.setEffect(getAttributeEffect(stat_key));
            stat_storage.setValueORPercent(getAttributeValueORPercent(quality, stat_key));
            stats.add(stat_storage);
        }

        System.out.println(stats);

        return stats;
    }

    // quality is the divisor -- max value / quality >> then that is max for RNG
    // num of att = common - 0, rare - 1, epic - 2, legendary - 3, and celestial - 4
    // both values must be synced

    // quality = common - 6, rare - 5, epic - 4, legendary - 3, and celestial - 2
    private String getAttributeName(int index){
        String attribute = "No Attribute Name";            // stores attribute name
        ArrayList<String> att_name = new ArrayList<>();    // holds attribute names to be randomly selected

        // main attribute names
        att_name.add("Plated");
        att_name.add("Healthy");
        att_name.add("Inspired");
        att_name.add("Tenacious");

        // sub att?
        att_name.add("Dispelling");
        att_name.add("Seared");
        att_name.add("Frozen");
        att_name.add("Grounded");
        att_name.add("Poison Resist");

        attribute = att_name.get(index);

        return attribute;
    }

    // quality = common - 6, rare - 5, epic - 4, legendary - 3, and celestial - 2
    private String getAttributeEffect(int index){
        String attribute = null;                           // stores attribute name
        ArrayList<String> att_name = new ArrayList<>();    // holds attribute names to be randomly selected

        // main attributes
        att_name.add("Armor");
        att_name.add("Health");
        att_name.add("Mana");
        att_name.add("Stamina");

        att_name.add("Magic Resist");
        att_name.add("Fire Resist");
        att_name.add("Ice Resist");
        att_name.add("Shock Resist");
        att_name.add("Poison Resist");

        attribute = att_name.get(index);

        return attribute;
    }

    // quality = common - 6, rare - 5, epic - 4, legendary - 3, and celestial - 2
    private int getAttributeValueORPercent(int quality, int index){
        // min percent is 5 -- min value is 10
        Random rng = new Random();
        int value = 0;                                        // stores attribute value
        ArrayList<Integer> att_values = new ArrayList<>();    // holds attribute names to be randomly selected

        // max values
        att_values.add(100);    // armor
        att_values.add(50);     // health
        att_values.add(50);     // mana
        att_values.add(50);     // stam

        // max percentages
        att_values.add(66);     // mag res
        att_values.add(75);     // fire res
        att_values.add(75);     // ice res
        att_values.add(75);     // shock res
        att_values.add(75);     // poison res

        if (quality > 1) {
            int div_max = att_values.get(index) / (quality - 1);
            int div_min = att_values.get(index) / quality;
            value = div_min + rng.nextInt(div_max - div_min);
            System.out.println("Index: " + index + " || Attribute: " + getAttributeEffect(index) +  " || Min Value: " + div_min + " || Max Value: " + div_max +  " || Value: " + value);
        }

        else{
            int div_max = att_values.get(index) / quality;
            value = rng.nextInt(div_max);
            System.out.println("Index: " + index + " || Attribute: " + getAttributeEffect(index) + " || Max Value: " + div_max + " || Value: " + value);
        }

        return value;
    }
}
