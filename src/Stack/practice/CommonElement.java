package Stack.practice;

import java.util.Stack;

public class CommonElement {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        Stack<Integer>st2=new Stack<>();
        st2.push(4);
        st2.push(5);
        st2.push(6);
        st2.push(7);
        System.out.println("stack 1:"+st1);
        System.out.println("stack 2:"+st2);
        for (int i = 0; i < st1.size(); i++) {
            if(st2.contains(st1.get(i))){
                System.out.println("The common element is :"+st1.get(i));
                break;
            }
        }
    }
}
