package ComparableInterface.Practice;

import java.util.ArrayList;
import java.util.Collections;

class City implements Comparable<City>{
    private String cityName;
    private int population;
    public String getCityName() {
        return cityName;
    }

    public int getPopulation() {
        return population;
    }

    public City(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }
    @Override
    public String toString(){
        return "(City :"+cityName+" --> Population :"+population+")\n";
    }
    @Override
    public int compareTo(City o) {
        if (this.population==o.getPopulation()){
            return 0;
        } else if (this.population<o.getPopulation()) {
            return -1;
        }else return 1;
    }
}

public class CityPopulation {
    public static void main(String[] args) {
        ArrayList<City> al=new ArrayList<>();
        al.add(new City("Mumbai",92000000));
        al.add(new City("Pune",23600000));
        al.add(new City("Delhi",65300000));
        al.add(new City("Dubai",84600000));
        al.add(new City("Chennai",12000000));
        System.out.println("List of Cities");
        System.out.println(al);
        System.out.println("========================");
        System.out.println("After Sorting according to population:");
        Collections.sort(al);
        System.out.println(al);

    }

}
