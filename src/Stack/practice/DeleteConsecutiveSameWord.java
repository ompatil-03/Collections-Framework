package Stack.practice;

import java.util.Scanner;
import java.util.Stack;

public class DeleteConsecutiveSameWord {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        String[] sa=str.split(" ");
        Stack<String>stack=new Stack<>();
        stack.push(sa[0]);
        for (int i = 1; i < sa.length; i++) {
            if(stack.peek().equals(sa[i])){
                stack.pop();
            }else {
                stack.push(sa[i]);
            }
        }
        System.out.println("The ans is :"+stack.size());
        System.out.println("Stack:"+stack);
    }
}
