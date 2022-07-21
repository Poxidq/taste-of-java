import java.util.Arrays;

public class Bubble {
    public static void main(String arrgs[]) {
        int rand, t;
        int nums[] = new int[10];
        // Generate array of random integers
        for (int i = 0; i < nums.length; i++) {
            rand = (int) (Math.random() * (10 - 1 + 1) + 1);
            nums[i] = rand;
        }
        System.out.println("Unsorted array:\t" + Arrays.toString(nums));
        for (int a = 0; a < nums.length; a++) {
            for (int b = 0; b < nums.length - a - 1; b++) {
                if (nums[b] > nums[b + 1]) {
                    t = nums[b];
                    nums[b] = nums[b + 1];
                    nums[b + 1] = t;
                }
            }
        }
        System.out.println("Sorted array:\t" + Arrays.toString(nums));
    }
}
