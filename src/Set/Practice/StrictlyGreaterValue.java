package Set.Practice;

import java.util.Scanner;
import java.util.TreeSet;

public class StrictlyGreaterValue {
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
        System.out.println("Enter a number :");
        int num=s.nextInt();
        System.out.println("The strictly greater number : ");
        System.out.println(ts.higher(num));
        System.out.println("The strictly lower number :");
        System.out.println(ts.lower(num));
    }
}
