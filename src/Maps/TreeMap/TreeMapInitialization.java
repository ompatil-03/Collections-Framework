package Maps.TreeMap;

import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapInitialization {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=5 ,a;
        String b;
        TreeMap<Integer,String>treeMap=new TreeMap<>();
        System.out.println("Enter 5 key value pair ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Key:");
            a=s.nextInt();
            System.out.println("Enter Value:");
            b=s.next();
            treeMap.put(a,b);
        }
        System.out.println("The treeMap is :"+treeMap);
    }
}
