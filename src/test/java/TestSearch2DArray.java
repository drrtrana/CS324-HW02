import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class TestSearch2DArray {

    @Test
    void shouldTestSearchCase1() {
        int[][] nums = {{1,3,5,7},{10,11,16,20}, {23,30,34,60}};
//        assertTrue(Problem3.search2DArray(nums, 3));
    }

    @Test
    void shouldTestSearchCase2() {
        int[][] nums = {{1,3,5,7,9}, {23,30,34,60,75}};
//        assertFalse(Problem3.search2DArray(nums, 13));
    }

    @Test
    void shouldTestSearchCase3() {
        int[][] nums = {{1,3}};
//        assertTrue(Problem3.search2DArray(nums, 1));
    }

    @Test
    void shouldTestSearchCase4() {
        int[][] nums = {{10}};
//        assertFalse(Problem3.search2DArray(nums, 9));
    }

    @Test
    void shouldTestSearchCase5() {
        int[][] nums = {{1,3,5,7},{10,11,16,20}, {23,30,34,60}};
//        assertTrue(Problem3.search2DArray(nums, 16));
    }

    @Test
    void shouldTestSearchCase6() {
        int[][] nums = {{1,3,5,7},{10,11,16,20}, {23,30,34,60}, {71, 80, 92, 93}, {100, 105, 200, 303}};
//        assertTrue(Problem3.search2DArray(nums, 303));
    }

    @Test
    void shouldTestSearchCase7() {
        int[][] nums = {{1,3,5,7},{10,11,16,20}, {23,30,34,60}, {71, 80, 92, 93}, {100, 105, 200, 303}};
//        assertFalse(Problem3.search2DArray(nums, 81));
    }
}