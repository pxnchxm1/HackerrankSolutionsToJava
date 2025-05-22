import java.io.*;
import java.util.*;

public class JavaDataTypes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String number = sc.nextLine();
            try{
                long num = Long.parseLong(number);
                System.out.println(num +" can be fitted in:");
                if(num<=Byte.MAX_VALUE && num>=Byte.MIN_VALUE){
                    System.out.println("* byte");
                }if(num<=Short.MAX_VALUE && num>=Short.MIN_VALUE){
                    System.out.println("* short");
                }if(num<=Integer.MAX_VALUE && num>=Integer.MIN_VALUE){
                    System.out.println("* int");
                }if(num<=Long.MAX_VALUE && num>=Long.MIN_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e){
                System.out.println(number + " can't be fitted anywhere.");
            }
                
            
        }
    }
}
