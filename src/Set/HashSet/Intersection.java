package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        set.add(12);
        set.add(84);
        set.add(62);
        set.add(74);
        set.add(122);
        set1.add(91);
        set1.add(48);
        set1.add(161);
        set1.add(12);
        set1.add(74);
        System.out.println("First HashSet:"+set);
        System.out.println("Second HashSet:"+set1);
        set.retainAll(set1);
        System.out.println("Intersection of both sets is :"+set);


    }
}
