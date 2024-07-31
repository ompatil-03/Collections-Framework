package PracticeProblems;

import java.util.Scanner;

public class SumOfNeighbouringDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number :");
        String n=s.nextLine();
        System.out.println("The answer is :"+nega(n));
    }
    public static String nega(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i==0){
                sb.append(s.charAt(i+1));
            } else if (i==s.length()-1) {
                sb.append(s.charAt(s.length()-2));
            }else {
                sb.append(Character.getNumericValue(s.charAt(i-1))+Character.getNumericValue(s.charAt(i+1)));
            }
        }
        return sb.toString();
    }
}
