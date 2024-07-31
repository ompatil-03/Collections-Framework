package PracticeProblems;

import java.util.Scanner;

public class CubeOfNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        String n=s.nextLine();
        System.out.println("The answer is :");
        StringBuilder sb=new StringBuilder(n);
        for (int i = 0; i < sb.length(); i++) {
            int val=Character.getNumericValue(sb.charAt(i));
            System.out.print(val*val*val);
        }
    }
}
