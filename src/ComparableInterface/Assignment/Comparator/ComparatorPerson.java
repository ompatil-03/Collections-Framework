package ComparableInterface.Assignment.Comparator;

import java.util.ArrayList;
import java.util.Comparator;

class person{
    String firstName;
    String lastName;
    int age;

    public person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public String toString(){
        return "(FirstName :"+firstName+" LastName : "+lastName+" age: "+age+")\n";
    }
}
class SortLastName implements Comparator<person>{
    @Override
    public int compare(person o1, person o2) {
        return o1.lastName.compareTo(o2.lastName);
    }
}
public class ComparatorPerson {
    public static void main(String[] args) {
        ArrayList<person>al=new ArrayList<>();
        al.add(new person("Suresh","Raina",18));
        al.add(new person("Mahendrsingh","Dhoni",18));
        al.add(new person("Sachin","Tendulek",18));
        al.add(new person("Suresh","Raina",18));

    }
}
