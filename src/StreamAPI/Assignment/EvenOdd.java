package StreamAPI.Assignment;
import java.util.*;
import java.util.stream.*;
public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);
        Map<Boolean, List<Integer>> partitioned = numbers.stream().collect(Collectors.
                partitioningBy(num -> num % 2 == 0));
        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));
    }
}
