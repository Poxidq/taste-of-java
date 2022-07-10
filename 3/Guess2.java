
public class Guess2 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, ignore, answer = 'K';
        System.out.println(
                "Задумана буква из диапазона A-Z, попытайтесь угадать ее (можете вводить как заглавные, так и строчные буквы)");
        ch = (char) (System.in.read() & 0x5f);
        while (ch != answer) {
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch > answer) {
                System.out.println("Чуть левее");
            } else {
                System.out.println("Чуть правее");
            }
            System.out.print("Попробуй еще: ");
            ch = (char) (System.in.read() & 0x5f);
        }
        System.out.print("Правильно!");
    }
}
