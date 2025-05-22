import java.io.*;
import java.util.*;

public class JavaHashSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(sc.nextLine());
       for(int i=0;i<n;i++){
            String[] array = sc.nextLine().split(" ");
            Arrays.sort(array);
            set.add(array[0]+" "+array[1]);
            System.out.println(set.size());
            
        }
        sc.close();
    }
}
