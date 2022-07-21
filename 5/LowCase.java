public class LowCase {
    public static void main(String args[]) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);
            // 32 = 0000000000[1]00000
            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");

        }
    }
}
