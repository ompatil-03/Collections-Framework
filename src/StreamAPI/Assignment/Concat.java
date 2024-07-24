package StreamAPI.Assignment;
import java.util.*;
import java.util.stream.*;


public class Concat {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(40, 50, 60);
        List<Integer> concatenatedList = Stream.concat(list1.stream(), list2.stream()).toList();
        System.out.println("Concatenated list: " + concatenatedList);
    }
}
