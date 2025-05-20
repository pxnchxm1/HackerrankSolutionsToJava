import java.io.*;
import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String wordrev="";
        for(int i=word.length()-1;i>=0;i--){
            wordrev+=word.charAt(i);
        }
        String ans = word.equals(wordrev) ? "Yes" : "No";
        System.out.println(ans);sc.close();
        
    }
}
