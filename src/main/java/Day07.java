import edu.princeton.cs.algs4.In;

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

    public static long part1I(In in) {
        while (in.hasNextLine()) {
            String lineIn = in.readLine();
            // TODO: the magic happens here...iteratively
        }
        return 0;
    }

    public static long part1R(In in) {
        while (in.hasNextLine()) {
            String lineIn = in.readLine();
            // TODO: the magic happens here...recursively
        }
        return 0;
    }
}
