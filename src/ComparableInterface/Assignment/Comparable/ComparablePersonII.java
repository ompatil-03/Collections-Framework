package ComparableInterface.Assignment.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class PersonI implements Comparable<PersonI>{
    String name;
    int height;

    public PersonI(String name, int age) {
        this.name = name;
        this.height = age;
    }
    @Override
    public String toString(){
        String s="( Name : "+this.name+"  height : "+this.height +" )\n";
        return s;
    }

    @Override
    public int compareTo(PersonI o) {
        if (height >o.height){
            return 1;
        } else if (height <o.height) {
            return -1;
        }else return 0;
    }
}
public class ComparablePersonII {
    public static void main(String[] args) {
        Team p1=new Team("Home",145);
        Team p2=new Team("Ram",175);
        Team p3=new Team("Sham",120);
        Team p4=new Team("Tom",199);
        ArrayList<Team> al=new ArrayList<>();
        al.add(p3);
        al.add(p4);
        al.add(p1);
        al.add(p2);
        System.out.println("List of person :\n"+al);
        Collections.sort(al);
        System.out.println("Sorted List According to height :");
        System.out.println(al);
    }
}
