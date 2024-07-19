package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class JoinTwoLinkedList {
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
        LinkedList ls1=new LinkedList();
        ls1.add(10);
        ls1.add(20);
        ls1.add(30);
        ls1.add(40);
        ls1.add(50);
        System.out.println("Linked List 2:"+ls1);
        System.out.println("After Merging :");
        ls.addAll(ls1);
        System.out.println(ls);



    }
}
