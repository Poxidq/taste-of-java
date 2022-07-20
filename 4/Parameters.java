
public class Parameters {
    public static void main(String args[]) {
        CheckNum chk = new CheckNum();
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - четное число?:\t" + chk.isEven(i));
        }
    }
}

class CheckNum {
    boolean isEven(int x) {
        if ((x % 2) == 0)
            return true;
        else
            return false;
    }
}
