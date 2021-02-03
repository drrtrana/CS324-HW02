import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ArrayInformationTest {

    /*@Test
    void constructor_shouldNotAssignReferenceToField() {
        int[] array = { 1, 9, 4, 8, 6 };
        int[] arrayField = { 1, 9, 4, 8, 6 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertArrayEquals(arrayField, array);
    }*/

    /*@Test
    void findLeftBoundary_shouldReturnLeftBoundaryIfExists() {
        int[] array = { 1, 9, 4, 8, 6 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(4, aInfo.findLeftBoundary(5));
    }*/

    /*@Test
    void findLeftBoundary_shouldReturnNegOneIfNone() {
        int[] array = { 15, 9, 4, 8, 6, 10, 9, 20 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(-1, aInfo.findLeftBoundary(3));
    }*/

    /*@Test
    void findLeftBoundary_shouldFindLeftBoundaryIfEqual() {
        int[] array = { 15, 9, 4, 8, 6, 10, 20, 9};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(9, aInfo.findLeftBoundary(9));
    }*/

    /*@Test
    void findLeftBoundary_evenSizedMiddleLeft() {
        int[] array = { 1, 2, 3, 4};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(2, aInfo.findLeftBoundary(2));
    }*/

    /*@Test
    void findLeftBoundary_evenSizedMiddleRight() {
        int[] array = { 1, 2, 3, 4};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(3, aInfo.findLeftBoundary(3));
    }*/

    /*@Test
    void findLeftBoundary_oddSizedMiddle() {
        int[] array = { 1, 2, 3, 4, 5};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(3, aInfo.findLeftBoundary(3));
    }*/

    /*@Test
    void findRightBoundary_shouldReturnRightBoundaryIfExists() {
        int[] array = { 1, 9, 4, 8, 6 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(6, aInfo.findRightBoundary(5));
    }*/

    /*@Test
    void findRightBoundary_shouldReturnNegOneIfNone() {
        int[] array = { 15, 9, 4, 8, 6, 10, 9, 20 };
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(-1, aInfo.findRightBoundary(22));
    }*/

    /*@Test
    void findRightBoundary_shouldFindRightBoundaryIfEqual() {
        int[] array = { 15, 9, 4, 8, 6, 10, 20, 9};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(9, aInfo.findRightBoundary(9));
    }*/

    /*@Test
    void findRightBoundary_evenSizedMiddleLeft() {
        int[] array = { 1, 2, 3, 4};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(2, aInfo.findRightBoundary(2));
    }*/

    /*@Test
    void findRightBoundary_evenSizedMiddleRight() {
        int[] array = { 1, 2, 3, 4};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(3, aInfo.findRightBoundary(3));
    }*/

    /*@Test
    void findRightBoundary_oddSizedMiddle() {
        int[] array = { 1, 2, 3, 4, 5};
        ArrayInformation aInfo = new ArrayInformation(array);
        assertEquals(3, aInfo.findRightBoundary(3));
    }*/
}