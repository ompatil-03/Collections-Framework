package Stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class EqualsStack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of stack :");
        int n=s.nextInt();
        System.out.println("Enter the stack element:");
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(s.nextInt());
        }
        System.out.println("Stack: "+st);
        System.out.println("Enter the size of stack :");
        int n1=s.nextInt();
        System.out.println("Enter the stack element:");
        Stack<Integer> st1=new Stack<>();
        for (int i = 0; i < n1; i++) {
            st1.push(s.nextInt());
        }
        System.out.println("Stack: "+st1);
        if(st.equals(st1)){
            System.out.println("Two stacks are equal ");
        }else {
            System.out.println("Two stacks are not equal");
        }
    }
}
