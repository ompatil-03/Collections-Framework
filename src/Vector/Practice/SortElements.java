package Vector.Practice;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class SortElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter element and enter -1 to exit :");
        Vector<Integer> vc=new Vector<>();
        int n=0,sum=0;
        do{
            n=s.nextInt();
            if (n!=-1){
                vc.add(n);
                sum+=n;
            }
        }while (n!=-1);
        System.out.println("The Vector is :"+vc);
        Collections.sort(vc);
        System.out.println("Sorted Vector :"+vc);
    }
}
