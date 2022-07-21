import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
 
public class mapping {
    public static void main(String[] args) {
        //declare and initialize a map
        Map<String, String> country_map = new HashMap<String, String>();
        country_map.put("I", "India");
        country_map.put("C", "China");
        country_map.put("A", "America");
        country_map.put("D", "Denmark");
        country_map.put("X", "Hongkong");
        //print original map
        System.out.println("Original Unsorted Map: ");
        display_map(country_map);
 
        System.out.println("\nMap sorted by Key: ");
        Map<String, String> treecountry = new TreeMap<String, String>(country_map);
        display_map(treecountry);
 
    }
 
    public static <K, V> void display_map(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("\t" + entry.getKey() + "\t\t" + entry.getValue());
        }
    }
 
}

