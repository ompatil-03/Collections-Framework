package ComparableInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Employee {
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

    public Employee(int empId, String empName, int empSalary) {
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
}
class EmpNameSort implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
class SalarySort implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getEmpSalary()==o2.getEmpSalary()){
            return 0;
        } else if (o1.getEmpSalary()<o2.getEmpSalary()) {
            return -1;
        }else  return 1;
    }
}
public class ComparatorInterfaceIntro {
    public static void main(String[] args) {
        ArrayList<Employee>al=new ArrayList<>();
        al.add(new Employee(101,"Ram",75000));
        al.add(new Employee(102,"Tom",50000));
        al.add(new Employee(103,"Kun",14200));
        al.add(new Employee(104,"Nam",95000));
        al.add(new Employee(105,"Rom",10000));
        System.out.println("Employee list:"+al);
        System.out.println("================================================");
        System.out.println("Name Sorting :");
        Collections.sort(al,new EmpNameSort());
        System.out.println(al);
        System.out.println("================================================");
        System.out.println("Salary wise Sorting");
        Collections.sort(al,new SalarySort());
        System.out.println(al);

    }
}
