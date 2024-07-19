package LambdaExpression.Practice;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
interface  MaxVal{
    int max(Stack st);
}
public class MaxValueInList {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of List :");
        int n=s.nextInt();
        System.out.println("Enter the List element:");
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(s.nextInt());
        }
        MaxVal mv=(Stack st1)->{
            Collections.sort(st1);
            return (int) st1.elementAt(st1.size()-1);
        };
        System.out.println("The max value is :"+mv.max(st));
    }
}
