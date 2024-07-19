package LambdaExpression.Practice;

import java.util.Scanner;
interface Capitalize{
    String cpi(String str);
}
public class CapitalizeFirstLetter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String");
        String str=s.nextLine();
        Capitalize cp=(String str1)->{
          StringBuilder sb= new StringBuilder(str1);
          sb.replace(0,1,""+Character.toUpperCase(str1.charAt(0)));
          return sb.toString();
        };
        String[] ans=str.split(" ");
        System.out.println("The modified string is  :");
        for (int i = 0; i <ans.length ; i++) {
            ans[i]=cp.cpi(ans[i]);
            System.out.print(ans[i]+" ");
        }


    }
}
