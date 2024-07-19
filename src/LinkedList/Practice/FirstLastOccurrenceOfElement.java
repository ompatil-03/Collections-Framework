package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class FirstLastOccurrenceOfElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList ls=new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(1);
        ls.add(5);
        ls.add(2);
        System.out.println("Linked list :"+ls);
        System.out.println("Enter the element :");
        int elm=s.nextInt();
        System.out.println("The First Occurrence :"+ls.indexOf(elm));
        System.out.println("The last Occurrence :"+ls.lastIndexOf(elm));

    }
}
