import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            List<Integer> temp = new ArrayList<>();
            int size = sc.nextInt();
            while(sc.hasNext() && size!=0){
                temp.add(sc.nextInt());size--;
            }
            list.add(temp);
        }
        int t = sc.nextInt();
        while(t!=0){
            try{
                System.out.println(list.get(sc.nextInt()-1).get(sc.nextInt()-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
           finally{
            t--;
           }
        }
        sc.close();
    }
}
