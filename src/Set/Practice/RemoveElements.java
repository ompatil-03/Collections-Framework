package Set.Practice;

import java.util.Scanner;
import java.util.TreeSet;

public class RemoveElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(7);
        ts.add(5);
        ts.add(11);
        ts.add(10);
        ts.add(6);
        ts.add(4);
        System.out.println("TreeSet:"+ts);
        System.out.println("Enter a number you want to remove  :");
        int num=s.nextInt();
        ts.remove(num);
        System.out.println("TreeSet:"+ts);
        System.out.println("FirstElement:"+ts.pollFirst());
        System.out.println("LastElement:"+ts.pollLast());
        System.out.println("Final TreeSet:"+ts);
    }
}
