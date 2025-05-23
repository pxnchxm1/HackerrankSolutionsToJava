import java.io.*;
import java.util.*;

class Arithmetic{
    int add(int a ,int b){
        return a+b;
    }
}
class Adder extends Arithmetic{
}
public class JavaInheritanceII {

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());
        System.out.println(adder.add(40, 2) + " " + adder.add(10, 3) + " " + adder.add(10, 10));

    }
}