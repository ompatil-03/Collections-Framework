package ComparableInterface.Assignment.Comparator;
import java.util.*;
class Phone {
    String model;
    int capacity;
    public Phone(String model, int batteryCapacity) {
        this.model = model;
        this.capacity = batteryCapacity;
    }
    @Override
    public String toString() {
        return "(Model: " + model + ", Battery Capacity: " + capacity + "mAh)\n";
    }
}
class ComparePhoneByBatteryCapacity implements Comparator<Phone> {
    @Override
    public int compare(Phone p1, Phone p2) {
        return p1.capacity - p2.capacity;
    }
}
public class ComparatorPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone("Iphone", 3000);
        Phone p2 = new Phone("Samsung", 2500);
        Phone p3 = new Phone("OnePlus", 4000);
        Phone p4 = new Phone("Pocco", 3500);
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(p3);
        phones.add(p1);
        phones.add(p2);
        phones.add(p4);
        System.out.println("Phones list:\n" + phones);
        Collections.sort(phones, new ComparePhoneByBatteryCapacity());
        System.out.println("Sorted List:\n" + phones);
    }
}

