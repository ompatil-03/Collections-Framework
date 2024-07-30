package ComparableInterface.Assignment.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        String s="( Name : "+this.name+"  age : "+this.age+" )\n";
        return s;
    }
    @Override
    public int compareTo(Person o) {
       if (age>o.age){
           return 1;
       } else if (age<o.age) {
           return -1;
       }else return 0;
//       return name.compareTo(this.name);
    }
}
public class ComparablePersonI {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Person p1=new Person("Om",23);
        Person p2=new Person("Ram",18);
        Person p3=new Person("Sham",46);
        Person p4=new Person("Tom",78);
        ArrayList<Person>al=new ArrayList<>();
        al.add(p3);
        al.add(p4);
        al.add(p1);
        al.add(p2);
        System.out.println("List of person :\n"+al);
        Collections.sort(al);
        System.out.println("Sorted List According to age :");
        System.out.println(al);

    }
}
