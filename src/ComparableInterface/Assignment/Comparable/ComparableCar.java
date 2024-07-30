package ComparableInterface.Assignment.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>{
    String carName;
    int speed;

    public Car(String carName, int speed) {
        this.carName = carName;
        this.speed = speed;
    }

    @Override
    public String toString(){
        return "Car: "+this.carName+" speed :"+this.speed+")\n";
    }
    @Override
    public int compareTo(Car o) {
        return Integer.compare(speed,o.speed);
    }
}
public class ComparableCar {
    public static void main(String[] args) {
        Car p1=new Car("Audi",100);
        Car p2=new Car("Mercies",200);
        Car p3=new Car("HellCat",120);
        Car p4=new Car("Supra",135);
        ArrayList<Car> al=new ArrayList<>();
        al.add(p3);
        al.add(p4);
        al.add(p1);
        al.add(p2);
        System.out.println("List of Cars :\n"+al);
        Collections.sort(al);
        System.out.println("Sorted List According to Speed :");
        System.out.println(al);
    }
}
