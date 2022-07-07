public class UseCast {
    public static void main(String args[]) {
        String br = "~";
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " / 3 = " + i / 3);
            System.out.println(i + " / 3 = " + (double) i / 3);
            System.out.println(br.repeat(10));
        }
    }
}
