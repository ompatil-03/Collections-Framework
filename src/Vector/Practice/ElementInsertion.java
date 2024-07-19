package Vector.Practice;

import java.util.Scanner;
import java.util.Vector;

public class ElementInsertion {
    public static void main(String[] args) {
        Vector<Integer> vc=new Vector<>();
        vc.add(11);
        vc.add(22);
        vc.add(33);
        vc.add(44);
        vc.add(55);
        vc.add(66);
        System.out.println("current Vector:"+vc);
        System.out.println("Enter the element you want to add :");
        Scanner s=new Scanner(System.in);
        int val=s.nextInt();
        System.out.println("Enter the index :");
        int ind=s.nextInt();
        vc.add(ind,val);
        System.out.println("modified Vector:"+vc);
    }
}
