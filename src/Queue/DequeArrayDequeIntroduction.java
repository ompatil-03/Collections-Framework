package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeArrayDequeIntroduction {
    public static void main(String[] args) {
        Deque<String> dq=new ArrayDeque<>();
        System.out.println("Using offer Method:");
        dq.offer("Java");
        dq.offer("SQL");
        dq.offer("Java-Script");
        dq.offer("CSS");
        dq.offer("HTML");
        System.out.println("Using Offer():"+dq);
        System.out.println("Using RemoveFirst():"+dq.removeFirst());
        System.out.println("Using RemoveLast():"+dq.removeLast());
        dq.offerFirst("GoLang");
        System.out.println("OfferFirst():"+dq);
        dq.offerLast("React");
        System.out.println("OfferLast():"+dq);
        System.out.println("pollFirst():"+dq.pollFirst());
        System.out.println("pollLast():"+dq.pollLast());
        System.out.println("-----------------------");
        System.out.println("Using Iterator:");
        Iterator it=dq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
