package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class SomeQuestion {
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
        System.out.println("The number of elements :"+set.size());
        System.out.println("isEmpty(): "+set.isEmpty());
        Set<Integer> set1=new HashSet<>(set);
        System.out.println("Clone of HashSet:"+set1);
        set.clear();
        System.out.println("After using Clear() method HashSet="+set);
        System.out.println("isEmpty(): "+set.isEmpty());
    }
}
