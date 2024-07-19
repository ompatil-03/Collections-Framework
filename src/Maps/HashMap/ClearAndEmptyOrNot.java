package Maps.HashMap;

import java.util.HashMap;

public class ClearAndEmptyOrNot {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"john");
        hm.put(2,"ron");
        hm.put(3,"pot");
        hm.put(4,"goat");
        hm.put(5,"Don");
        System.out.println("hashMap:"+hm);
        System.out.println("isEmpty():"+hm.isEmpty());
        hm.clear();
        System.out.println("After using clear() method:"+hm);
        System.out.println("isEmpty():"+hm.isEmpty());
    }
}
