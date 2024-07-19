package Stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class NthToTop {
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
        System.out.println("Enter n :");
        int nth=s.nextInt();
        Stack<Integer> st1=new Stack<>();
        for (Integer integer : st) {
            if (integer != nth) {
                st1.push(integer);
            }
        }
        st1.push(nth);
        System.out.println("The modified stack is :"+st1);
    }
}
