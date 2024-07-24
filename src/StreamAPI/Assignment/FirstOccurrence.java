package StreamAPI.Assignment;
import java.util.*;
public class FirstOccurrence {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50,30);
        int target = 30;
        Optional<Integer> firstOccurrence = numbers.stream().filter(num -> num == target).findFirst();
        firstOccurrence.ifPresentOrElse(num -> System.out.println("First occurrence: " + num),
                () -> System.out.println("Element not found")
        );
    }
}
