package StreamAPI.Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(10, 20, 20, 30, 40, 40, 50);
        System.out.println("List :"+ls);
        System.out.println("After Removing Duplicates : " +  ls.stream().distinct().toList());
    }
}
