package Set.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToArray {
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
        System.out.println("Array :"+ Arrays.toString(set.toArray()));
        TreeSet<Integer> ts=new TreeSet<>(set);
        System.out.println(ts);

    }
}
