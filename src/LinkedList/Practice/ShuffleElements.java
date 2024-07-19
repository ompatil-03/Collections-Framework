package LinkedList.Practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ShuffleElements {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
        LinkedList<Integer>ls=new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(7);
        ls.add(8);
        System.out.println("Linked List :"+ls);
        int arr[]=new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            arr[i]=ls.get(i);
        }
        Random rand = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            int index = rand.nextInt(i + 1);
            int g = arr[index];
            arr[index] = arr[i];
            arr[i] = g;
        }
        System.out.println("Shuffled Linked List :");
        System.out.println(Arrays.toString(arr));
    }
}
