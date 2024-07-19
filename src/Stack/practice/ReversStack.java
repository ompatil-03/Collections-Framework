package Stack.practice;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ReversStack {
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
        Stack<Integer> st1=new Stack<>();
        while (!st.isEmpty()){
            st1.push(st.pop());
        }
        System.out.println("Reversed Stack:"+st1);

    }
}
