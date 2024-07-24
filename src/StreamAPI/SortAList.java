package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class SortAList {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("java","programming","wawa","hawa");
        System.out.println("list: "+ls);
        System.out.println("Sorted  :"+ls.stream().sorted().toList());

    }
}
