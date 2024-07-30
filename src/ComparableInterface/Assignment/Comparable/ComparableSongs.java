package ComparableInterface.Assignment.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Songs implements Comparable<Songs>{
    String song;
    int duration;

    public Songs(String song, int duration) {
        this.song = song;
        this.duration = duration;
    }
    @Override
    public String toString(){
        return "(Song :"+this.song+"== Duration: "+this.duration+")\n";
    }
    @Override
    public int compareTo(Songs o) {
        return Integer.compare(duration,o.duration);
    }
}
public class ComparableSongs {
    public static void main(String[] args) {
        ArrayList<Songs>al=new ArrayList<>();
        Songs s1=new Songs("Breathless ",5);
        Songs s2=new Songs("Chip Thrills ",3);
        Songs s3=new Songs("Kucha to log kahenge ",4);
        Songs s4=new Songs("Kun Faya  ",6);
        al.add(s4);
        al.add(s2);
        al.add(s3);
        al.add(s1);
        System.out.println("List of Songs :\n"+al);
        Collections.sort(al);
        System.out.println("Sorted List :\n"+al);


    }
}
