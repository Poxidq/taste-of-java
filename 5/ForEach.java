public class ForEach {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 4, 5, 6, 7, 993 };
        int sum = 0;
        System.out.println("basic example of using the for-each construction");
        for (int x : nums) {
            System.out.println("Value - " + x);
            sum += x;
        }
        System.out.println("Sum - " + sum);
        System.out.println("example of using the for-each construction for 2d arrays");
        int nums2[][] = new int[3][5];
        sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums2[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int x[] : nums2) {
            for (int y : x) {
                System.out.println("Value - " + y);
                sum += y;
            }
        }
        System.out.println("Sum - " + sum);
    }
}
