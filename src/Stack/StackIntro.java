package Stack;

import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println("Stack :"+st);
        System.out.println("Peek():"+st.peek());
        st.pop();
        System.out.println("After removing top element:\n"+st);
        System.out.println("Search 10:  "+st.search(10));
        System.out.println("indexOf(10): "+st.indexOf(10));
    }
}
