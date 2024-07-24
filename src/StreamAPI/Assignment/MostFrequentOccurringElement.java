package StreamAPI.Assignment;
import java.util.*;
import java.util.stream.*;
public class MostFrequentOccurringElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 30, 30, 40, 40, 50);
        Optional<Map.Entry<Integer, Long>> mostFrequent = numbers.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        mostFrequent.ifPresent(entry ->
                System.out.println("Most frequent element: " + entry.getKey() + " with count " + entry.getValue())
        );
    }
}
