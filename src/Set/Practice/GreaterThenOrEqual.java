package Set.Practice;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class GreaterThenOrEqual {
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
        System.out.println("The numbers greater then or equal to"+num+" :");
        Iterator iterator=ts.iterator();
        while (iterator.hasNext()){
            int val=(int)iterator.next();
            if((val)>=num){
                System.out.println(val);
            }
        }
    }
}
