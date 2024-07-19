package Vector.Practice;

import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class RemoveDuplicatesInVector {
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
        for (int i = 0; i <vc.size(); i++) {
            for (int j = i; j < vc.size(); j++) {
                if (vc.subList(j,vc.size()).contains(vc.get(i))){
                    vc.remove(i);
                    break;
                }
            }
        }
        System.out.println("new Vector:"+vc);
    }

}
