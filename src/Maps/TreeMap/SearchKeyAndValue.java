package Maps.TreeMap;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class SearchKeyAndValue {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(75,"Java");
        tm.put(65,"Python");
        tm.put(20,"C++");
        tm.put(25,"C");
        System.out.println("TreeMap:"+tm);
//        System.out.println("Enter the key you want to Search:");
//        int a=s.nextInt();
//        System.out.println("Contains: "+tm.containsKey(a));
//        System.out.println("Enter the value you want to search for :");
//        String str=s.next();
//        System.out.println("Contains: "+tm.containsValue(str));
        System.out.println("key Values :");
        Iterator i=tm.keySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
