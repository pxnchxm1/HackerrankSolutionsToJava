import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static boolean isValid(String str){
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)-str.charAt(i+1)==0){
                return false;
            }
        }
        return true;
    }
    public static String getString(String s ,char a,char b){
        String ans = "";
        for(char c : s.toCharArray()){
            if(c==a || c==b){
                ans+=c;
            }
        }
        return ans.toString();
    }
    public static int alternate(String s) {
        // Write your code here
        int max = 0;
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)!=s.charAt(j)){
                    String string = getString(s,s.charAt(i),s.charAt(j));
                    if(isValid(string)){
                        max = Math.max(max,string.length());
                    }
                }

            }
        }
        return max;
    }

}

public class TwoCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
