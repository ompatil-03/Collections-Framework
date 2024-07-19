package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueIntroduction {
    public static void main(String[] args) {
        PriorityQueue<Integer>ps=new PriorityQueue<>();
        ps.offer(12);
        ps.offer(19);
        ps.offer(1);
        ps.offer(93);
        ps.offer(56);
      //  ps.add(null);
        System.out.println(ps);
        PriorityQueue<String>priorityQueueString=new PriorityQueue<>();
        priorityQueueString.offer("Ram");
        priorityQueueString.offer("Sham");
        priorityQueueString.offer("Tom");
        priorityQueueString.offer("America");
        System.out.println(priorityQueueString);
        System.out.println("Using iterator :");
        Iterator it=ps.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
            //it.next();
        }
        System.out.println("Using Poll      :"+ps.poll());
        System.out.println("Using peek()    :"+ps.peek());
        System.out.println("Using remove    :"+ps.remove());
        System.out.println("Using element() :"+ps.element());
//        System.out.println("Using element()"+ps.element());


    }
}
