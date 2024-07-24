package StreamAPI.Assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamList {
    public static void main(String[] args) {
        int[]a= IntStream.rangeClosed(1,100).toArray();
        System.out.println(Arrays.toString(a));
        System.out.println("Sum of Square of All even number is :"+ Arrays.stream(a).
                filter(i->i%2==0).map(j->j*j).sum());
    }
}
