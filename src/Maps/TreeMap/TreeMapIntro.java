package Maps.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapIntro {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm=new TreeMap<>();
        tm.put(75,"Java");
        tm.put(65,"Python");
        tm.put(20,"C++");
        tm.put(25,"C");
        tm.put(48,"JavaScript");
        tm.put(89,"GoLang");
        tm.put(99,"Css");
        System.out.println("TreeMap: ");
        for (Map.Entry<Integer,String> e:tm.entrySet()){
            System.out.println(e.getKey()+" => "+e.getValue());
        }
        System.out.println( tm.descendingMap());
        System.out.println(tm.ceilingEntry(23));
        System.out.println(tm.firstEntry());

    }
}
