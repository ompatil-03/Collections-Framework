package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class CompareTwoHashSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        set.add(12);
        set.add(84);
        set.add(62);
        set.add(74);
        set1.add(91);
        set1.add(48);
        set1.add(161);
        System.out.println("First HashSet:"+set);
        System.out.println("Second HashSet:"+set1);
        if (set.equals(set1)){
            System.out.println("HashSets are Equal");
        }else {
            System.out.println("HashSets are not equal");
        }
    }
}
