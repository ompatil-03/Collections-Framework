package Set.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of list:");
        int n=s.nextInt();
        ArrayList<Integer>al=new ArrayList<>();
        System.out.println("Enter the list elements :");
        for (int i = 0; i < n; i++) {
            al.add(s.nextInt());
        }
        System.out.println("ArrayList:"+al);
        HashSet<Integer>hs=new HashSet<>(al);
        System.out.println("After removing duplicates :\n"+hs);
    }
}
