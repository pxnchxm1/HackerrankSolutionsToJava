import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    public  int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int ans=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                ans+=i;
            }
        }return ans;
    }
}
public class JavaInterface {

    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("I implemented: "+ AdvancedArithmetic.class.getSimpleName());
        System.out.println( mc.divisor_sum(sc.nextInt()));

        sc.close();
    }
}