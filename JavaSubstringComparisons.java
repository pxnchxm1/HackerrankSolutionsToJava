import java.io.*;
import java.util.*;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int n = sc.nextInt();
        List<String> words = new ArrayList<>();
        for(int i=0;i<=word.length()-n;i++){
            words.add(word.substring(i,i+n));
        }
        String sm = words.get(0);
        String gr = words.get(0);
       
        for(String s : words){
            if(sm.compareTo(s)>=0){
                sm = s;
            }
            if(gr.compareTo(s)<0){
                gr=s;
            }
        }
        
        System.out.println(sm+"\n"+gr);
        sc.close();
    }
}
