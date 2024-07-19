package Stack.practice;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class RemoveAllElementFromStack {
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
        while (!st.isEmpty()){
            st.pop();
        }
        System.out.println("After removing all elements :"+st);

    }
}
