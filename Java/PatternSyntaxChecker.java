import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n!=0){
            try{
                Pattern.compile(sc.nextLine());
                System.out.println("Valid");
            }catch(PatternSyntaxException  e){
                System.out.println("Invalid");
            }
            n--;
        }
        sc.close();
    }
}
