package Maps.HashMap;

import java.util.HashMap;
import java.util.Map;

public class SetView {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(12,"Mango");
        hm.put(54,"java");
        hm.put(43,"japan");
        hm.put(75,"Nagasaki");
        hm.put(90,"Gun");
        System.out.println("HashMap:"+hm);
        System.out.println("Set Representation:");
        for(Map.Entry<Integer,String>e:hm.entrySet()){
            System.out.println("key:"+e.getKey()+" value:"+e.getValue());
        }
    }
}
