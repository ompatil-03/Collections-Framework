package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveSpecifiedElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList ls=new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);ls.add(7);ls.add(8);
        System.out.println("Linked List :"+ls);
        System.out.println("Enter the element you want to remove :");
        int elm=s.nextInt();
        ls.removeLastOccurrence(elm);
        System.out.println("After deletion :");
        System.out.println(ls);


    }
}
