package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class ElementInsertionIII {
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
        System.out.println("Enter the element :");
        int elm=s.nextInt();
        System.out.println("Enter the index :");
        int ind=s.nextInt();
        ls.add(ind,elm);
        System.out.println("List after Insertion :");
        System.out.println(ls);
    }
}
