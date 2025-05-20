import java.io.*;
import java.util.*;
import java.util.regex.*;;

public class ValidUsernameRegularExpression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        String pattern = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        while(n!=0){
            if(sc.nextLine().matches(pattern)){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
            n--;
        }
        sc.close();
    }
}
