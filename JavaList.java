import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list  = new ArrayList<>();
        int initialsize = sc.nextInt();
        while(initialsize!=0){
            list.add(sc.nextInt());initialsize--;
        }
        int n = sc.nextInt();
        while(n!=0){
            String s = sc.next().toLowerCase();
            switch(s){
                case "insert": {
                    int pos = sc.nextInt();int el = sc.nextInt();
                    list.add(pos,el);
                } break;
                case "delete" : {
                    list.remove(sc.nextInt());
                } break;
                default : System.out.println("Invalid choice");
            }
            n--;
        }
        list.stream().forEach(x->System.out.print(x+" "));
        sc.close();
    }
}
