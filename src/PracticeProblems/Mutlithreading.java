package PracticeProblems;
class Mythread extends Thread{
    public  void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Parent Thread : " + Thread.currentThread().getName() + "");
        }
    }
}
class  SecondThread extends Mythread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Child Thread " + Thread.currentThread().getName() + ""+i);
        }

    }
}
class IndivisulThread extends Thread{
    public  void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("solo Thread : " + Thread.currentThread().getName() + ""+i);
        }
    }
}


public class Mutlithreading {
    public static void main(String[] args) {
        SecondThread t1=new SecondThread();
        Mythread t2=new Mythread();
        IndivisulThread t3=new IndivisulThread();
        t3.start();
        t1.start();
        t2.start();


    }
}
