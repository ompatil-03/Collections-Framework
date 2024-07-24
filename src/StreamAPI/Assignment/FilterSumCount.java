package StreamAPI.Assignment;

import java.util.Arrays;
import java.util.List;

public class FilterSumCount {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,3,4,5,6,7,8,9);
        System.out.println("List :"+ls);
        System.out.println("Even Number :"+ls.stream().filter(i->i%2==0).toList());
        System.out.println("Sum :"+ls.stream().mapToInt(i->i).sum());
        System.out.println("Count :"+ls.stream().count());
        System.out.println("Max Number :"+ls.stream().mapToInt(i->i).max().getAsInt());
    }
}
