package Queue.Practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueIII {
    public static void main(String[] args) {
        PriorityQueue<String> ps=new PriorityQueue<>();
        ps.offer("Red");
        ps.offer("Blue");
        ps.offer("Green");
        ps.offer("Golden");
        ps.offer("Silver");
        System.out.println("Queue:"+ps);
        System.out.println("Retriving First element:"+ps.peek());
        System.out.println("Retriving and deleting First Element :"+ps.poll());
        System.out.println("Queue:"+ps);
        String[]str=new String[ps.size()];
        Iterator it=ps.iterator();
        int count=0;
        while (it.hasNext()){
            str[count++]=(String)it.next();
        }
        System.out.println("Queue into array :"+ Arrays.toString(str));
    }
}
