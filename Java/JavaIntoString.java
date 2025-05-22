import java.io.*;
import java.util.*;

public class JavaIntoString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String numstr = Integer.toString(num);
        if(num==Integer.parseInt(numstr)){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
        sc.close();
    }
}
