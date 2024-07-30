package ComparableInterface.Assignment.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movies{
    String movieName;
    int releaseYear;
    public Movies(String movieName, int releaseYear) {
        this.movieName = movieName;
        this.releaseYear = releaseYear;
    }
    @Override
    public String toString(){
        return "(MovieName : "+movieName+" Release Year : "+releaseYear+")\n";
    }
}
class CompareMovies implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.releaseYear - o2.releaseYear;
    }
}
public class ComparatorMovies {
    public static void main(String[] args) {
        Movies m1 = new Movies("Inception", 2010);
        Movies m2 = new Movies("The Matrix", 1999);
        Movies m3 = new Movies("Eternal  Mind", 2004);
        Movies m4 = new Movies("The Dark Knight", 2008);
        ArrayList<Movies>al=new ArrayList<>();
        al.add(m3);
        al.add(m1);
        al.add(m2);
        al.add(m4);
        System.out.println("Movies list :\n"+al);
        Collections.sort(al, new CompareMovies());
        System.out.println("Soted List :\n"+al);

    }
}
