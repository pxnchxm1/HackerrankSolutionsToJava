import java.io.*;
import java.util.*;
public class JavaStringTokens {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String sentence = sc.nextLine().trim();
        sc.close();
       
       if(sentence.length()==0) System.out.println(0);
       else{String[] arr = sentence.split("[^a-zA-Z]+");
       System.out.println(arr.length);
       for(String s : arr){
        System.out.println(s);
       }}
      
       
    }
}
