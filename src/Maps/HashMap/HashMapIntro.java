package Maps.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(17,"Python");
        hm.put(21,"Java");
        hm.put(32,"JavaScript");
        hm.put(13,"Mango");
        hm.put(27,"HTML");
        hm.put(12,"CSS");
        System.out.println(hm);
        System.out.println("Using Iterator :");
        for (Map.Entry<Integer,String>e:hm.entrySet()){
            System.out.println(e.getKey()+"--->"+e.getValue());
        }

    }
}
