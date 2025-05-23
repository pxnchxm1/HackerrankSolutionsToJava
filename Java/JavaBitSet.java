import java.util.*;
import java.util.BitSet;
public class JavaBitSet {

    public static String giveCount(BitSet[] a) {
        return a[0].cardinality() + " " + a[1].cardinality();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet[] bitsets = new BitSet[2];
        bitsets[0] = new BitSet(n);
        bitsets[1] = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            switch (op) {
                case "AND":
                    bitsets[x - 1].and(bitsets[y - 1]);
                    break;
                case "OR":
                    bitsets[x - 1].or(bitsets[y - 1]);
                    break;
                case "XOR":
                    bitsets[x - 1].xor(bitsets[y - 1]);
                    break;
                case "FLIP":
                    bitsets[x - 1].flip(y);
                    break;
                case "SET":
                    bitsets[x - 1].set(y);
                    break;
            }

            System.out.println(giveCount(bitsets));
        }

        sc.close();
    }
}

