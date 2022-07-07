class DivsionByZero {
    public static void main(String args[]) {
        int d = 0;
        int number = 993;

        if (d != 0 && (number % d) == 0) {
            System.out.println("~~~:" + number);
        }
        try {
            if (d != 0 & (number % d) == 0) { // error because we divide by zero
                System.out.println("Whops");
            }
        } catch (Exception e) {
            System.out.println("Whops " + e);
        }
    }
}