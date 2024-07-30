package ComparableInterface.Assignment.Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product>{
    String productName;
    int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }
    @Override
    public String toString(){
        return "(Product: " + this.productName + " -||- price :" + this.price + " $)\n";
    }
    @Override
    public int compareTo(Product o) {
       return Integer.compare(price,o.price);
    }
}
public class ComparableProductsI {
    public static void main(String[] args) {
        ArrayList<Product>al=new ArrayList<>();
        Product p1=new Product("Gun",45000);
        Product p2=new Product("Bike",150000);
        Product p3=new Product("Shampoo",2);
        Product p4=new Product("Umbrella",20);
        al.add(p1);
        al.add(p4);
        al.add(p2);
        al.add(p3);
        System.out.println("List of Products :\n"+al);
        Collections.sort(al);
        System.out.println("Sorted List :\n"+al);
    }
}
