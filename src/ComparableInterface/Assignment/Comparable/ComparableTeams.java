package ComparableInterface.Assignment.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Team implements Comparable <Team>{
    String name;
    int won;
    public Team(String name, int won) {
        this.name = name;
        this.won = won;
    }
    @Override
    public String toString(){
        return "(Name : "+name+" GamesWon: "+won+")\n";
    }
    @Override
    public int compareTo(Team o) {
      return Integer.compare(won,o.won);
    }
}
public class ComparableTeams {
    public static void main(String[] args) {
        Team p1=new Team("England ",20);
        Team p2=new Team("Aurelia ",27);
        Team p3=new Team("Japan   ",10);
        Team p4=new Team("Germany ",32);
        ArrayList<Team> al=new ArrayList<>();
        al.add(p3);
        al.add(p4);
        al.add(p1);
        al.add(p2);
        System.out.println("List of Teams :\n"+al);
        Collections.sort(al);
        System.out.println("Sorted List According to Games Won :");
        System.out.println(al);
    }
}
