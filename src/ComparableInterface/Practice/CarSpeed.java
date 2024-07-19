package ComparableInterface.Practice;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car>{
    private String carName;

    public Car(String carName, int topSpeed) {
        this.carName = carName;
        this.topSpeed = topSpeed;
    }

    public String getCarName() {
        return carName;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    private int topSpeed;
    @Override
    public int compareTo(Car o) {
        if (topSpeed==o.getTopSpeed()){
            return 0;
        } else if (topSpeed<o.getTopSpeed()) {
            return -1;
        }else return 1;
    }
}
public class CarSpeed {
    public static void main(String[] args) {
        ArrayList<Car>al=new ArrayList<>();
        al.add(new Car("Toyota",200));
        al.add(new Car("Konisega ",340));
        al.add(new Car("Nisan GTR",270));
        al.add(new Car("Bugatti",370));
        al.add(new Car("Supra",230));
        System.out.println("List of Cars:");
        for (Car c:al){
            System.out.println(c.getCarName()+"  "+c.getTopSpeed());
        }
        Collections.sort(al);
        System.out.println("====================");
        System.out.println("After Sorting:");
        for (Car c:al){
            System.out.println(c.getCarName()+"  "+c.getTopSpeed());
        }


    }
}
