package Stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class RemoveSpecificElement {
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
        System.out.println("Enter the element you want to remove :");
        int val=s.nextInt();
        int ans=0;
        for (int i = 0; i < st.size(); i++) {
            if (val==st.get(i)){
                ans=i;
            }
        }
        st.remove(ans);
        System.out.println("Modified stack:"+st);
    }
}
