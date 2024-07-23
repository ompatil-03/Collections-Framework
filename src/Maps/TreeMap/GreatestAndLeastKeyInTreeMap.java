package Maps.TreeMap;

import java.util.TreeMap;

public class GreatestAndLeastKeyInTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(23,"Math");
        tm.put(99,"Physics");
        tm.put(74,"Chemistry");
        tm.put(84,"Biology");
        tm.put(29,"English");
        System.out.println("The TreeMap:"+tm);
        System.out.println("The least Key:"+tm.firstEntry());
        System.out.println("The greatest Key:"+tm.lastEntry());
    }
}
