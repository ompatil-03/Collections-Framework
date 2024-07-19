package Stack.practice;

import java.util.Objects;
import java.util.Stack;

public class NotInBothStack {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        st1.push(1);st1.push(2);st1.push(3);st1.push(4);
        Stack<Integer>st2=new Stack<>();
        st2.push(4);st2.push(5);st2.push(2);st2.push(7);
        System.out.println("stack 1:"+st1);
        System.out.println("stack 2:"+st2);
        Stack<Integer>st3=new Stack<>();
        System.out.println("Uncommon stack is :");
        for (int i = 0; i < st1.size(); i++) {
            for (int j = 0; j < st2.size(); j++) {
                    if(Objects.equals(st1.get(i), st2.get(j))){
                        st1.remove(i);
                        st2.remove(j);
                        j--;
                        i--;
                    }
            }
        }
        st1.addAll(st2);
        System.out.println(st1);
    }
}
