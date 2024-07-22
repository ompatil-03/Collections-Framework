package Maps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapIntro {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedHashMap<Integer,String>ls=new LinkedHashMap<>();
        ls.put(1,"adfa");
        ls.put(54,null);
        ls.put(59,"ai,m");
        ls.put(13,"trtda");
        ls.put(79,"hhh");
        ls.put(65,"tgfg");
        System.out.println(ls);
        LinkedHashMap<Integer,String>ls1=new LinkedHashMap<>(ls);
        System.out.println("Copied LinkedHashMap: "+ls1);
        System.out.println("Enter a key you want to check:");
        int n=s.nextInt();
        System.out.println("Contains: "+ls.containsKey(n));
        System.out.println("Enter the value :");
        String str=s.next();
        System.out.println("Contains: "+ls.containsValue(str));
        System.out.println("All Keys :");
        for (Map.Entry<Integer,String>e:ls.entrySet()){
            System.out.println(e.getKey());
        }
        ls.clear();
        System.out.println("After removing all values :"+ls);
    }
}
