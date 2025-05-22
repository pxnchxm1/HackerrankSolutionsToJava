import java.util.*;

public class JavaGenerics {

    public static <T> void printarray(List<T> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }


    public static void main(String[] args) {
        List<Integer> intarray = new ArrayList<>(Arrays.asList(1,2,3));
        List<String> sttarray = new ArrayList<>(Arrays.asList("Hello","World"));
        printarray(intarray);
        printarray(sttarray);
    }
}