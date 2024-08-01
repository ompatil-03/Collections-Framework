package ComparableInterface.Assignment.Comparator;
import java.util.*;
class StudentI {
    String firstName;
    String lastName;
    public StudentI(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "(FirstName: " + firstName + ", LastName: " + lastName + ")\n";
    }
}
class CompareStudentByName implements Comparator<StudentI> {
    @Override
    public int compare(StudentI s1, StudentI s2) {
        int lastNameComparison = s1.lastName.compareTo(s2.lastName);
        if (lastNameComparison == 0) {
            return s1.firstName.compareTo(s2.firstName);
        }
        return lastNameComparison;
    }
}
public class ComparatorStudentI {
    public static void main(String[] args) {
        StudentI s1 = new StudentI("Nishant", "Chawhan");
        StudentI s2 = new StudentI("Rishikesh", "Jadhav");
        StudentI s3 = new StudentI("Nitin", "Mali");
        StudentI s4 = new StudentI("Arun", "Gawali");

        ArrayList<StudentI> ak = new ArrayList<>();
        ak.add(s3);
        ak.add(s1);
        ak.add(s2);
        ak.add(s4);

        System.out.println("Students list:\n" + ak);
        Collections.sort(ak, new CompareStudentByName());
        System.out.println("Sorted List  by First name :\n" + ak);
    }
}
