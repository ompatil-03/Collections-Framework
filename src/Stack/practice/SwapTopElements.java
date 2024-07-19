package Stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class SwapTopElements {
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
        int a=st.pop();
        int b=st.pop();
        st.push(a);
        st.push(b);
        System.out.println("After swapping :"+st);
    }
}
