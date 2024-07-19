package Set.TreeSet;

import java.util.TreeSet;

public class TreeSetIntro {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(50);
        ts.add(23);
        ts.add(75);
        ts.add(94);
        ts.add(12);
        ts.add(96);
        System.out.println("Set.TreeSet:"+ts);
        System.out.println("#############################");
        System.out.println("celling(25):"+ts.ceiling(25));
        System.out.println("floor(34)  :"+ts.floor(34));
        System.out.println("higher(75) :"+ts.higher(75));
        System.out.println("lower(75)  :"+ts.lower(75));
        System.out.println("pollFirst():"+ts.pollFirst());
        System.out.println("After using pollFirst():"+ts);
        System.out.println("pollLast() :"+ts.pollLast());
        System.out.println("After using pollLast() :"+ts);

    }
}
