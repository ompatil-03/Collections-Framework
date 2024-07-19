package Queue.Practice;

import java.util.PriorityQueue;

public class PriorityQueueII {
    public static void main(String[] args) {
        PriorityQueue<String>ps=new PriorityQueue<>();
        ps.offer("Red");
        ps.offer("Blue");
        ps.offer("Green");
        System.out.println("First PriorityQueue:"+ps);
        PriorityQueue<String>ps1=new PriorityQueue<>();
        ps1.offer("Green");
        ps1.offer("Blue");
        ps1.offer("Red");
        System.out.println("First PriorityQueue:"+ps1);
        int count=0;
        for(String s:ps){
            if (ps1.contains(s)){
                count++;
            }
        }
        if(ps1.size()==ps.size()&&count==ps.size()){
            System.out.println("The both queues are equal !");
        }else {
            System.out.println("The both queues are not equal !");
        }
    }
}
