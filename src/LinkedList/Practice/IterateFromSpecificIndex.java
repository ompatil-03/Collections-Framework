package LinkedList.Practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class IterateFromSpecificIndex {
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
        System.out.println("Enter the index to iterate form :");
        int ind=s.nextInt();
        Iterator it=ls.listIterator(ind);
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        for (int i =ind; i <ls.size() ; i++) {
//            System.out.print(ls.get(i)+" ");
//        }
    }
}
