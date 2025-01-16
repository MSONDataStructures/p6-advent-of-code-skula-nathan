import edu.princeton.cs.algs4.In;
import java.lang.Math;

public class Day07 {

    private static final String FILE_PATH =
            "./input_files/day07ex.txt";
            // "./input_files/day07p1.txt";

    public static void main(String[] args) {
        In in = new In(FILE_PATH); // input file
        System.out.print(part1I(in));
        System.out.print(part1R(in));
        //System.out.print(part2(in));
    }

    // Nathan's Part
    public static long part1I(In in) {
        long sum = 0;
        while (in.hasNextLine()) {
            String[] parts = in.readLine().split(": ");
            long target = Long.parseLong(parts[0]);
            String[] numbers = parts[1].split(" ");
            long[] nums = new long[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                nums[i] = Long.parseLong(numbers[i]);
            }
            if (canMakeTargetIteratively(nums, target)) {
                sum += target;
            }
        }
        return sum;
    }

    public static boolean canMakeTargetIteratively(long[] nums, long target) {
        for (long i = 0; i < Math.pow(2,nums.length-1); i++) {

            long result = nums[0];
            for (int j = 1; j < nums.length; j++) {
                if((i % Math.pow(2,j)) / Math.pow(2,j-1) == 0) {
                    result += nums[j];
                } else {
                    result *= nums[j];
                }

            }
            if (result == target) {
                return true;
            }
        }
        return false;
    }

    // Skula's Part
    public static long part1R(In in) {
        long sum = 0;
        while (in.hasNextLine()) {
            String[] parts = in.readLine().split(": ");
            long target = Long.parseLong(parts[0]);
            String[] numbers = parts[1].split(" ");
            long[] nums = new long[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                nums[i] = Long.parseLong(numbers[i]);
            }
            if (canMakeTarget(nums, target, 0, nums[0])) {
                sum += target;
            }
        }
        return sum;
    }

    private static boolean canMakeTarget(long[] nums, long target, int index, long current) {
        // Base case: if we've processed all numbers except the last one
        if (index == nums.length - 1) {
            return current == target;
        }

        // Try addition
        if (canMakeTarget(nums, target, index + 1, current + nums[index + 1])) {
            return true;
        }

        // Try multiplication
        return canMakeTarget(nums, target, index + 1, current * nums[index + 1]);
    }
}
