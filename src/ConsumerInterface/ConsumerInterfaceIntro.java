package ConsumerInterface;

import java.util.function.Consumer;
import java.util.*;

public class ConsumerInterfaceIntro {
    public static void main(String[] args) {
        Consumer<Integer> cs= System.out::println;
        List<Integer>al=Arrays.asList(4,5,6,8,9,6,54,78);
        al.forEach(cs);
    }
}
