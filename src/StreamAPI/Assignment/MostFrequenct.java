package StreamAPI.Assignment;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;
public class MostFrequenct {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 20, 20, 10, 30, 10, 44, 44, 10, 4);
        Map<Integer, Long> map = ls.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        int map1 = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
        System.out.println("Most frequent element: " + map1);
    }
}
