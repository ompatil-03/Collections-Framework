package PracticeProblems;

import java.util.Scanner;

public class DoubleEvenIndexElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number :");
        String n=s.nextLine();
        System.out.println("The answer is :"+doubleEven(n));
    }
    public static String doubleEven(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i%2==0){
                sb.append(Character.getNumericValue(s.charAt(i))*2);
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
