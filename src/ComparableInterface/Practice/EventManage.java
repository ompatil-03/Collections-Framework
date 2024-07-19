package ComparableInterface.Practice;

import java.text.ParseException;

import java.util.ArrayList;
import java.util.Collections;


class Event implements Comparable<Event>{
    private String eventName;
    private String eventDate;
    public Event(String eventName, String eventDate)  {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }
    public String getEventName() {
        return eventName;
    }
    public String getEventDate() {
        return eventDate;
    }

    @Override
    public int compareTo(Event o) {
      return eventDate.compareTo(o.getEventDate());
    }
}
public class EventManage {
    public static void main(String[] args) throws ParseException {
        ArrayList<Event>al=new ArrayList<>();
        al.add(new Event("Naming Ceremony","03/10/2009"));
        al.add(new Event("Something Ceremony","19/10/2009"));
        al.add(new Event("Nothing Ceremony","05/10/2009"));
        al.add(new Event("Ceremony Ceremony","22/10/2009"));
        System.out.println("Event List:");
        for (Event e:al){
            System.out.println(e.getEventName()+"    "+e.getEventDate());
        }
        System.out.println("========================");
        System.out.println("After Sorting:");
        Collections.sort(al);
        for (Event e:al){
            System.out.println(e.getEventName()+"    "+e.getEventDate());
        }
    }
}
