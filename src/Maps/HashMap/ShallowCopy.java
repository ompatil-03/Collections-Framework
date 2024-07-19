package Maps.HashMap;

import java.util.HashMap;

public class ShallowCopy {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(17,"Python");
        hm.put(21,"Java");
        hm.put(32,"JavaScript");
        int count=0;
        System.out.println("Origenal  HashMap :"+hm);
        HashMap<Integer, String> hp = (HashMap<Integer, String>)hm.clone();
        System.out.println("The clone is :"+hp);

    }
}
