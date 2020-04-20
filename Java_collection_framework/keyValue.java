import java.util.*;
public class keyValue {
    public static void main(String args[]) {
        TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();
        TreeMap < Integer, String > tree_map2 = new TreeMap < Integer, String > ();

        tree_map1.put(10, "Red");
        tree_map1.put(70, "Green");
        tree_map1.put(40, "Black");
        tree_map1.put(50, "White");
        tree_map1.put(60, "Pink");
        tree_map2.putAll(tree_map1.descendingMap());
        System.out.println("Orginal TreeMap content: " + tree_map2);
        System.out.println("Min Value is: " + tree_map2.firstKey());
        System.out.println("Max Value is: " + tree_map2.lastKey());
    }
}