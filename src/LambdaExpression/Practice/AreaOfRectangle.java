package LambdaExpression.Practice;

import java.util.Scanner;
interface Area{
    int area(int a,int b);
}
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breadth of Rectangle");
        int a=s.nextInt();
        int b=s.nextInt();
        Area ar=(int lr,int br)->lr*br;
        System.out.println("The area is :"+ar.area(a,b));
    }
}
