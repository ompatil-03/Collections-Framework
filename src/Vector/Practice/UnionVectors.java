package Vector.Practice;

import java.util.Vector;

public class UnionVectors {
    public static void main(String[] args) {
        Vector<Integer> vc=new Vector<>();
        vc.add(11);
        vc.add(22);
        vc.add(33);
        vc.add(44);
        vc.add(55);
        vc.add(66);
        System.out.println("Vector v1:"+vc);
        Vector<Integer> vc1=new Vector<>();
        vc1.add(10);
        vc1.add(22);
        vc1.add(30);
        vc1.add(44);
        vc1.add(50);
        vc1.add(66);
        System.out.println("Vector v2:"+vc1);
        for (int i = 0; i <vc1.size(); i++) {
            if(!vc.contains(vc1.get(i))){
                vc.add(vc1.get(i));
            }
        }
        System.out.println("Union Vector :");
        System.out.println(vc);
    }
}
