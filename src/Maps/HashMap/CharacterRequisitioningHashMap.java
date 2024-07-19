package Maps.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CharacterRequisitioningHashMap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=s.nextLine();
        charFrequency(str);
    }
    public static void charFrequency(String s){
        HashMap<Character, Integer> hm=new HashMap<>();
        for (int i=0;i<s.length();i++){
          if (hm.containsKey(s.charAt(i))){
              hm.replace(s.charAt(i),hm.get(s.charAt(i))+1);
            }else {
                hm.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer>e:hm.entrySet()){
            System.out.println(e.getKey()+" --->"+e.getValue());
        }
    }
}
