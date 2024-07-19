package Maps.HashMap;

import java.util.HashMap;

public class Contains {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(17,"Python");
        hm.put(21,"Java");
        hm.put(32,"JavaScript");
        System.out.println("HashMap:"+hm);
        System.out.println("containsKey(21):"+hm.containsKey(21));
        System.out.println("containsKey(22):"+hm.containsKey(22));
        System.out.println("containsValue(Java):"+hm.containsValue("Java"));
        System.out.println("containsValue(java):"+hm.containsValue("java"));
    }
}
