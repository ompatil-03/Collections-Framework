package Queue.Practice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueInitialization {
    public static void main(String[] args) {
        PriorityQueue<String> ps=new PriorityQueue<>();
        ps.offer("Blue");
        ps.offer("Green");
        ps.offer("Red");
        System.out.println(ps);
        PriorityQueue<String> ps1=new PriorityQueue<>();
        ps1.offer("SkyBlue");
        ps1.offer("Golden");

        System.out.println("Using iterator :");
        Iterator it=ps.iterator();
        int count=0;
        while (it.hasNext()){
            count++;
            System.out.println(it.next());
        }
        System.out.println("No of elements in queue:"+count);
        System.out.println("Another Queue:"+ps1);
        ps.addAll(ps1);
        System.out.println("After adding queue 1 and queue 2:"+ps);
        ps.offer("Silver");
        System.out.println("After adding element :"+ps);

        ps1.clear();
        System.out.println("After removing all element :"+ps1);
    }
}
