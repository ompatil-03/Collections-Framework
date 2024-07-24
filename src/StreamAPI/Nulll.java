package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Nulll {
    public static void main(String[] args) {
        List<String> ls1= Arrays.asList("java","wawa",null,null);
        System.out.println("List :"+ls1);
        System.out.println("Without null :"+ls1.stream().filter(i->i!=null).toList());
    }
}
