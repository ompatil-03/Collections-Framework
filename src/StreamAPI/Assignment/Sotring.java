package StreamAPI.Assignment;

import java.util.Arrays;
import java.util.List;

public class Sotring {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(10,9,8,3,6,5,7,4,2,1);
        System.out.println("List :"+ls);
        System.out.println("Sorted List :"+ls.stream().sorted().toList());

    }
}
