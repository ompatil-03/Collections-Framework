package Maps.TreeMap;

import java.util.TreeMap;

public class CopyTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(75,"Java");
        tm.put(65,"Python");
        tm.put(20,"C++");
        tm.put(25,"C");
        System.out.println("TreeMap 1:"+tm);
        TreeMap<Integer,String>tm1=new TreeMap<>(tm);
        System.out.println("Copied TreeMap:"+tm1);
    }
}
