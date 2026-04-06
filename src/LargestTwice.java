import java.util.*;

public class LargestTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int maxIndex = -1;

        // Find largest and second largest
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                maxIndex = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        // Check condition
        if (n == 1 || max >= 2 * secondMax) {
            System.out.println(maxIndex);
        } else {
            System.out.println(-1);
        }
    }
}
