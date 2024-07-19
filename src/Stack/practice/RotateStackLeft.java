package Stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class RotateStackLeft {
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
        // System.out.println(st1);
        for (int i =1; i < st.size(); i++) {
            st1.push(st.get(i));
        }
        st1.push(st.get(0));
        System.out.println("Rotated Stack:"+st1);
    }
}
