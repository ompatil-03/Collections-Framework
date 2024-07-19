package Stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class NthElementFromTop {
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
        System.out.println("The Nth element form top is :"+st.get(st.size()-nth));
    }
}
