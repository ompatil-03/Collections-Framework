package ComparableInterface.Practice;
import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product>{
    private String productName;
    private int productPrice;
    public Product(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
    public String getProductName() {
        return productName;
    }
    public int getProductPrice() {
        return productPrice;
    }
    @Override
    public int compareTo(Product o) {
        return this.productName.compareTo(o.getProductName());
    }
}
public class SortProduct {
    public static void main(String[] args) {
        ArrayList<Product>al=new ArrayList<>();
        al.add(new Product("OnePlus",37000));
        al.add(new Product("RealMe ",12000));
        al.add(new Product("Apple  ",64999));
        al.add(new Product("Moto   ",23000));
        al.add(new Product("Nothing",27000));
        System.out.println("Product name and price :");
        print(al);
        System.out.println("======================");
        System.out.println("After Sorting by name ");
        Collections.sort(al);
        print(al);
    }
    public static void print(ArrayList<Product> al){
        for (Product p:al){
            System.out.println(p.getProductName()+"  "+p.getProductPrice());
        }
    }
}
