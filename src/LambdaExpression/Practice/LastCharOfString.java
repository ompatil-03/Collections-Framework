package LambdaExpression.Practice;

import java.util.Scanner;
interface LastChar{
    char last(String s);
}
public class LastCharOfString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String str=s.nextLine();
        LastChar lc=(String str1)->str1.charAt(str1.length()-1);
        System.out.println("The Last Char is :"+lc.last(str));;
    }
}
