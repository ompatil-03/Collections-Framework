package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class ReplaceElement {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        System.out.println("Linked List 1:"+ls);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element you want to add :");
        int elm=s.nextInt();
        System.out.println("Enter the element you wat to replace with:");
        int repl=s.nextInt();
        int num=ls.indexOf(repl);
        ls.remove(num);
        ls.add(num,elm);
        System.out.println("Modified linked list :"+ls);
    }
}
