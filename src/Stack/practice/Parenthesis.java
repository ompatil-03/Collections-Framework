package Stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Parenthesis string:");
        String str=s.nextLine();
        if (isValid(str)){
            System.out.println("Balanced !!!!");
        }else {
            System.out.println("Not Balanced !!!!");
        }
        System.out.println("Enter Parenthesis string:");
        str=s.nextLine();
        if (isValid(str)){
            System.out.println("Balanced !!!!");
        }else {
            System.out.println("Not Balanced !!!!");
        }
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c=='('||c=='{'||c=='[') {
                stack.push(c);
            } else if (c == ')'&&!stack.isEmpty()&&stack.peek()=='(') {
                stack.pop();
            } else if (c == ']'&&!stack.isEmpty()&&stack.peek()=='[') {
                stack.pop();
            } else if (c == '}'&&!stack.isEmpty()&&stack.peek()=='{') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
