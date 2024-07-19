package ComparableInterface.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CustomStrings {

    private String string;

    @Override
    public String toString() {
        return "\n"+string;
    }

    public CustomStrings(String string) {
        this.string = string;
    }
    public String getString() {
        return string;
    }
}
class Name implements Comparator<CustomStrings>{
        @Override
        public int compare(CustomStrings o1, CustomStrings o2) {
           if (o1.getString().length()==o2.getString().length()){
               return 0;
           }else if (o1.getString().length()<o2.getString().length()){
               return -1;
           }
          else return 1;
        }

}
public class CustomComparatorForStrings  {
    public static void main(String[] args) {
        ArrayList<CustomStrings>al=new ArrayList<>();
        al.add(new CustomStrings("hello"));
        al.add(new CustomStrings("Java"));
        al.add(new CustomStrings("Programming"));
        al.add(new CustomStrings("language"));
        al.add(new CustomStrings("is"));
        System.out.println("Array list of string :");
        for (CustomStrings c:al){
            System.out.print(c);
        }
        System.out.println("\n===========================");
        System.out.println("After Sorting:");
        Collections.sort(al,new Name());
        for (CustomStrings c:al){
            System.out.print(c);
        }
    }
}
