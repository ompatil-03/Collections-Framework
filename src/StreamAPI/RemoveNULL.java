package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveNULL {
    public static void main(String[] args) {
        List<String>ls1= Arrays.asList("java","wawa");
        List<String>ls2= Arrays.asList("hawa","gawa");
        System.out.println("List 1: "+ls1);
        System.out.println("List 2: "+ls2);
        System.out.println("Concated List :"+ Stream.concat(ls1.stream(),ls2.stream()));
        System.out.println(ls1);
    }
}
