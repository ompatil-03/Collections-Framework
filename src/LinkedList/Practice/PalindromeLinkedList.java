package LinkedList.Practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer>ls=new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(3);
        ls.add(2);
        ls.add(1);
        System.out.println("Linked list :"+ls);
        Iterator i1=ls.iterator();
        ListIterator i2=ls.listIterator();
        while (i2.hasNext()){
            i2.next();
        }
        boolean bl=true;
        while (i1.hasNext()&&i2.hasPrevious()){
            if (i1.next()!=i2.previous()){
               bl=false;
            }
        }
        if(bl){
            System.out.println("Linked list is Palindrome");
        }else {
            System.out.println("linked list is not palindrome");
        }
    }
}
