package StreamAPI.Assignment;

import java.util.Arrays;
import java.util.List;

public class CheckElementsForCertainValue {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,3,4,5,6,7,8,9);
        System.out.println("List :"+ls);
        System.out.println("For target:0");
        int val=0;
        System.out.println("Check :"+ls.stream().allMatch(i->i>val));
        System.out.println("For target: 5");
        int  val2=5;
        System.out.println("Check :"+ls.stream().allMatch(i->i>val2));
    }
}
