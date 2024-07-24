package StreamAPI;

import java.util.*;

public class Count {
    public static void main(String[] args) {
        List<Integer>ls= Arrays.asList(1,3,5,7,9,11);
        System.out.println("List :"+ls);
        System.out.println("Count is :"+ls.stream().count());
    }
}
