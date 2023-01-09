package armor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class armorTable {
    // method to get armor stats
    public String getArmor(int quality){
        Random arm_type_rng = new Random();
        ArrayList<String> arm_stats = new ArrayList<>();         // store armor stats

        int armor_type_key = arm_type_rng.nextInt(armorType().size());

        return armorType().get(armor_type_key);
    }

    public HashMap<Integer, String> armorType (){
        HashMap<Integer, String> armor = new HashMap<>();

        // heavy
        armor.put(0, "Helm");
        armor.put(1, "Pauldrons");
        armor.put(2, "Cuirass");
        armor.put(3, "Greaves");
        armor.put(4, "Gauntlets");
        armor.put(5, "Chausses");
        armor.put(6, "Girdle");

        // medium
        armor.put(7, "Hood");
        armor.put(8, "Pauldrons");
        armor.put(9, "Cuirass");
        armor.put(10, "Cuisses");
        armor.put(11, "Bracers");
        armor.put(12, "Boots");
        armor.put(13, "Belt");

        // light
        armor.put(14, "Hat");
        armor.put(15, "Mantle");
        armor.put(16, "Shirt");
        armor.put(17, "Pants");
        armor.put(18, "Gloves");
        armor.put(19, "Shoes");
        armor.put(20, "Sash");
        armor.put(21, "Robes");

        return armor;
    }
}
