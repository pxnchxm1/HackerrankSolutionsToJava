import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class JavaSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> list = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String details = sc.nextLine();
            list.add(details.split(" "));
        }
        List<String[]> sorted = list.stream()
                .sorted(
                        Comparator
                                .comparing((String[] arr) -> Double.parseDouble(arr[2])).reversed()
                                .thenComparing(arr -> arr[1])
                                .thenComparing(arr -> Integer.parseInt(arr[0]))
                )
                .collect(Collectors.toList());
        sorted.stream().forEach(x->System.out.println(x[1]));
        sc.close();
    }
}