import java.util.Arrays;

public class MinMax {
    public static void main(String args[]) {
        int rand;
        int nums[] = new int[10];
        // Generate array of random integers
        for (int i = 0; i < nums.length; i++) {
            rand = (int) (Math.random() * (10 - 1 + 1) + 1);
            nums[i] = rand;
        }
        System.out.println("Init data:\t" + Arrays.toString(nums));
        // Find max and min
        int min_num, max_num;
        min_num = max_num = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max_num)
                max_num = nums[i];
            if (nums[i] < min_num)
                min_num = nums[i];
        }
        System.out.println("Max num:\t" + max_num + "; Min num:\t" + min_num);
    }
}
