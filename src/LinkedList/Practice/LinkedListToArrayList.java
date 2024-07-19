package LinkedList.Practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        System.out.println("Linked List :"+ls);
        ArrayList al=new ArrayList(ls);
        System.out.println("by using : ArrayList al=new ArrayList(ls);");
        System.out.println("Array List :"+al);
    }
}
