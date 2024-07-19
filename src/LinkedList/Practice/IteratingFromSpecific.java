package LinkedList.Practice;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratingFromSpecific {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.add(11);
        ls.add(12);
        ls.add(13);
        ls.add(14);
        ls.add(15);
        ls.add(16);
        System.out.println("Linked list :"+ls);
        Iterator it=ls.descendingIterator();
        System.out.println("Revers List :");
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
