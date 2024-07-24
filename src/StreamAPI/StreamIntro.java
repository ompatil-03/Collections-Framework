package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class StreamIntro {
    public static void main(String[] args) {
        List<Integer>ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10,4,5,6,4,2,1,10);
        System.out.println("List :"+ls);
        System.out.println("List with distinct Elements :");
        ls.stream().distinct().forEach(System.out::println);
        ls=ls.stream().distinct().toList();
        System.out.println("Even :"+ls.stream().filter(i->i%2==0).toList());
        System.out.println("Odd :"+ls.stream().filter(i->i%2==1).toList());

    }
}
