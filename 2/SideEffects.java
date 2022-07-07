public class SideEffects {
    public static void main(String args[]) {
        int i = 10;

        if (false & (++i < 100)) // i = 11
            System.out.println("Tik1");
        System.out.println(i);

        if (false && (++i < 100)) // i still = 11 because of "&&"
            System.out.println("Tik2");
        System.out.println(i);
    }
}
