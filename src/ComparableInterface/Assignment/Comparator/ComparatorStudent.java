package ComparableInterface.Assignment.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "(Student Name : "+name+" Age : "+age+")\n";
    }
}
class CompareAge implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
      return Integer.compare(o1.age,o2.age);
    }
}
public class ComparatorStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Jay", 25);
        Student s2 = new Student("Vijay", 22);
        Student s3 = new Student("Para-jay", 18);
        Student s4 = new Student("Har", 30);
        ArrayList<Student>al=new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        System.out.println("List of Students :\n"+al);
        Collections.sort(al, new CompareAge());
        System.out.println("Sorted List :\n"+al);
    }
}
