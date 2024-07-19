package Vector.Practice;

import java.util.Scanner;
import java.util.Vector;

public class ElementDeletion {
    public static void main(String[] args) {
        Vector<Integer> vc=new Vector<>();
        vc.add(11);
        vc.add(22);
        vc.add(33);
        vc.add(44);
        vc.add(55);
        vc.add(66);
        System.out.println("current Vector:"+vc);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the index of element to delete :");
        int ind=s.nextInt();
        vc.remove(ind);
        System.out.println("modified Vector:"+vc);
    }
}
