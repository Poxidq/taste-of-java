import java.lang.Math;

public class IsPrime {
    public static void main(String args[]) {
        int i, j;
        boolean is_prime;

        for (i = 2; i < 100; i++) {
            is_prime = true;
            for (j = 2; j <= ((int) Math.sqrt(i) + 1); j++) {
                if (i % j == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime == true) {
                System.out.println(i + " is simple number ^-^");
            }
        }
    }
}
