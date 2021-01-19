import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestAddDiagonals {
    @Test
    void shouldFindSumForOddMatrix() {
        int[][] mat = { {1, 0, 2}, {9, 1, 4}, {-8, 3, 10 } };
//        assertEquals(6, Problem1.addDiagonals(mat));
    }

    @Test
    void shouldFindSumForEvenMatrix() {
        int[][] mat = { {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1} };
//        assertEquals(8, Problem1.addDiagonals(mat));
    }

    @Test
    void shouldFindSumForSmallMatrix() {
        int[][] mat = {{5}};
//        assertEquals(5, Problem1.addDiagonals(mat));
    }
}
