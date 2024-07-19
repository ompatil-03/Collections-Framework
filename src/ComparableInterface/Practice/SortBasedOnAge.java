package ComparableInterface.Practice;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>
{
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Person o) {
       if (this.age==o.getAge()){
           return 0;
       } else if (this.age<o.getAge()) {
           return -1;
       }return 1;
    }
}
public class SortBasedOnAge {
    public static void main(String[] args) {
        ArrayList<Person>al=new ArrayList<>();
        al.add(new Person("Jatin ",29,134));
        al.add(new Person("Suresh",20,159));
        al.add(new Person("Mahesh",59,100));
        al.add(new Person("Arijit",18,174));
        System.out.println("Person list:");
        for (Person p:al){
            System.out.println(p.getName()+"  "+p.getAge()+"  "+p.getHeight());
        }
        Collections.sort(al);
        System.out.println("=======================");
        System.out.println("Sorting via age:");
        for (Person p:al){
            System.out.println(p.getName()+"  "+p.getAge()+"  "+p.getHeight());
        }
    }
}
