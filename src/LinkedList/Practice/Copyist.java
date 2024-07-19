package LinkedList.Practice;

import java.util.LinkedList;
import java.util.Scanner;

public class Copyist {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedList ls=new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        System.out.println("Linked List 1:"+ls);
        LinkedList ls1=(LinkedList) ls.clone();
        System.out.println("Copied List :"+ls1);
    }
}
