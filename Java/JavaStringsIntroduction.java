import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(a.length()+b.length());
        if(a.compareTo(b)<=0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        System.out.println(a.substring(0, 1).toUpperCase()+ a.substring(1)+" "+ b.substring(0, 1).toUpperCase()+ b.substring(1));
        sc.close();
    }
}
