package Maps.TreeMap;
import java.util.*;
public class GreatestKeyValue {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            TreeMap<Integer, String> map = new TreeMap<>();
            map.put(1, "one");
            map.put(2, "two");
            map.put(3, "three");
            map.put(4, "four");
            map.put(5, "five");
            System.out.println("Enter a key :");
            int key = s.nextInt();
            Map.Entry<Integer, String> entry = map.floorEntry(key);
            if (entry != null) {
                System.out.println("Key:"+entry.getKey()+", Value: "+entry.getValue());
            } else {
                System.out.println("No such key found.");
            }
        }
}
