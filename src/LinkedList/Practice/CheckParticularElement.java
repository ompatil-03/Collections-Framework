package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class CheckParticularElement {
    public static void main(String[] args) {
        LinkedList<Integer> ls=new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        System.out.println("Linked List :"+ls);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element you want to check :");
        int val=s.nextInt();
        boolean b=ls.contains(val);
        if (b){
            System.out.println("The list contains the element :"+val);
        }else {
            System.out.println("The list does not contain element :"+val);
        }
        System.out.println("Enter the element you want to check :");
         val=s.nextInt();
         b=ls.contains(val);
        if (b){
            System.out.println("The list contains the element :"+val);
        }else {
            System.out.println("The list does not contain element :"+val);
        }
    }
}
