import java.io.*;
import java.util.*;

public class JavaStdinandStdoutII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine(); 
        String s = sc.nextLine();
        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+n);
        sc.close();
    }
}
