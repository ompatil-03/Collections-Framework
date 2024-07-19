package Stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class ElementIsPresent {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println("Stack :"+st);
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element you want to check:");
        int elm=s.nextInt();
        if (st.contains(elm)){
            System.out.println("Element is present !");
        }else {
            System.out.println("Element is not present !");
        }
    }
}
