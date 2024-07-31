package PracticeProblems;

import java.util.Scanner;

public class ReversEvenDigitsOnly {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number :");
        String n=s.nextLine();
        System.out.println("The answer is :"+revers(n));
    }
    public static String revers(String n){
        StringBuilder even =new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            if(Character.getNumericValue(n.charAt(i))%2==0){
                even.append(n.charAt(i));

            }
        }
        even.reverse();
        int count=0;
        for (int i = 0; i <n.length() ; i++) {
            if(Character.getNumericValue(n.charAt(i))%2==0){
               ans.append(even.charAt(count++));
            }else {
                ans.append(n.charAt(i));
            }
        }
        return ans.toString();
    }
}
