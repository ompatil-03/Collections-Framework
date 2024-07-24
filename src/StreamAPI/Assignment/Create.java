package StreamAPI.Assignment;

import java.util.Arrays;
import java.util.List;

public class Create {
    public static void main(String[] args) {
        List<Integer>ls= Arrays.asList(1,3,4,5,6,7,8,9);
        System.out.println("List :"+ls);
        System.out.println("Printing using stream:");
        ls.stream().forEach(System.out::println);
    }
}
