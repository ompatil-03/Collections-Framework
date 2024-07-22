package Maps.LinkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.TreeMap;

public class GreatestKeyAndLeastKey {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(75,"Java");
        lhm.put(65,"Python");
        lhm.put(20,"C++");
        lhm.put(25,"C");
        System.out.println("LinkedHashMap: "+lhm);
        TreeMap<Integer,String>tm=new TreeMap<>(lhm);
        System.out.println("Lowest Key");
        System.out.println(tm.firstKey()+"-->"+lhm.get(tm.firstKey()));
        System.out.println("Highest Key:");
        System.out.println(tm.lastKey()+"-->"+lhm.get(tm.lastKey()));
//        System.out.println("Reversed: "+lhm.reversed());

    }
}
