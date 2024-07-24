package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondSmallestElement {
    public static void main(String[] args) {
        List<Integer>ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("List :"+ls);
        Stream s=ls.stream().filter(a->a!=ls.stream().mapToInt(i->i).min().getAsInt());
        System.out.println("Second min :");
        System.out.println(s.mapToInt(i-> (int) i).min().getAsInt());
    }
}
