package ConsumerInterface;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HashMapUsingBiConsumer {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"java");
        hm.put(2,"python");
        hm.put(3,"html");
        hm.put(4,"css");
        hm.put(5,"javaScript");
        System.out.println("Using BiConsumer inteface :");
        BiConsumer<Integer,String>bi=(a,b)-> System.out.println(a+" :: "+b);
        hm.forEach(bi);
        System.out.println("Using one line code :");
        hm.forEach((a,b)-> System.out.println(a+"  ::  "+b));
    }
}
