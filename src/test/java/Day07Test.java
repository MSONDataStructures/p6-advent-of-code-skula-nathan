import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.princeton.cs.algs4.In;

public class Day07Test {

    @Test
    public void testExampleIterative() {
        In testIn = new In("./input_files/day07ex.txt");
        assertEquals(3749, Day07.part1I(testIn));
    }

    @Test
    public void testExampleRecursive() {
        In testIn = new In("./input_files/day07ex.txt");
        assertEquals(3749, Day07.part1R(testIn));
    }

    @Test
    public void testProblemIterative() {
        In testIn = new In("./input_files/day07p1.txt");
        assertEquals(1582598718861L, Day07.part1I(testIn));
    }

    @Test
    public void testProblemRecursive() {
        In testIn = new In("./input_files/day07p1.txt");
        assertEquals(1582598718861L, Day07.part1R(testIn));
    }
}
