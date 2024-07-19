package Maps.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String:");
        String str=s.nextLine();
        wordFrequency(str);
    }
    public static void wordFrequency(String s){
        HashMap<String,Integer>hm=new HashMap<>();
        String[]str=s.split(" ");
        for (int i = 0; i < str.length; i++) {
            if (hm.containsKey(str[i])){
                hm.put(str[i],hm.get(str[i])+1);
            }else {
                hm.put(str[i],1);
            }
        }
        System.out.println("The word frequency is :");
        for(Map.Entry<String,Integer>e:hm.entrySet()){
            System.out.println(e.getKey()+" --->"+e.getValue());
        }
    }
}
