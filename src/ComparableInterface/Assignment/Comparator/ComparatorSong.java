package ComparableInterface.Assignment.Comparator;
import java.util.*;
class Song {
    String title;
    String artist;
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
    @Override
    public String toString() {
        return "(Title: " + title + ", Artist: " + artist + ")\n";
    }
}
class CompareSongByArtist implements Comparator<Song> {
    @Override
    public int compare(Song s1, Song s2) {
        return s1.artist.compareTo(s2.artist);
    }
}
public class ComparatorSong {
    public static void main(String[] args) {
        Song s1 = new Song("Breathless", "Shankar Mahadevan");
        Song s2 = new Song("Shayad", "Arijit Singh");
        Song s3 = new Song("Bandana", "Shubhz");
        Song s4 = new Song("Pal pal dil ke pas ", "Kishor Kumar");
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(s3);songs.add(s1);songs.add(s2);songs.add(s4);
        System.out.println("Songs list:\n" + songs);
        Collections.sort(songs, new CompareSongByArtist());
        System.out.println("Sorted List:\n" + songs);
    }
}

