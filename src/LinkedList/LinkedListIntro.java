package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIntro {
    public static void main(String[] args) {
        LinkedList lk=new LinkedList();
        lk.add(11);
        lk.add(12);
        lk.add(13);
        lk.add(11);
        lk.add(98);
        System.out.println("Linked List :"+lk);
        lk.add(0,99);
        System.out.println("Using Iterator :");
        Iterator it=lk.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Using Descending Iterator :");
        Iterator it1=lk.descendingIterator();
        while (it1.hasNext()){
            System.out.print(it1.next()+" ");
        }
//        for (Object i:lk){
//            System.out.println(i);
//        }
        System.out.println();
        System.out.println("Contains Method for 11 :"+lk.contains(11));
        System.out.println("Fist index of 11 :"+lk.indexOf(11));
        System.out.println("Last Index of 11 :"+lk.lastIndexOf(11));
        System.out.println("Index of 12 :"+lk.indexOf(12));
        System.out.println("After remove First:"+lk.removeFirst());
        System.out.println("After removing Last:"+lk.removeLast());
        System.out.println(lk);
        System.out.println("Remove last occurrence of 11:"+lk.removeLastOccurrence(11));
        System.out.println(lk);
        LinkedList lk1=new LinkedList();
        lk1.add(11);
        lk1.add(22); lk1.add(33);
        lk1.add(44); lk1.add(13);
        System.out.println("Second linked list :"+lk1);
        System.out.println("using retainAll: ");
        lk.retainAll(lk1);
        System.out.println(lk);



    }
}
