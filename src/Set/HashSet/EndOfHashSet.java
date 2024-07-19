package Set.HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class EndOfHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(25);
        hs.add(35);
        hs.add(145);
        hs.add(65);
        hs.add(75);
        System.out.println("HashSet:"+hs);
        System.out.println("enter Element you want to add :");
        Scanner s=new Scanner(System.in);
        hs.add(s.nextInt());
        System.out.println(hs);
    }
}
