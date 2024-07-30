package ComparableInterface.Assignment.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Books implements Comparable<Books>{
    String bookName;
    int price;

    public Books(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }
    @Override
    public String toString(){
        return "(Book: " + this.bookName + " price :" + this.price + ")\n";
    }
    @Override
    public int compareTo(Books o) {
        return bookName.compareTo(o.bookName);
    }
}
public class ComparableBooks {
    public static void main(String[] args) {
       Books b1=new Books("Subtle art of not giving a f**k ",299);
       Books b2=new Books("The Winchi Stories ",356);
       Books b3=new Books("Atomic Habits",395);
       Books b4=new Books("The Secret",200);
        ArrayList<Books>al=new ArrayList<>();
        al.add(b1);
        al.add(b3);
        al.add(b2);
        al.add(b4);
        System.out.println("The List of Books :\n"+al);
        Collections.sort(al);
        System.out.println("After Sorting :\n"+al);


    }
}
