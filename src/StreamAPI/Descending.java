package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Descending {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("List :"+ls);
        System.out.println("Decending :"+ls.stream().sorted().toList().reversed());
//        System.out.println(ls.stream().sorted().toList());
//        System.out.println(ls.stream().sorted(Comparator.reverseOrder()).toList());
    }
}
