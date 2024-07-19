package ComparableInterface.Practice;
import java.util.ArrayList;
import java.util.Collections;

class EmployeeI implements Comparable<EmployeeI> {
    private int empId;
    private String empName;

    @Override
    public String toString() {
        return "\n{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    private int empSalary;

    public EmployeeI(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    @Override
    public int compareTo(EmployeeI o) {
       StringBuilder s1=new StringBuilder(this.empName);
       StringBuilder s2=new StringBuilder(o.getEmpName());
       s1.reverse();
       s2.reverse();
       return s1.compareTo(s2);
    }
}

public class ReversOrder {
    public static void main(String[] args) {
        ArrayList<EmployeeI> al=new ArrayList<>();
        al.add(new EmployeeI(101,"Ram",75000));
        al.add(new EmployeeI(102,"Tom",50000));
        al.add(new EmployeeI(103,"Kun",14200));
        al.add(new EmployeeI(104,"Nam",95000));
        al.add(new EmployeeI(105,"Rom",10000));
        System.out.println("Employee list:");
        print(al);
        System.out.println("===========================");
        System.out.println("After Sorting in reverse alphabetical order:");
        Collections.sort(al);
        print(al);
    }
    public static void print(ArrayList<EmployeeI> al){
        for (EmployeeI p:al){
            System.out.println(p.getEmpName()+"  "+p.getEmpId()+"   "+p.getEmpSalary());
        }
    }
}
