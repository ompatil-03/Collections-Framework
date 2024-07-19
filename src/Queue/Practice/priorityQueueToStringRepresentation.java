package Queue.Practice;

import java.util.PriorityQueue;

public class priorityQueueToStringRepresentation {
    public static void main(String[] args) {
        PriorityQueue<String> ps=new PriorityQueue<>();
        ps.offer("Blue");
        ps.offer("Green");
        ps.offer("Red");
        System.out.println(ps.toString());
    }
}
