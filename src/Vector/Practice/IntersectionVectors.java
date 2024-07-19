package Vector.Practice;

import java.util.Vector;

public class IntersectionVectors {
    public static void main(String[] args) {
        Vector<Integer> vc=new Vector<>();
        vc.add(11);
        vc.add(22);
        vc.add(33);
        vc.add(44);
        vc.add(55);
        vc.add(66);
        System.out.println("current Vector v1:"+vc);
        Vector<Integer> vc1=new Vector<>();
        vc1.add(10);
        vc1.add(22);
        vc1.add(30);
        vc1.add(44);
        vc1.add(50);
        vc1.add(66);
        System.out.println("current Vector v2:"+vc1);
        System.out.println("----------------------------------------");
        vc.retainAll(vc1);
        System.out.println("The intersection is :"+vc);
    }
}
