package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetIntro {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        set.add(12);
        set.add(84);
        set.add(62);
        set.add(74);
        set1.add(91);
        set1.add(48);
        set1.add(16);
        System.out.println("add():"+set);
        set.addAll(set1);
        System.out.println("addAll():"+set);
        System.out.println("Contains(91):"+set.contains(91));
        System.out.println("ContainsAll(set1):"+set.containsAll(set1));
        System.out.println("isEmpty():"+set.isEmpty());
        set.remove(16);
        System.out.println("remove(16):"+set);
        set.retainAll(set1);
        System.out.println("retainAll(set1):"+set);
        set.removeAll(set1);
        set.add(84);
        set.add(62);
        set.add(74);
        set.add(91);
        System.out.println("removeAll(set1):"+set);
        set.clear();
        System.out.println("clear():"+set);
        System.out.println("isEmpty():"+set.isEmpty());
    }
}
