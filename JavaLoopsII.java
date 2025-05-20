import java.io.*;
import java.util.*;

public class JavaLoopsII {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            String ans="";
            int a =sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int res = a;
            for(int j = 0;j<n;j++){
                res+=  Math.pow(2,j) * b;
                ans+=res+" ";
            }
            System.out.println(ans);
            
        }
    }
}
