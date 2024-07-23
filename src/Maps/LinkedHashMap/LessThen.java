package Maps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class LessThen {
    public static void main(String[] args) {
        TreeMap<Integer,String> lhm=new TreeMap<>();
        lhm.put(75,"Java");
        lhm.put(65,"Python");
        lhm.put(20,"C++");
        lhm.put(25,"C");
        System.out.println("TreeMap:"+lhm);
        System.out.println("Enter a Key");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
      //  System.out.println("Key Value Pair: "+lhm.ceilingEntry(a));
        System.out.println("Strictly greater then given key :");
        System.out.println(
        lhm.ceilingKey(a));
        System.out.println(lhm.higherEntry(a));
        //System.out.println(lhm.ceilingKey(a));
//        System.out.println(lhm.headMap(a));;
//        System.out.println("less then or equal to ");
//        System.out.println(lhm.headMap(a,true));
    }
}
