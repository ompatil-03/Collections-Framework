package StreamAPI.Assignment;
import java.util.*;
import java.util.stream.*;
public class CumulativeSum {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);
        final int[] cumulativeSum = {0};
        List<Integer> cumulativeSumList = ls.stream().map(num -> cumulativeSum[0] += num).toList();
        System.out.println("Cumulative sum list: " + cumulativeSumList);
    }
}
