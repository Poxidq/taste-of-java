public class UpCase {
    public static void main(String args[]) {
        char ch;

        for (int i = 0; i < 26; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);
            // 1111111111011111 = 65503 (reset 6 bit of num)
            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }

    }
}
