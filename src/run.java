import armor.armorAttributeTable;
import armor.armorTable;

public class run {
    public static void main(String[] args) {
        armorTable armorTable = new armorTable();
        armorAttributeTable armorAttributeTable = new armorAttributeTable();

        int test_loop_cnt = 5;

        // quality = common - 6, rare - 5, epic - 4, legendary - 3, and celestial - 2
        int quality = 4;

        for(int i = 0; i < test_loop_cnt; i++) {
            System.out.println("Item Quality = " + quality);
            armorTable.getArmor(quality);
            armorAttributeTable.getStat(quality);
            System.out.println();
        }
    }
}
