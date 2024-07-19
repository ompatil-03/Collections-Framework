package LambdaExpression.Practice;

import java.util.ArrayList;
import java.util.Scanner;

interface Filter{
    ArrayList filter(ArrayList al);
}

public class FilterNegative {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(-20);
        al.add(-30);
        al.add(40);
        al.add(-50);
        System.out.println("Integer List :"+al);
        Filter fl=(ArrayList list)->{
            ArrayList<Integer> ans=new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if((int)list.get(i)>0){
                    ans.add((int)list.get(i));
                }
            }
            return ans;
        };
        System.out.println("New List :"+fl.filter(al));
    }
}
