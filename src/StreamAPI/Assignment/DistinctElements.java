package StreamAPI.Assignment;
import java.util.*;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 40, 40, 50);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct elements: " + distinctNumbers);
    }
}
