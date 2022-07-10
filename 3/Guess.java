public class Guess {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("Задумана буква из диапазона A-Z.");
        System.out.println("Попытайтесь её угадать");

        ch = (char) System.in.read();
        if (ch == answer)
            System.out.println("Правильно");
        else {
            System.out.println("Неправильно");
            if (ch > answer) {
                System.out.println("Нужная буква билже к началу алфавита");
            } else {
                System.out.println("Нужная буква билже к концу алфавита");
            }
        }

    }
}
