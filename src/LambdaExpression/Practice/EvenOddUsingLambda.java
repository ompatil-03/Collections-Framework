package LambdaExpression.Practice;

import java.util.Scanner;

interface EvenOdd{
    boolean evenOdd(int a);
}
public class EvenOddUsingLambda {
    public static void main(String[] args) {
        EvenOdd eo=(int a)->a%2==0;
        System.out.println("Enter the number you want to check:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if (eo.evenOdd(n)){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
