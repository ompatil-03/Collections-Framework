package StreamAPI.Assignment;

import java.util.*;
import java.util.stream.*;

public class IntersectionOfList {
    public static void main(String[] args) {
        List<Integer>ls1= Arrays.asList(10,20,30,40,50);
        List<Integer>ls2= Arrays.asList(40,50,60,70,80);
        System.out.println("List 1:"+ls1);
        System.out.println("List 2:"+ls2);
        System.out.println("Intersection: "+ls1.stream().filter(ls2::contains).toList());

    }
}
