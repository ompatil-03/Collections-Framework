package Vector.Practice;

import java.util.Scanner;
import java.util.Vector;

public class InitializationOfVector {
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
        System.out.println("The Vector of Integer is :"+vc);
        System.out.println("The sum of Elements is :"+sum);
    }
}
