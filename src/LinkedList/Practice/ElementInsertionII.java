package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class ElementInsertionII {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList ls=new LinkedList();
        ls.add(11);
        ls.add(12);
        ls.add(13);
        ls.add(14);
        ls.add(15);
        ls.add(16);
        System.out.println("Linked list :"+ls);
        System.out.println("Enter the element you want to add at Last :");
//        int f=s.nextInt();
//        ls.addFirst(f);
        ls.addLast(s.nextInt());
        System.out.println("After Insertion:");
        System.out.println(ls);
    }
}
