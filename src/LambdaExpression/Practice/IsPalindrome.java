package LambdaExpression.Practice;

import java.util.Scanner;
interface IsPal{
    boolean palindrome(String s);
}
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=s.nextLine();
        IsPal pal=(String st)->{
          StringBuilder sb=new StringBuilder(st);
          sb.reverse();
          return st.contentEquals(sb);
        };
        if(pal.palindrome(str)){
            System.out.println("The String is palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
