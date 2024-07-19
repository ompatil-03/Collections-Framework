package Maps.HashMap;

import java.util.HashMap;
import java.util.Map;

public class SetViewOfKeys {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(12,"Mango");
        hm.put(54,"java");
        hm.put(43,"japan");
        hm.put(75,"Nagasaki");
        hm.put(90,"Gun");
        System.out.println("HashMap:"+hm);
        System.out.println("Values---->");
        for(Map.Entry<Integer,String>e:hm.entrySet()){
            System.out.println("Values:"+e.getValue());
        }
    }
}
