package Set.Practice;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetInitialization {
    public static void main(String[] args) {
        TreeSet<String>ts=new TreeSet<>();
        ts.add("Red");
        ts.add("Blue");
        ts.add("Yellow");
        ts.add("Green");
        ts.add("Violet");
        System.out.println("TreeSet:"+ts);
        System.out.println("---------------------------");
//        System.out.println("Using Iterator");
        int count=0;
        Iterator it=ts.iterator();
        while (it.hasNext()){
            count++;
            it.next();
        }
//        System.out.println("---------------------------");
//        System.out.println("in revers Order :");
//        it=ts.descendingIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        TreeSet<String>ts2=new TreeSet<>();
        ts2.add("Burgundy");
        ts2.add("SkyBlue");
        System.out.println("TreeSet2:"+ts2);
        System.out.println("Comparing to TreeSet for equal:"+ts.equals(ts2));
//        System.out.println("---------------------------");
//        System.out.println("Another tree set:"+ts2);
//        System.out.println("---------------------------");
       //System.out.println("After adding both tree sets :");
//        ts.addAll(ts2);
//        System.out.println(ts);
//        TreeSet ts2=(TreeSet) ts.clone();
//        System.out.println("First Element:"+ts.pollFirst());
//        System.out.println("Last Element:"+ts.pollLast());
//        System.out.println("Clone :"+ts2);
//        System.out.println("Number of Elements :"+count);
    }
}
