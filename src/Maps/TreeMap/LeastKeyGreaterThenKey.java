package Maps.TreeMap;
import java.util.*;
public class LeastKeyGreaterThenKey {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        int key = 2;
        Integer nextKey = map.higherKey(key);
        if (nextKey != null) {
            System.out.println("Least key greater than " + key + " is: " + nextKey);
        } else {
            System.out.println("No such key found.");
        }
    }
}
