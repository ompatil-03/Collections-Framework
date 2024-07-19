package LinkedList.Practice;

import java.util.LinkedList;

public class IsEmpty {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        System.out.println("Linked List 1:"+ls);
        System.out.println("is Empty :"+ls.isEmpty());
        ls.clear();
        System.out.println("Linked list 2:"+ls);
        System.out.println("is Empty :"+ls.isEmpty());
    }
}
