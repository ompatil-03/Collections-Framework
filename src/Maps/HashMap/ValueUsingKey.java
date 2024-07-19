package Maps.HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class ValueUsingKey {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(12,"Mango");
        hm.put(54,"java");
        hm.put(43,"japan");
        hm.put(75,"Nagasaki");
        hm.put(90,"Gun");
        System.out.println("HashMap:"+hm);
        System.out.println("Enter the key :");
        int i=s.nextInt();
        System.out.println("Value:"+hm.get(i));
    }
}
