package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String :");
        String str=s.nextLine();
        if(isBalanced(str)){
            System.out.println("Balanced String !");
        }else {
            System.out.println("Not Balanced String !");
        }
        System.out.println("Enter String :");
        String str2=s.nextLine();
        if(isBalanced(str2)){
            System.out.println("Balanced String !");
        }else {
            System.out.println("Not Balanced String !");
        }
    }
    public static boolean isBalanced(String s){
        Stack<Character>st=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                st.push(s.charAt(i));
            } else if (s.charAt(i)==')'&&st.peek()=='(') {
                st.pop();
            }else if (s.charAt(i)=='}'&&st.peek()=='{') {
                st.pop();
            }else if (s.charAt(i)==']'&&st.peek()=='[') {
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
