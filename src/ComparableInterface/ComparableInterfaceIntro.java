package ComparableInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int age;
    public Student(int id,String name, int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public String toString() {
        return "\n(" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ')';
    }
    @Override
    public int compareTo(Student o) {
        // According to age
//        if (ag==o.age){
//            return 0;
//        } else if (age<o.age) {
//            return -1;
//        }else return 1;
        //according to name
        return this.name.compareTo(o.name);//Ascending Sorting
        // Descending Sorting : return o.name.compareTo(this.name);
    }
}
class NameSort implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class ComparableInterfaceIntro {
    public static void main(String[] args) {
        Student s1=new Student(1,"Ram",12);
        Student s2=new Student(2,"Tom",22);
        Student s3=new Student(3,"Java",2);
        Student s4=new Student(4,"Rohit",39);
        Student s5=new Student(5,"Sham",52);
        ArrayList<Student>al=new ArrayList<>();
        al.add(s1);al.add(s2);al.add(s3);al.add(s4);al.add(s5);
        System.out.println("The List of Students is :"+al);
        Collections.sort(al);
        System.out.println("After Sorting :"+al);
    }
}
