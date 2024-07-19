package Set.Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class NumberLessThen7 {
    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet<>();
        ts.add(1);
        ts.add(7);
        ts.add(5);
        ts.add(11);
        ts.add(10);
        ts.add(6);
        ts.add(4);
        System.out.println("TreeSet:"+ts);
        System.out.println("The numbers less then 7 are :");
        Iterator iterator=ts.iterator();
        while (iterator.hasNext()){
            int val=(int)iterator.next();
            if((val)<7){
                System.out.println(val);
            }
        }
    }
}
