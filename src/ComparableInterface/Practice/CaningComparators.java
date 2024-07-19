package ComparableInterface.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cars {
    private String carName;
    private String model;
    private int year;
    public String getModel() {
        return model;
    }
    public Cars(String carName, String model, int year) {
        this.carName = carName;
        this.model = model;
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public String getCarName() {
        return carName;
    }
}
class SortByName implements Comparator<Cars>{
    @Override
    public int compare(Cars o1, Cars o2) {
        return o1.getCarName().compareTo(o2.getCarName());
    }
}
class SortByYear implements Comparator<Cars>{

    @Override
    public int compare(Cars o1, Cars o2) {
        if (o1.getYear()==o2.getYear()){
            return 0;
        } else if (o1.getYear()<o2.getYear()) {
            return -1;
        }else return 1;
    }
}
public class CaningComparators {
    public static void main(String[] args) {
        ArrayList<Cars>al=new ArrayList<>();
        al.add(new Cars("Toyota ","Family",2022));
        al.add(new Cars("Mercies","Luxury",2012));
        al.add(new Cars("Audi   ","Luxury",2017));
        al.add(new Cars("Nissan ","Family",2019));
        al.add(new Cars("Supra  ","Racing",2024));
        System.out.println("List of Cars:");
        for (Cars c:al){
            System.out.println(c.getCarName()+" "+c.getModel()+"   "+c.getYear());
        }
        System.out.println("================================");
        System.out.println("Sorting by name :");
        Collections.sort(al,new SortByName());
        for (Cars c:al){
            System.out.println(c.getCarName()+" "+c.getModel()+"   "+c.getYear());
        }
        System.out.println("================================");
        System.out.println("Sorting by Year :");
        Collections.sort(al,new SortByYear());
        for (Cars c:al){
            System.out.println(c.getCarName()+" "+c.getModel()+"   "+c.getYear());
        }
    }
}
