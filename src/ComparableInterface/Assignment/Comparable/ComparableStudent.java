package ComparableInterface.Assignment.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    String name;
    double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    @Override
    public String toString(){
        return "( Name :"+this.name+" -><- GPA :"+this.gpa+")\n";
    }
    @Override
    public int compareTo(Student o) {
      return Double.compare(gpa,o.gpa);
    }
}
public class ComparableStudent {
    public static void main(String[] args) {
        ArrayList<Student>al=new ArrayList<>();
        Student s1=new Student("Jay",9.5);
        Student s2=new Student("Vijay",10);
        Student s3=new Student("Para-jay",5.5);
        Student s4=new Student("Har",2.5);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s1);
        System.out.println("List of Student :\n"+al);
        Collections.sort(al);
        System.out.println("Sorted List :\n"+al);
    }
}
