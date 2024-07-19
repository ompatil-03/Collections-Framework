package Maps.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CopyMaps {
    public static void main(String[] args) {

            HashMap<Integer,String> hm=new HashMap<>();
            hm.put(17,"Python");
            hm.put(21,"Java");
            hm.put(32,"JavaScript");
            hm.put(13,"Mango");
            hm.put(27,"HTML");
            hm.put(12,"CSS");
            int count=0;
            System.out.println("Origenal  HashMap :"+hm);
        HashMap<Integer, String> hp = new HashMap<>(hm);
        System.out.println("The clone is :"+hp);

    }
}
