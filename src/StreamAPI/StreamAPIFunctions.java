package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIFunctions {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10,4,5,6,4,2,1,10);;
        System.out.println("List :"+ls.stream().distinct().toList());
        ls=ls.stream().distinct().toList();
//        System.out.println("Even :"+ls.stream().filter(i->i%2==0).toList());
//        System.out.println("Odd :"+ls.stream().filter(i->i%2==1).toList());
        System.out.println("Sum : "+ls.stream().mapToInt(i->i).sum());
        System.out.println("Average: "+ls.stream().mapToInt(i->i).average().getAsDouble());
        System.out.println("Max : "+ls.stream().mapToInt(i->i).max().getAsInt());
        System.out.println("Min : "+ls.stream().mapToInt(i->i).min().getAsInt());
//        System.out.println("Min : "+ls.stream().mapToInt(i->i).);
    }
}
