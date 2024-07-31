package PracticeProblems;

import java.util.Scanner;

public class FactorialOfInputedPrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n=s.nextInt();
        System.out.println("The answer is :"+factPrime(n));
    }
    public static int factPrime(int n){
        int a=n,temp=0,sum=0,rem=0;
        while (a!=0){
            rem=a%10;
            if (isPrime(rem)){
                temp=factorial(rem);
            }else {
                temp=rem;
            }
            if (temp<10){
                sum=sum*10+temp;
            }else {
                sum=sum*100+temp;
            }
            a/=10;
        }
        return revers(sum);
    }
    public static boolean isPrime(int n){
        boolean b=true;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n%i==0){
                b=false;
            }
        }
        return b;
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        } return n*factorial(n-1);
    }
    public static int revers(int n){
        int sum=0,rem=0;
        while (n!=0){
            rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        return sum;
    }
}
