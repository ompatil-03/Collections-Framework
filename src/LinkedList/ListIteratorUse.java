package LinkedList;

import java.util.ArrayList;
import   java.util.ListIterator;
import java.util.Vector;

public class ListIteratorUse {
    public static void main(String[] args) {
        ArrayList <Integer>al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        ListIterator<Integer> ls=al.listIterator();
        System.out.println("ArrayList :");
        while (ls.hasNext()){
            System.out.println(ls.next());
        }
        System.out.println("Revers ArrayList:");
        while (ls.hasPrevious()){
            System.out.println(ls.previous());
        }


    }
}
