package StreamAPI;
import java.util.*;
public class ToUpperCase {
    public static void main(String[] args) {
        List<String> ls= Arrays.asList("java","programming","wawa","hawa");
        System.out.println("list: "+ls);
        System.out.println("UpperCase :"+ls.stream().map(String::toUpperCase).toList());
    }
}
