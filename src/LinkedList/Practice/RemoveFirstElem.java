package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveFirstElem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList ls=new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        System.out.println("Linked List 1:"+ls);
        System.out.println("The first element :"+ls.removeFirst());
        System.out.println("After List :"+ls);
    }
}
