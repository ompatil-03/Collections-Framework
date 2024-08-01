package ComparableInterface.Assignment.Comparator;
import java.util.*;
import java.time.LocalDate;
class Order {
    String orderId;
    LocalDate orderDate;
    public Order(String orderId, LocalDate orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    @Override
    public String toString() {
        return "(OrderID: " + orderId + ", Order Date: " + orderDate + ")\n";
    }
}
class CompareOrderByDate implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.orderDate.compareTo(o2.orderDate);
    }
}
public class ComparatorOrder {
    public static void main(String[] args) {
        Order o1 = new Order("ToothBrush", LocalDate.of(2023, 5, 10));
        Order o2 = new Order("Pensil", LocalDate.of(2022, 11, 5));
        Order o3 = new Order("Iphone", LocalDate.of(2024, 1, 25));
        Order o4 = new Order("Thar", LocalDate.of(2023, 7, 20));
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(o3);
        orders.add(o1);
        orders.add(o2);
        orders.add(o4);
        System.out.println("Orders list:\n" + orders);
        Collections.sort(orders, new CompareOrderByDate());
        System.out.println("Sorted List:\n" + orders);
    }
}

