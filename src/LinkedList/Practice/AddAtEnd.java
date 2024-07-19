package LinkedList.Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class AddAtEnd {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.add(11);
        ls.add(12);
        ls.add(13);
        ls.add(14);
        ls.add(15);
        ls.add(16);
        System.out.println("Linked list :"+ls);
        ls.addFirst(99);
        System.out.println("After adding at first :"+ls);
        Iterator it=ls.iterator();
        System.out.println("Using Iterator :");
        while (it.hasNext()){
            System.out.println(it.next());
        }
        ArrayList al=new ArrayList();


    }
}
