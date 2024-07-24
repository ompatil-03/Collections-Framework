package Maps.TreeMap;

import java.util.TreeMap;

public class PortionOfMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(1,"java");
        tm.put(6,"hawa");
        tm.put(2,"gawa");
        tm.put(3,"wawa");
        tm.put(4,"lawa");
        tm.put(5,"javaScript");
        System.out.println("TreeMap : "+tm);
        System.out.println("Protion of key from 4 exclusive :");
        System.out.println( tm.tailMap(4,false));

    }
}
