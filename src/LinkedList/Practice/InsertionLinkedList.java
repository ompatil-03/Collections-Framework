package LinkedList.Practice;

import java.util.LinkedList;

public class InsertionLinkedList {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.add(11);
        ls.add(12);
        ls.add(13);
        ls.add(14);
        ls.add(15);
        ls.add(16);
        System.out.println("Linked list :"+ls);
        ls.add(2,88);
        System.out.println("After adding 88 at index 2 :");
        System.out.println(ls);
        ls.addFirst(111);
        ls.addLast(222);
        System.out.println("After Adding at first and last\n"+ ls);
    }
}
