package Maps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SortKeys {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(75,"Java");
        lhm.put(65,"Python");
        lhm.put(20,"C++");
        lhm.put(25,"C");
        System.out.println("LinkedHashMap: "+lhm);
        TreeMap<Integer,String> tm=new TreeMap<>(lhm);
        System.out.println("Sorted For Keys: "+tm);
    }
}
