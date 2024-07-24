package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class CommaSeperated {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,1,2,1,1,6,7,8,9,10);
        System.out.println("List :"+ls);
        StringBuilder sb=new StringBuilder();
        ls.stream().map(i->sb.append(i+",")).toList();
        System.out.println(sb);
    }
}
