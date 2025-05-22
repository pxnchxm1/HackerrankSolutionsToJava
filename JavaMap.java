import java.io.*;
import java.util.*;

public class JavaMap {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();sc.nextLine();
        while(t!=0){
            map.put(sc.nextLine(),sc.nextLine());
            t--;
        }
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            if(map.containsKey(name)){
                System.out.println(name+"="+map.get(name));
            }else{
                System.out.println("Not found");
            }
                
        }
        sc.close();
    }
}
