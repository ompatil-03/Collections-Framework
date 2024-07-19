package Vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorIntro {
    public static void main(String[] args) {
        Vector<Integer> vc=new Vector<>();
        vc.add(1);
        vc.add(2);
        vc.add(3);
        vc.add(4);
        System.out.println("Vector :"+vc);
        Vector<Integer> vc2= (Vector<Integer>) vc.clone();

        vc.addAll(vc);
        System.out.println("Using AddAll:--->"+vc);
        System.out.println("Using get(3):--->"+vc.get(3));
        System.out.println("Using contains(5) :--->"+vc.contains(5));
        System.out.println("Using clone():--->"+vc2);
        System.out.println("indexOf(4):--->"+vc.indexOf(4));
        System.out.println("lastIndexOf(4):--->"+vc.lastIndexOf(4));
        vc.removeElement(4);
        System.out.println("remove(4) :--->"+vc);
        System.out.println("sublist(2,5) :"+vc.subList(2,5));
        System.out.println("toArray() :--->"+ Arrays.toString(vc.toArray()));
        Collections.sort(vc);
        System.out.println("Using Collection.sort():--->"+vc);
        vc.trimToSize();
        vc2.removeElement(3);
        vc2.removeElement(4);
        vc.retainAll(vc2);
        System.out.println("using retainAll():--->"+vc);
        vc.setElementAt(100,2);
        System.out.println("setElement(2,100):--->"+vc);
        vc.insertElementAt(84,1);
        System.out.println("insertElement(84,1):--->"+vc);
        

    }
}
