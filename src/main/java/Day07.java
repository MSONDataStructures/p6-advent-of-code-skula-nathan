import edu.princeton.cs.algs4.In;

public class Day07 {

    private static final String FILE_PATH =
            "./input_files/day07ex.txt";
            // "./input_files/day07p1.txt";
            // "./input_files/day07p2.txt";

    public static void main(String[] args) {
        In in = new In(FILE_PATH); // input file
        System.out.print(part1I(in));
        System.out.print(part1R(in));
        // System.out.print(part2(in));
    }

    // Nathan's Part
    public static long part1I(In in) {
        while (in.hasNextLine()) {
            String lineIn = in.readLine();
            // TODO: the magic happens here...iteratively
        }
        return 0;
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

    public static long part2(In in) {
        long sum = 0;
        while (in.hasNextLine()) {
            String[] parts = in.readLine().split(": ");
            long target = Long.parseLong(parts[0]);
            String[] numbers = parts[1].split(" ");
            long[] nums = new long[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                nums[i] = Long.parseLong(numbers[i]);
            }
            if (canMakeTargetWithConcat(nums, target, 0, nums[0])) {
                sum += target;
            }
        }
        return sum;
    }

    private static boolean canMakeTargetWithConcat(long[] nums, long target, int index, long current) {
        // Base case: if we've processed all numbers except the last one
        if (index == nums.length - 1) {
            return current == target;
        }

        // Try addition
        if (canMakeTargetWithConcat(nums, target, index + 1, current + nums[index + 1])) {
            return true;
        }

        // Try multiplication
        if (canMakeTargetWithConcat(nums, target, index + 1, current * nums[index + 1])) {
            return true;
        }

        // Try concatenation
        String concatStr = current + String.valueOf(nums[index + 1]);
        long concatNum = Long.parseLong(concatStr);
        return canMakeTargetWithConcat(nums, target, index + 1, concatNum);
    }
}
