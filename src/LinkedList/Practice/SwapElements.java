package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class SwapElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList ls=new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        System.out.println("Linked List :"+ls);
        System.out.println("Enter the two elements you want to swap positions");
        int a = s.nextInt();
        int b = s.nextInt();
        int ind = ls.indexOf(a);
        int ind2=ls.indexOf(b);
      //  System.out.println(ind);
        //System.out.println(ind2);
        ls.remove(ind);
        ls.remove(ind2-1);
        //System.out.println(ls);
        ls.add(ind,b);
        ls.add(ind2,a);
        System.out.println("After swapping :"+ls);
    }
}
