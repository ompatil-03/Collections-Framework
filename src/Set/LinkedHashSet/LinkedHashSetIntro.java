package Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetIntro {
    public static void main(String[] args) {
        LinkedHashSet<Integer>ls=new LinkedHashSet<>();
        ls.add(23);
        ls.add(97);
        ls.add(87);
        ls.add(778);
        ls.add(265);
        ls.add(54);
        ls.add(null);
        System.out.println("LinkedHashSet:"+ls);
    }
}
