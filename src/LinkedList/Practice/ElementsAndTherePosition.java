package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class ElementsAndTherePosition {
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
        System.out.println("Element and there positions: ");
        for (int i = 0; i < ls.size(); i++) {
            System.out.println("Element :"+ls.get(i)+" index:"+i);
        }
    }
}
