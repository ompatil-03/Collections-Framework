package ComparableInterface.Assignment.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Person {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "(FirstName: " + firstName + ", LastName: " + lastName + ")\n";
    }
}
class ComparePersonByLastName implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.lastName.compareTo(p2.lastName);
    }
}

public class PersonComparator {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ram", "Warma"));
        people.add(new Person("Chetan", "Sharma"));
        people.add(new Person("John", "Wick"));
        people.add(new Person("Raj", "Thakare"));

        System.out.println("People list:\n" + people);
        Collections.sort(people, new ComparePersonByLastName());
        System.out.println("Sorted list by last name:\n" + people);
    }
}
