import java.util.TreeMap;
public class treeMap {
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        TreeMap<String, String> subMap = new TreeMap<String, String>();
        subMap.put("new0", "New Value");
        subMap.put("new1", "New Value");
        hm.putAll(subMap);
        System.out.println(hm);
    }
}