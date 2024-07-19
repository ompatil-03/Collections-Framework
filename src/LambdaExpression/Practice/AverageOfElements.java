package LambdaExpression.Practice;

import java.util.ArrayList;
import java.util.Scanner;

interface Average{
    int avg(ArrayList<Integer>al);
}
public class AverageOfElements {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println("Integer List :"+al);
        Average avg=(ArrayList<Integer> ans)->{
            int sum=0;
            for (Integer an : ans) {
                sum += an;
            }
            return sum/ans.size();
        };
        System.out.println("The Average is :"+avg.avg(al));
    }
}
