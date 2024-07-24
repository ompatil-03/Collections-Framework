package Maps.TreeMap;
import java.util.*;
public class LessThenOrEqualToKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        int key = 4;
        boolean inclusive = true;
        SortedMap<Integer, String> subMap;
        if (inclusive) {
            subMap = map.headMap(key, true);
        } else {
            subMap = map.headMap(key);
        }
        System.out.println("SubMap: " + subMap);
    }
}
