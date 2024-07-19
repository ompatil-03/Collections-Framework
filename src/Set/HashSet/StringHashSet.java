package Set.HashSet;

import javax.print.DocFlavor;
import java.util.HashSet;
import java.util.Iterator;

public class StringHashSet {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        String str="apple";
        System.out.println();
        System.out.println();
        hs.add("Apple");
        hs.add("kiwi");
        hs.add("Banana");
        hs.add("Orange");
        System.out.println(new String("AB").hashCode());
        System.out.println(hs);
        Iterator i=hs.iterator();
        while (i.hasNext()){
            String s=(String) i.next();
            System.out.println(s+" hashValue: "+ s.hashCode()+" mod:"+((double)s.hashCode()%16));
        }
    }
}
