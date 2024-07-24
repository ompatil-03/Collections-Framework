package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class StringSorting {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("java","programming","wa","hawaaaa");
        System.out.println("list: "+ls);
//        System.out.println("Sorted:"+ls.stream().sorted((a,b)->a.length()-b.length()).toList());
        String str=(String) ls.stream().sorted((a,b)->b.length()-a.length()).toList().getFirst();
        System.out.println("Longest string :"+str);
    }
}
