import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@ExtendWith(MockitoExtension.class)
public class TestOnesAtEnd {

    @Test
    void shouldMoveOnesToEndCaseOne() {
        int[] nums = { 1, 9, 1, 4, 5 };
        int[] expNums = { 9, 4, 5, 1, 1 };
//        Problem2.onesAtEnd(nums);
//        assertArrayEquals(expNums, nums);
    }

    @Test
    void shouldMoveOnesToEndCaseTwo() {
        int[] nums = { 0, 1, 1, 4, -2, 1};
        int[] expNums = { 0, 4, -2, 1, 1, 1 };
//        Problem2.onesAtEnd(nums);
//        assertArrayEquals(expNums, nums);
    }

    @Test
    void shouldMoveOnesToEndCaseThree() {
        int[] nums = { 1, 1, 1 };
        int[] expNums = { 1, 1, 1 };
//        Problem2.onesAtEnd(nums);
//        assertArrayEquals(expNums, nums);
    }

    @Test
    void shouldMoveOnesToEndCaseFour() {
        int[] nums = { 10  };
        int[] expNums = { 10 };
//        Problem2.onesAtEnd(nums);
//        assertArrayEquals(expNums, nums);
    }
}