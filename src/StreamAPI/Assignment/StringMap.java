package StreamAPI.Assignment;

import Set.HashSet.Intersection;

import java.util.*;
import java.util.stream.Collectors;

public class StringMap {
    public static void main(String[] args) {
        List<String>ls= Arrays.asList("Java","Python","C++","HTML","Programming");
        System.out.println("List :"+ls);
        Map<Integer, List<String>> map=ls.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grope By Length :");
        map.forEach((a,b)-> System.out.println(a+" -> "+b));
    }
}
