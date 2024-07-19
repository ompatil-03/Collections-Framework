package Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorInSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(84);
        set.add(62);
        set.add(74);
        set.add(91);
        set.add(48);
        set.add(16);
        System.out.println("HashSet:"+set);
        Iterator i= set.iterator();
        System.out.println("Iterating Using Iterator:");
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
