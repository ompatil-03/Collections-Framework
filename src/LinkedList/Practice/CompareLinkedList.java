package LinkedList.Practice;

import java.util.LinkedList;

public class CompareLinkedList {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        System.out.println("Linked List 1:"+ls);
        LinkedList ls2=new LinkedList();
        ls2.add(1);
        ls2.add(2);
        ls2.add(5);
        ls2.add(6);
        ls2.add(7);
        ls2.add(9);
        System.out.println("Linked List 2:"+ls2);
        if (ls.containsAll(ls2)) {
            System.out.println("Both list are equal ");
        }else {
            System.out.println("Both list are not equal");
        }
        System.out.println("----------------------------");
        ls.removeLast();
        ls2.removeLast();
        System.out.println("Linked List 1:"+ls);
        System.out.println("Linked List 2:"+ls2);

        if (ls.containsAll(ls2)) {
            System.out.println("Both list are equal ");
        }else {
            System.out.println("Both list are not equal");
        }
    }
}
