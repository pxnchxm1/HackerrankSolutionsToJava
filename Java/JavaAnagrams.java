import java.io.*;
import java.util.*;

public class JavaAnagrams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();String b = sc.nextLine();
        if(a.length()!=b.length()){
            System.out.println("Not Anagrams");
        }else{
            HashMap<Character,Integer> map = new HashMap<>();
        for(char c : a.toLowerCase().toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(char c : b.toLowerCase().toCharArray()){
            if(!map.containsKey(c)){
                System.out.println("Not Anagrams");return;
            }else{
                map.put(c,map.get(c)-1);
            }
        }
        for(int i : map.values()){
            if(i!=0){
              System.out.println("Not Anagrams");return;  
            }
        }
        System.out.println("Anagrams");
        
            

        }
        
    }
}
