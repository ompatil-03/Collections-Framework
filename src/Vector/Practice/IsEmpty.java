package Vector.Practice;

import java.util.Vector;

public class IsEmpty {
    public static void main(String[] args) {
        Vector<Integer> vc=new Vector<>();
        vc.add(11);
        vc.add(22);
        vc.add(33);
        vc.add(44);
        vc.add(55);
        vc.add(66);
        System.out.println("Vector v1:"+vc);
        System.out.println("is Empty :"+vc.isEmpty());
        vc.clear();
        System.out.println("Vector v2: "+vc);
        System.out.println("is Empty :"+vc.isEmpty());
    }
}
