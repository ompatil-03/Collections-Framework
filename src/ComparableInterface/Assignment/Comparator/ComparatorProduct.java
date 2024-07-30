package ComparableInterface.Assignment.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
    String productName;
    int price;
    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "(Product: " + this.productName + "---> price :" + this.price + " $)\n";
    }
}
class CompareName implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return o1.productName.compareTo(o2.productName);
    }
}
public class ComparatorProduct{
    public static void main(String[] args) {
        ArrayList<Product>al=new ArrayList<>();
        Product p1=new Product("Gun",45000);
        Product p2=new Product("Bike",150000);
        Product p3=new Product("Shampoo",2);
        Product p4=new Product("Umbrella",20);
        Product p5=new Product("Avacardo",50);
        al.add(p1);
        al.add(p4);
        al.add(p2);
        al.add(p3);
        al.add(p5);
        System.out.println("List of Products :\n"+al);
        Collections.sort(al,new CompareName());
        System.out.println("Sorted List :\n"+al);
    }
}
