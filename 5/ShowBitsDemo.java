public class ShowBitsDemo {
    public static void main(String args[]) {
        ShowBits a = new ShowBits(8);
        ShowBits b = new ShowBits(32);
        ShowBits c = new ShowBits(128);

        System.out.println("123 in binary representation:");
        a.show(123);
        System.out.println("\n993 in binary representation:");
        b.show(993);
        System.out.println("\n12220 in binary representation:");
        c.show(80220);
    }
}

class ShowBits {
    int numbits;

    ShowBits(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;

        mask <<= numbits - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0)
                System.out.print("1");
            else
                System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
    }
}