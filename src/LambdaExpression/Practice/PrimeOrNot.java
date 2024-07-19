package LambdaExpression.Practice;

import java.util.Scanner;
interface PrimeChecker{
    boolean isPrime(int a);
}

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int n=s.nextInt();
        PrimeChecker pc=(int a)->{
            boolean b=true;
            for (int i =2; i <=Math.sqrt(a); i++) {
                if(a%i==0){
                    b=false;
                    break;
                }
            }
            return b;
        };
        if (pc.isPrime(n)) {
            System.out.println("Number is prime ");
        }else {
            System.out.println("Number is not prime");
        }
    }
}
