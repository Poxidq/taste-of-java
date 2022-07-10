class UserDataIn {
    public static void main(String args[])
            throws java.io.IOException {
        char ch;
        System.out.println("Введите любой символ, а затем ENTER");
        ch = (char) System.in.read();
        System.out.println("Вы нажали клавишу " + ch);
    }
}