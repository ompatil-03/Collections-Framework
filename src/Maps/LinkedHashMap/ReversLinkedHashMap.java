package Maps.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class ReversLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(75,"Java");
        lhm.put(65,"Python");
        lhm.put(20,"C++");
        lhm.put(25,"C");
        System.out.println("LinkedHashMap: "+lhm);
        lhm.reversed();

    }
}
