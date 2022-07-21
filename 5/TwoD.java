import java.util.Arrays;

public class TwoD {
    public static void main(String args[]) {
        int t, i;
        int table[][] = new int[3][4];

        for (t = 0; t < 3; t++) {
            for (i = 0; i < 4; i++) {
                table[t][i] = 69;
            }
        }
        System.out.println(Arrays.deepToString(table));
    }
}
