package StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MostFrequent {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,1,2,1,1,6,7,8,9,10);
        System.out.println("List :"+ls);
        HashMap<Integer,Integer>hm=new HashMap<>();
       ls.stream().mapToInt(i-> Math.toIntExact(ls.stream().count()));
    }
}
