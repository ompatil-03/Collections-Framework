package Stack.practice;

import java.util.Stack;

public class UnionStack {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        st1.push(1);st1.push(2);st1.push(3);st1.push(4);
        Stack<Integer>st2=new Stack<>();
        st2.push(4);st2.push(5);st2.push(2);st2.push(7);
        System.out.println("stack 1:"+st1);
        System.out.println("stack 2:"+st2);
        Stack<Integer>st3=new Stack<>();
        System.out.println("Union stack is :");
        for (int i = 0; i < st1.size(); i++) {
            if (!st3.contains(st1.elementAt(i))){
                st3.push(st1.elementAt(i));
            }
        }
        for (int i = 0; i < st2.size(); i++) {
            if (!st3.contains(st2.elementAt(i))){
                st3.push(st2.elementAt(i));
            }
        }
        System.out.println(st3);
    }
}
